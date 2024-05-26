package Chap11.Graphics;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

public class GraphicsDrawOvalMouseEx extends JFrame {
  public GraphicsDrawOvalMouseEx() {
    this.setTitle("마우스 드래깅으로 타원 그리기 예제");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    setContentPane(new MyPanel());

    this.setSize(300, 300);
    this.setVisible(true);
  }

  public static void main(String[] args) {
    new GraphicsDrawOvalMouseEx();
  }

  private class MyPanel extends JPanel {
    private Point start = null, end = null;

    public MyPanel() {
      MyMouseListener listener = new MyMouseListener();
      addMouseListener(listener);
      addMouseMotionListener(listener);
    }

    private class MyMouseListener extends MouseAdapter {
      @Override
      public void mousePressed(MouseEvent e) {
        start = e.getPoint();
      }

      @Override
      public void mouseDragged(MouseEvent e) {
        end = e.getPoint();
        repaint();
      }
    }

    @Override
    public void paintComponent(Graphics g) {
      super.paintComponent(g);
      if (start == null) {
        return;
      }

      g.setColor(Color.BLUE);
      int x = Math.min(start.x, end.x);
      int y = Math.min(start.y, end.y);
      int width = Math.abs(start.x - end.x);
      int height = Math.abs(start.y - end.y);
      g.drawOval(x, y, width, height);
    }
  }
}
