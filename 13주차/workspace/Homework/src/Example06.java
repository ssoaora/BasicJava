// 사용자가 임의의 위치에 마우스를 클릭하면, 하나의 버블을 만들고 위로 움직인다.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Example06 extends JFrame {
  public Example06() {
    this.setTitle("버블 게임");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    GamePanel gamePanel = new GamePanel();
    this.setContentPane(gamePanel);

    this.setLayout(null);
    this.setSize(1000, 1000);
    this.setLocation(500, 500);
    this.setResizable(false);
    this.setVisible(true);
  }

  public static void main(String[] args) {
    new Example06();
  }
}

class GamePanel extends JPanel {
  TargetThread targetThread = null;
  Bubble bubble = null;

  public GamePanel() {
    this.addMouseListener(new MouseAdapter() {
      @Override
      public void mousePressed(MouseEvent e) {
        bubble = new Bubble();
        GamePanel.this.add(bubble);
        bubble.setLocation(e.getPoint());
        GamePanel.this.startGame();
      }
    });
  }

public void startGame() {
    if (bubble != null) {
      targetThread = new TargetThread(bubble);
      targetThread.start();
    }
  }
}

class Bubble extends JLabel {
  public Bubble() {
    this.setSize(50, 50);
  }

  public void paint(Graphics g) {
    super.paint(g);
    ImageIcon icon = new ImageIcon("assets/bubble.png");
    Image img = icon.getImage();
    g.drawImage(img, 0, 0, 50, 50, this);
  }
}

class TargetThread extends Thread {
  Bubble obj;

  public TargetThread(Bubble obj) {
    this.obj = obj;
  }

  @Override
  public void run() {
    while (true) {
      int x = obj.getX();
      int y = obj.getY() - 5;

      // 영역 바깥으로 나갔을 때 처리
      if (y + obj.getHeight() + 10 < 0) {
        obj = null;
        return;
      }
      else {
        obj.setLocation(x, y);
      }

      try {
        sleep(20);
      }
      catch (InterruptedException e) {}
    }
  }
}
