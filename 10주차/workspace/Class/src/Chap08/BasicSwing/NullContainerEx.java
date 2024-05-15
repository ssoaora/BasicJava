package Chap08.BasicSwing;

import java.awt.*;
import javax.swing.*;

public class NullContainerEx extends JFrame{
  public NullContainerEx() {
    this.setTitle("Null Container Sample");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Container cp = this.getContentPane();
    cp.setLayout(null);

    JLabel la = new JLabel("Hello, Press Buttons!");
    la.setSize(200, 20);
    la.setLocation(130, 50);
    cp.add(la);

    for (int i = 0; i < 9; i++) {
      JButton btn = new JButton(Integer.toString(i));
      btn.setSize(50, 20);
      btn.setLocation(i * 15, i * 15);
      cp.add(btn);
    }

    this.setSize(300, 200);
    this.setVisible(true);
  }

  public static void main(String[] args) {
    new NullContainerEx();
  }
}
