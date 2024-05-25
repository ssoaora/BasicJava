package Chap09.MouseListener;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

public class MouseEventAllEx extends JFrame {

  JLabel lbl = new JLabel("   Move Me");

  public MouseEventAllEx() {
    super("마우스 이벤트 예제");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Container cp = getContentPane();
    MyMouseListener listener = new MyMouseListener();
    cp.addMouseListener(listener);
    cp.addMouseMotionListener(listener);
    cp.setLayout(null);

    lbl.setSize(80, 20);
    lbl.setLocation(100, 80);
    cp.add(lbl);

    setSize(320, 200);
    setVisible(true);
  }

  private class MyMouseListener implements MouseListener, MouseMotionListener {

    // MouseListener의 2개 메소드 구현
    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
      lbl.setLocation(e.getX(), e.getY());
      setTitle("mousePressed(" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
      lbl.setLocation(e.getX(), e.getY());
      setTitle("mouseReleased(" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
      Component comp = (Component)e.getSource();
      comp.setBackground(Color.CYAN);
    }

    @Override
    public void mouseExited(MouseEvent e) {
      Component comp = (Component)e.getSource();
      comp.setBackground(Color.YELLOW);
      setTitle("mouseExited(" + e.getX() + ", " + e.getY() + ")");
    }

    // MouseMotionListener의 2개 메소드 구현
    @Override
    public void mouseDragged(MouseEvent e) {
      lbl.setLocation(e.getX(), e.getY());
      setTitle("mouseDragged(" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mouseMoved(MouseEvent e) {
      lbl.setLocation(e.getX(), e.getY());
      setTitle("mouseMoved(" + e.getX() + ", " + e.getY() + ")");
    }
  }

  public static void main(String[] args) {
    new MouseEventAllEx();
  }
}
