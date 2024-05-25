package Chap10.JComponent;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

public class JComponentEx extends JFrame {

  public JComponentEx() {
    this.setTitle("JComponent의 공통 메소드 예제");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Container cp = getContentPane();
    cp.setLayout(new FlowLayout());

    JButton b1 = new JButton("Magenta/Yellow Button");
    JButton b2 = new JButton("   Disabled Button   ");
    JButton b3 = new JButton("getX(), getY()");

    b1.setBackground(Color.YELLOW);
    b1.setForeground(Color.MAGENTA);
    b1.setFont(new Font("Arial", Font.ITALIC, 20));
    b2.setEnabled(false);
    b3.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        JButton btn = (JButton) e.getSource();
        setTitle(btn.getX() + "," + btn.getY());
      }
    });

    cp.add(b1);
    cp.add(b2);
    cp.add(b3);

    this.setSize(260, 200);
    this.setVisible(true);
  }

  public static void main(String[] args) {
    new JComponentEx();
  }
}
