package Chap09.EventListener;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class IndepClassListenerEx extends JFrame {
  public IndepClassListenerEx() {
    this.setTitle("Event Listener Example");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Container contentPane = this.getContentPane();
    contentPane.setLayout(new FlowLayout());

    JButton button = new JButton("Action");
    button.addActionListener(new MyActionListener());
    contentPane.add(button);

    this.setSize(300, 200);
    this.setVisible(true);
  }

  public static void main(String[] args) {
    new IndepClassListenerEx();
  }
}

// 독립 클래스 작성
class MyActionListener implements ActionListener {

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
}
