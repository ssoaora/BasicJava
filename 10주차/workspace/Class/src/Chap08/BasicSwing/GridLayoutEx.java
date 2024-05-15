package Chap08.BasicSwing;

import java.awt.*;
import javax.swing.*;

public class GridLayoutEx extends JFrame {
  public GridLayoutEx() {
    this.setTitle("GridLayout Sample");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Container cp = this.getContentPane();
    cp.setLayout(new GridLayout(1, 10));

    for (int i = 0; i < 10; i++) {
      String text = Integer.toString(i);
      JButton button = new JButton(text);
      cp.add(button);
    }

    this.setSize(500, 200);
    this.setVisible(true);
  }

  public static void main(String[] args) {
    new GridLayoutEx();
  }
}
