package Chap09.KeyListener;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Rainbow extends JFrame {

  private JLabel lbl = new JLabel("<Enter>키로 배경색이 바뀝니다.");

  public Rainbow() {
    this.setTitle("RAINBOW");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Container cp = getContentPane();
    cp.setLayout(new FlowLayout());
    cp.add(lbl);
    cp.addKeyListener(new MyKeyListener());

    this.setSize(500, 500);
    this.setVisible(true);

    cp.setFocusable(true);
    cp.requestFocus();
  }

  private class MyKeyListener extends KeyAdapter {

    @Override
    public void keyPressed(KeyEvent e) {
      int r = (int)(Math.random() * 256);
      int g = (int)(Math.random() * 256);
      int b = (int)(Math.random() * 256);

      switch (e.getKeyChar()) {
        case '\n':
          lbl.setText("r=" + r + ", g=" + g + ", b=" + b);
          getContentPane().setBackground(new Color(r, g, b));
          break;

        case 'q':
          System.exit(0);
      }
    }
  }

  public static void main(String[] args) {
    new Rainbow();
  }

}
