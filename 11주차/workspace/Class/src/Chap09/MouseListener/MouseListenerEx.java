package Chap09.MouseListener;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class MouseListenerEx extends JFrame {

  // 접근 범위를 전역으로 설정
  JLabel lbl = new JLabel("Hello");

  /*
  외부 클래스인 경우.
  class MyMouseListener implements MouseListener {
    JLabel lbl;
    MyMouseListener(JLabel lbl) {
      this.lbl = lbl;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
      int x = e.getX();
      int y = e.getY();

      lbl.setLocation(x, y);
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
  }
  */

  public MouseListenerEx() {
    this.setTitle("Mouse Event Example");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Container cp = getContentPane();
    cp.setLayout(null);

    // lbl.setSize(50, 20);
    // lbl.setLocation(50, 50);
    lbl.setBounds(50, 50, 50, 20);
    cp.add(lbl);
    cp.addMouseListener(new MouseListener() {
      @Override
      public void mouseClicked(MouseEvent e) {
        lbl.setLocation(e.getX(), e.getY());
      }

      @Override
      public void mousePressed(MouseEvent e) {
      }

      @Override
      public void mouseReleased(MouseEvent e) {
      }

      @Override
      public void mouseEntered(MouseEvent e) {
      }

      @Override
      public void mouseExited(MouseEvent e) {
      }

    });

    this.setSize(300, 300);
    this.setVisible(true);
  }

  /*
  내부 클래스인 경우.
  class MyMouseListener implements MouseListener {
    @Override
    public void mouseClicked(MouseEvent e) {
      int x = e.getX();
      int y = e.getY();

      lbl.setLocation(x, y);
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
  }
  */

  public static void main(String[] args) {
    new MouseListenerEx();
  }
}
