package Chap10.JLabel;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

public class LabelEx extends JFrame {

  public LabelEx() {
    this.setTitle("JLabel 예제");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Container cp = getContentPane();
    cp.setLayout(new FlowLayout());

    JLabel textLabel = new JLabel("Sun's getting real low.");
    JLabel imageLabel = new JLabel(new ImageIcon("images/sunset.jpg"));
    JLabel label = new JLabel("커피한잔 하실래예, 전화주이소", new ImageIcon("images/choko.jpg"), SwingConstants.CENTER);

    cp.add(textLabel);
    cp.add(imageLabel);
    cp.add(label);

    this.setSize(300, 500);
    this.setVisible(true);
  }

  public static void main(String[] args) {
    new LabelEx();
  }
}
