// 사용자가 상하좌우키를 움직이면, 스네이크가 상하좌우로 움직인다.

import java.awt.*;
import java.awt.event.*;
import java.util.Vector;
import javax.swing.*;

public class Example09 {

  public static void main(String[] args) {
    new SnakeGameFrame();
  }

}

class SnakeGameFrame extends JFrame {

  Thread snakeThread;
  GroundPanel p;

  public SnakeGameFrame() {
    this.setTitle("스네이크 움직이기");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    p = new GroundPanel();
    p.setFocusable(true);

    this.setContentPane(p);
    this.setSize(400, 400);
    this.setLocation(500, 500);
    this.setVisible(true);

    p.requestFocus();
    snakeThread = new Thread(p);
    snakeThread.start();
  }

  class GroundPanel extends JPanel implements Runnable {

    static final int LEFT = 0;
    static final int RIGHT = 1;
    static final int UP = 2;
    static final int DOWN = 3;
    static final int delay = 200;
    int direction;
    SnakeBody snakeBody;

    public GroundPanel() {
      this.setLayout(null);
      snakeBody = new SnakeBody();
      snakeBody.addIn(this);  // 패널에 Vector에 기억된 스네이크 레이블들을 추가
      direction = LEFT; // 초기 방향
      this.addKeyListener(new MyKeyListener());
    }

    @Override
    public void paintComponent(Graphics g) {
      super.paintComponent(g);
      ImageIcon icon = new ImageIcon("assets/bg.jpg");
      Image img = icon.getImage();
      g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), null);
    }

    @Override
    public void run() {

      while (true) {
        try {
          Thread.sleep(delay);
          snakeBody.move(direction);
        }
        catch (InterruptedException e) {
          return;
        }
      }

    }

    class MyKeyListener extends KeyAdapter {

      @Override
      public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
          case KeyEvent.VK_LEFT:
            direction = LEFT;
            break;

          case KeyEvent.VK_RIGHT:
            direction = RIGHT;
            break;

          case KeyEvent.VK_UP:
            direction = UP;
            break;

          case KeyEvent.VK_DOWN:
            direction = DOWN;
            break;
        }
      }
    }
  }

  class SnakeBody {

    Vector<JLabel> v = new Vector<>();

    public SnakeBody() {
      ImageIcon head = new ImageIcon("assets/head.png");
      JLabel label = new JLabel(head);
      label.setSize(head.getIconWidth(), head.getIconHeight());
      label.setLocation(100, 100);
      v.add(label);

      ImageIcon body = new ImageIcon("assets/body.png");
      for (int i = 1; i < 10; i++) {
        label = new JLabel(body);
        label.setSize(body.getIconWidth(), body.getIconHeight());
        label.setLocation(100 + i * 50, 100);
        v.add(label);
      }
    }

    public void addIn(JPanel p) {
      for (int i = 0; i < v.size(); i++) {
        p.add(v.get(i));
      }
    }

    public void move(int direction) {

      // 꼬리 이동
      for (int i = v.size() - 1; i > 0; i--) {
        JLabel b = v.get(i);
        JLabel a = v.get(i - 1);
        b.setLocation(a.getX(), a.getY());
      }

      // 머리 이동
      JLabel head = v.get(0);
      switch (direction) {
        case GroundPanel.LEFT:
          head.setLocation(head.getX() - 50, head.getY());
          break;

        case GroundPanel.RIGHT:
          head.setLocation(head.getX() + 50, head.getY());
          break;

        case GroundPanel.UP:
          head.setLocation(head.getX(), head.getY() - 50);
          break;

        case GroundPanel.DOWN:
          head.setLocation(head.getX(), head.getY() + 50);
          break;
      }
    }

  }
}
