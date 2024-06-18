/*
전체적인 프로그램 형태는 몬스터 vs 아바타와 아주 유사합니다.
대신 그것과 똑같은 프로그램은 아닙니다.
비슷한 규모의 게임 프로그램 입니다.
메뉴 만들기, 메시지 상자(option pane) 출력이 추가됩니다.
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FinalExam extends JFrame {

  public FinalExam() {
    this.setTitle("Avatar vs Monster");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setContentPane(new GamePanel());
    this.setSize(300, 300);
    this.setVisible(true);
  }

  private class GamePanel extends JPanel {

    JLabel avatar;
    JLabel monster;

    public GamePanel() {
      avatar = new JLabel("🏃");
      monster = new JLabel("👾");

      this.setLayout(null);
      this.addKeyListener(new MyKeyListener());

      avatar.setSize(15, 15);
      avatar.setLocation(50, 50);
      avatar.setForeground(Color.RED);
      this.add(avatar);

      monster.setSize(15, 15);
      monster.setLocation(200, 200);
      this.add(monster);

      // Monster을 움직이는 스레드 생성 및 시작
      MonsterThread mt = new MonsterThread(monster, avatar, 200);
      mt.start();

      this.setFocusable(true);
      this.requestFocus();
    }

    // 아바타 움직임을 처리하는 KeyListener
    class MyKeyListener extends KeyAdapter {
      @Override
      public void keyPressed(KeyEvent e) {

        int keyCode = e.getKeyCode();
        char keyChar = e.getKeyChar();

        if (keyChar == 'q') {
          System.out.println("User ended the game.");
          System.exit(0);
        }

        switch (keyCode) {
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
        avatar.getParent().repaint();
      }
    }
  }

  // 몬스터를 움직이는 스레드
  private class MonsterThread extends Thread {
    JLabel monster;
    JLabel avatar;
    long monsterDelay;
    final int MONSTER_SPEED = 5;

    MonsterThread(JLabel monster, JLabel avatar, long monsterDelay) {
      this.monster = monster;
      this.avatar = avatar;
      this.monsterDelay = monsterDelay;
    }

    @Override
    public void run() {
      while (true) {
        if (monster.getX() < avatar.getX()) {
          monster.setLocation(monster.getX() + MONSTER_SPEED, monster.getY());
        }
        else {
          monster.setLocation(monster.getX() - MONSTER_SPEED, monster.getY());
        }

        if (monster.getY() < avatar.getY()) {
          monster.setLocation(monster.getX(), monster.getY() + MONSTER_SPEED);
        }
        else {
          monster.setLocation(monster.getX(), monster.getY() - MONSTER_SPEED);
        }

        int xDiff = Math.abs(monster.getX() - avatar.getX());
        int yDiff = Math.abs(monster.getY() - avatar.getY());
        if (xDiff < 10 && yDiff < 10) {
          System.out.println("Game Over");
          System.exit(0);
        }
        monster.getParent().repaint();

        try {
          Thread.sleep(monsterDelay);
        }
        catch (InterruptedException e) {
          return;
        }
      }
    }

  }

  public static void main(String[] args) {
    new FinalExam();
  }

}
