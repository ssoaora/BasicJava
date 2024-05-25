// MouseAdapter를 이용한 마우스 이벤트 처리
package Chap09.MouseListener;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class FromScratch extends JFrame {
  JLabel lbl = new JLabel("Hello");

  public FromScratch() {
    this.setTitle("Mouse Event Example");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Container cp = getContentPane();
    cp.addMouseListener(new ThisMouseAdapter());
    cp.setLayout(null);

    lbl.setSize(50, 20);
    lbl.setLocation(30, 30);
    cp.add(lbl);

    this.setSize(500, 500);
    this.setVisible(true);
  }

  class ThisMouseAdapter extends MouseAdapter {

    @Override
    public void mousePressed(MouseEvent e) {
      int x = e.getX();
      int y = e.getY();
      lbl.setLocation(x, y);
    }
  }

  public static void main(String[] args) {
    new FromScratch();
  }
}
