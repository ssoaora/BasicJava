// 사용자가 ENTER 키를 누르면 총알이 발사되고 , 목표물을 맞추는 게임 슈팅게임 만들기

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;
import javax.swing.*;

public class Example05 extends JFrame {

  public Example05() {
    super("슈팅게임");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    GamePanel gamePanel = new GamePanel();
    this.setContentPane(gamePanel);

    this.setSize(300, 300);
    this.setLocation(500, 400);
    this.setResizable(false);
    this.setVisible(true);

    gamePanel.startGame();
  }

  private class GamePanel extends JPanel {

    TargetThread targetThread = null;
    JLabel base = new JLabel();
    JLabel bullet = new JLabel();
    JLabel target;
    AudioClip sound;

    public GamePanel() {
      this.setLayout(null);

      base.setSize(40, 40);
      base.setOpaque(true);
      base.setBackground(Color.BLACK);

      ImageIcon img = new ImageIcon("assets/ufo.png");
      target = new JLabel(img);
      target.setSize(img.getIconWidth(), img.getIconHeight());

      bullet.setSize(10, 10);
      bullet.setOpaque(true);
      bullet.setBackground(Color.RED);

      this.add(base);
      this.add(bullet);
      this.add(target);

      URL url = getClass().getResource("fire.wav");
      sound = Applet.newAudioClip(url);

      this.setFocusable(true);
      this.requestFocusInWindow();
      this.addKeyListener(new KeyAdapter() {
        @Override
        public void keyPressed(KeyEvent e) {
          BulletThread bulletThread = null;

          // 엔터키가 눌려지면 총알을 쏘는 스레드 실행을 요청하고 소리를 재생한다 (Action 리스너)
          if (e.getKeyChar() == '\n') {
            if (bulletThread == null || !bulletThread.isAlive()) {
              sound.play();
              bulletThread = new BulletThread(bullet, target, targetThread);
              bulletThread.start();
            }
          }
        }
      });
    }

    public void startGame() {
      // 레이블들의 위치 지정
      base.setLocation(this.getWidth() / 2 - 20, this.getHeight() - 40);
      bullet.setLocation(this.getWidth() / 2 - 5, this.getHeight() - 50);
      target.setLocation(0, 0);

      // 목표물을 움직이도록 스레드 실행을 요청한다
      targetThread = new TargetThread(target);
      targetThread.start();
    }

    class TargetThread extends Thread {
      JComponent target;

      public TargetThread(JComponent target) {
        this.target = target;
        target.setLocation(0, 0);
      }

      @Override
      public void run() {
        while (true) {
          int x = target.getX() + 5;
          int y = target.getY();

          if (x > GamePanel.this.getWidth()) {
            target.setLocation(0, 0);
          }
          else {
            target.setLocation(x, y);
          }

          try {
            sleep(20);
          }
          catch (InterruptedException e) {
            target.setLocation(0, 0);
            try {
              sleep(500);
            }
            catch (InterruptedException e2) {}
          }
        }
      }
    }

    class BulletThread extends Thread {
      JComponent bullet;
      JComponent target;
      Thread targetThread;

      public BulletThread(JComponent bullet, JComponent target, Thread targetThread) {
        this.bullet = bullet;
        this.target = target;
        this.targetThread = targetThread;
      }

      @Override
      public void run() {
        while (true) {
          // 명중
          if (hit()) {
            targetThread.interrupt();
            bullet.setLocation(bullet.getParent().getWidth() / 2 - 5, bullet.getParent().getHeight() - 50);
            return;
          }
          else {
            int x = bullet.getX();
            int y = bullet.getY() - 5;

            // 영역 밖으로 나가면
            if (y < 0) {
              bullet.setLocation(bullet.getParent().getWidth() / 2 - 5, bullet.getParent().getHeight() - 50);
              return;
            }
            else {
              bullet.setLocation(x, y);
            }
          }
          try {
            sleep(20);
          }
          catch (InterruptedException e) {}
        }
      }

      private boolean hit() {
        if (contains(bullet.getX(), bullet.getY()) ||
            contains(bullet.getX() + bullet.getWidth() -1, bullet.getY()) ||
            contains(bullet.getX() + bullet.getWidth() -1, bullet.getY() + bullet.getHeight() - 1) ||
            contains(bullet.getX(), bullet.getY() + bullet.getHeight() - 1)) {
          return true;
        }
        else {
          return false;
        }
      }

      private boolean contains(int x, int y) {
        if (target.getX() <= x && x <= target.getX() + target.getWidth() &&
            target.getY() <= y && y <= target.getY() + target.getHeight()) {
          return true;
        }
        else {
          return false;
        }
      }
    }
  }

  public static void main(String[] args) {
    new Example05();
  }

}
