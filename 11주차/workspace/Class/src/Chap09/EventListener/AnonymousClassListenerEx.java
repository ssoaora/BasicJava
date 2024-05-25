package Chap09.EventListener;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AnonymousClassListenerEx extends JFrame {
  public AnonymousClassListenerEx() {
    this.setTitle("Event Listener Example");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Container contentPane = this.getContentPane();
    contentPane.setLayout(new FlowLayout());
    JButton button = new JButton("Action");

    // 익명 클래스 작성
    button.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        if (button.getText().equals("Action")) {
          button.setText("액션");
        }
        else {
          button.setText("Action");
        }
      }
    });
    contentPane.add(button);

    this.setSize(300, 200);
    this.setVisible(true);
  }

  public static void main(String[] args) {
    new AnonymousClassListenerEx();
  }
}
