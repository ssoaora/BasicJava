// 스레드를 이용하여, 화면에 눈이 내리는 효과 연출

import java.awt.*;
import java.util.Vector;
import javax.swing.*;

public class Example10 extends JFrame {

  Thread snowThread;

  public Example10() {
    this.setTitle("눈 내리는 풍경");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    SnowPanel p = new SnowPanel();
    this.setContentPane(p);

    this.setResizable(false);
    this.setSize(500, 500);
    this.setLocation(500, 500);
    this.setVisible(true);

    snowThread = new Thread(p);
    snowThread.start();
  }

  public static void main(String[] args) {
    new Example10();
  }
}

class SnowPanel extends JPanel implements Runnable {

  Vector<Point> v = new Vector<>();

  public SnowPanel() {
    this.setLayout(null);

    for (int i = 0; i < 50; i++) {
      int x = (int) (Math.random() * 500);
      int y = (int) (Math.random() * 500);
      v.add(new Point(x, y));
    }
  }

  public void paint(Graphics g) {
    super.paint(g);
    ImageIcon icon = new ImageIcon("assets/background.jpg");
    Image img = icon.getImage();
    g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);

    g.setColor(Color.WHITE);
    for (int i = 0; i < v.size(); i++) {
      Point p = v.get(i);
      g.fillOval((int) p.getX(), (int) p.getY(), 10, 10);
    }
  }

  public void changeSnowPosition() {
    for (int i = 0; i < v.size(); i++) {
      Point p = v.get(i);
      p.x += (int) (Math.random() * 2);
      p.y += (int) (Math.random() * 5);

      if (p.x > 500) {
        p.x = 0;
      }
      if (p.y > 500) {
        p.y = 0;
      }
      v.set(i, p);
    }
  }

  @Override
  public void run() {
    while (true) {
      try {
        Thread.sleep(50);
      }
      catch (InterruptedException e) {
        return;
      }

      changeSnowPosition();
      repaint();
    }
  }
}
