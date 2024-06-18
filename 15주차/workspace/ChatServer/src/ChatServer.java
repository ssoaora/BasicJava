import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ChatServer extends JFrame implements ActionListener {

  BufferedReader in = null;
  BufferedWriter out = null;
  ServerSocket server = null;
  Socket socket = null;

  MsgViewer msgView;
  JTextField msgInput;

  public ChatServer() {
    this.setTitle("서버 채팅 창");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(new BorderLayout());

    msgView = new MsgViewer();
    msgView.setEditable(false);
    JScrollPane sp = new JScrollPane(msgView);

    Thread th = new Thread(msgView);

    msgInput = new JTextField();
    msgInput.addActionListener(this);

    this.add(sp, BorderLayout.CENTER);
    this.add(msgInput, BorderLayout.SOUTH);

    this.setLocation(700, 400);
    this.setSize(600, 400);
    this.setVisible(true);
    msgInput.requestFocus();

    try {
      server = new ServerSocket(9999);
      socket = server.accept();
      System.out.println("연결됨");

      in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
      out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
    }
    catch (IOException e) {
      System.out.println(e.getMessage());
      System.exit(1);
    }
    th.start();
  }

  private class MsgViewer extends JTextArea implements Runnable {

    @Override
    public void run() {
      String msg = null;

      while (true) {
        try {
          msg = in.readLine();
        }
        catch (IOException e) {
          System.out.println(e.getMessage());
          System.exit(1);
        }
        msgView.append("\n" + msg);
        int pos = msgView.getText().length();
        msgView.setCaretPosition(pos);
      }
    }
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == msgInput) {
      String msg = msgInput.getText();

      try {
        out.write("서버> " + msg + "\n");
        out.flush();
        msgView.append("\n서버> " + msg);

        int pos = msgView.getText().length();
        msgView.setCaretPosition(pos);
        msgInput.setText(null);
      }
      catch (IOException e1) {
        System.out.println(e1.getMessage());
        System.exit(1);
      }
    }
  }

  public static void main(String[] args) {
    new ChatServer();
  }
}
