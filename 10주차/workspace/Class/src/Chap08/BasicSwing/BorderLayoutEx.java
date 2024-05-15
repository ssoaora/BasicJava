package Chap08.BasicSwing;

import java.awt.*;
import javax.swing.*;

public class BorderLayoutEx extends JFrame {
  public BorderLayoutEx() {
    this.setTitle("BorderLayout Sample");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Container cp = this.getContentPane();
    cp.setLayout(new BorderLayout(30, 20));

    cp.add(new JButton("Calculate"), BorderLayout.CENTER);
    cp.add(new JButton("add"), BorderLayout.NORTH);
    cp.add(new JButton("sub"), BorderLayout.SOUTH);
    cp.add(new JButton("mul"), BorderLayout.EAST);
    cp.add(new JButton("div"), BorderLayout.WEST);

    this.setSize(300, 200);
    this.setVisible(true);
  }

  public static void main(String[] args) {
    new BorderLayoutEx();
  }
}
