package Chap08.BasicSwing;

import java.awt.*;
import javax.swing.*;

public class FlowLayoutEx extends JFrame {
  public FlowLayoutEx() {
    this.setTitle("FlowLayout Sample");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Container cp = this.getContentPane();
    cp.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40));

    cp.add(new JButton("add"));
    cp.add(new JButton("sub"));
    cp.add(new JButton("mul"));
    cp.add(new JButton("div"));
    cp.add(new JButton("Calculate"));

    this.setSize(300, 200);
    this.setVisible(true);
  }

  public static void main(String[] args) {
    new FlowLayoutEx();
  }
}
