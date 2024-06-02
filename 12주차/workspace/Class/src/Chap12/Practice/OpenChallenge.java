// 아바타 - 몬스터 게임 using Swing and Thread

package Chap12.Practice;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class OpenChallenge extends JFrame {

  public OpenChallenge() {
    this.setTitle("Avatar Alive!!");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setContentPane(new GamePanel());
    this.setSize(300, 300);
    this.setVisible(true);
  }

  class GamePanel extends JPanel {
    JLabel avatar;
    JLabel monster;

    public GamePanel() {
      avatar = new JLabel("🏃");
      avatar.setSize(15, 15);
      avatar.setLocation(50, 50);
      avatar.setForeground(Color.RED);

      monster = new JLabel("👾");
      monster.setSize(15, 15);
      monster.setLocation(150, 150);

      this.setLayout(null);

      this.add(avatar);
      this.add(monster);

      this.addKeyListener(new MyKeyListener());
      this.setFocusable(true);
      this.requestFocus();
    }

    class MyKeyListener extends KeyAdapter {
      @Override
      public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        switch(keyCode) {
          case KeyEvent.VK_UP:
            avatar.setLocation(avatar.getX(), avatar.getY() - 10);
            break;
          case KeyEvent.VK_DOWN:
            avatar.setLocation(avatar.getX(), avatar.getY() + 10);
            break;
          case KeyEvent.VK_LEFT:
            avatar.setLocation(avatar.getX() - 10, avatar.getY());
            break;
          case KeyEvent.VK_RIGHT:
            avatar.setLocation(avatar.getX() + 10, avatar.getY());
            break;
        }
      }
    }
  }

  class MonsterThread extends Thread {

  }

  public static void main(String[] args) {
    new OpenChallenge();
  }

}
