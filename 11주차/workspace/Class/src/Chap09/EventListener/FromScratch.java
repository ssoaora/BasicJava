package Chap09.EventListener;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class FromScratch extends JFrame {

  public FromScratch() {
    this.setTitle("Event Listener Example");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Container cp = getContentPane();
    cp.setLayout(new FlowLayout());

    JButton btn = new JButton("Action");
    btn.addActionListener(new ThisActionListener());
    cp.add(btn);

    this.setSize(300, 200);
    this.setVisible(true);
  }

  public static void main(String[] args) {
    new FromScratch();
  }
}

class ThisActionListener implements ActionListener {
  @Override
  public void actionPerformed(ActionEvent e) {
    JButton btn = (JButton)e.getSource();
    if(btn.getText().equals("Action")) {
      btn.setText("액션");
    }
    else {
      btn.setText("Action");
    }
  }
}
