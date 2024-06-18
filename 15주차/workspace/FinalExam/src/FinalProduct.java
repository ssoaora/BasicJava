import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

public class FinalProduct extends JFrame {

  private boolean isPaused = false;

  public FinalProduct() {
    this.setTitle("Avatar vs Monster");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    createMenu();
    this.setContentPane(new GamePanel());

    this.setLocation(600, 500);
    this.setSize(300, 300);
    this.setVisible(true);
  }

  private class GamePanel extends JPanel {

    static final long monsterDealy = 200;
    final int AVATAR_MOVE = 10;
    JLabel avatar;
    JLabel monster;

    public GamePanel() {
      avatar = new JLabel("🏃");
      monster = new JLabel("👾");

      this.setLayout(null);
      this.addKeyListener(new MyKeyListener());

      avatar.setLocation(50, 50);
      avatar.setSize(15, 15);
      avatar.setForeground(Color.RED);
      this.add(avatar);

      monster.setLocation(200, 5);
      monster.setSize(15, 15);
      this.add(monster);
      MonsterThread th = new MonsterThread(monster, avatar, monsterDealy);
      th.start();

      this.setFocusable(true);
      this.requestFocus();
    }

    class MyKeyListener extends KeyAdapter {

      public void keyPressed(KeyEvent e) {

        if (isPaused) {
          return;
        }

        if (e.getKeyChar() == 'q') {
          System.exit(0);
        }

        switch (e.getKeyCode()) {
          case KeyEvent.VK_UP:
            avatar.setLocation(avatar.getX(), avatar.getY() - AVATAR_MOVE);
            break;

          case KeyEvent.VK_DOWN:
            avatar.setLocation(avatar.getX(), avatar.getY() + AVATAR_MOVE);
            break;

          case KeyEvent.VK_LEFT:
            avatar.setLocation(avatar.getX() - AVATAR_MOVE, avatar.getY());
            break;

          case KeyEvent.VK_RIGHT:
            avatar.setLocation(avatar.getX() + AVATAR_MOVE, avatar.getY());
            break;
        }
        avatar.getParent().repaint();
      }
    }

    ArrayList<MonsterThread> monsterThreads = new ArrayList<>();

    public void resetGame() {

      // Remove all monsters except the original one
      for (Component c : this.getComponents()) {
        if (c instanceof JLabel && c != avatar && c != monster) {
          this.remove(c);
        }
      }

      // Stop all monster threads and clear the list
      for (MonsterThread mt : monsterThreads) {
        mt.interrupt();
      }
      monsterThreads.clear();

      // Reset the avatar's and original monster's position
      avatar.setLocation(50, 50);
      monster.setLocation(200, 5);
    }

    public void addMonster() {
      JLabel newMonster = new JLabel("👾");
      newMonster.setLocation(200, 5);
      newMonster.setSize(15, 15);
      this.add(newMonster);
      MonsterThread th = new MonsterThread(newMonster, avatar, monsterDealy);
      th.start();
      monsterThreads.add(th);
    }
  }

  private class MonsterThread extends Thread {

    JLabel from;
    JLabel to;
    long monsterDelay;
    final int MONSTER_MOVE = 5;

    public MonsterThread(JLabel from, JLabel to, long monsterDelay) {
      this.from = from;
      this.to = to;
      this.monsterDelay = monsterDelay;
    }

    @Override
    public void run() {
      // 현재 괴물의 위치
      int x = from.getX();
      int y = from.getY();

      while (true) {

        // Check if the game is paused at the start of each loop iteration
        while (isPaused) {
          try {
            Thread.sleep(100);
          }
          catch (InterruptedException e) {
            return;
          }
        }

        if (from.getX() > to.getX()) {
          x = from.getX() - MONSTER_MOVE;
        }
        else {
          x  = from.getX() + MONSTER_MOVE;
        }

        if (from.getY() > to.getY()) {
          y = from.getY() - MONSTER_MOVE;
        }
        else {
          y = from.getY() + MONSTER_MOVE;
        }
        from.setLocation(x, y);

        int gapX = Math.abs(to.getX() - from.getX());
        int gapY = Math.abs(to.getY() - from.getY());
        if (gapX < 10 && gapY < 10) {
          JOptionPane.showMessageDialog(null, "Game Over", "Game Over", JOptionPane.INFORMATION_MESSAGE);
          System.exit(0);
        }
        else {
          setTitle("Avatar Alived!");
        }

        from.getParent().repaint();

        try {
          sleep(monsterDelay);
        }
        catch (InterruptedException e) {
          return;
        }
      }
    }
  }

  private void createMenu() {

    JMenuBar mb = new JMenuBar();
    JMenuItem[] menuItem = new JMenuItem[4];
    String[] itemTitle = {"New Game", "Add Monster", "Pause / Resume", "Quit"};
    JMenu menu = new JMenu("Option");

    MenuActionListener listener = new MenuActionListener();

    for (int i = 0; i < menuItem.length; i++) {
      menuItem[i] = new JMenuItem(itemTitle[i]);
      menuItem[i].addActionListener(listener);

      menu.add(menuItem[i]);
    }

    mb.add(menu);
    setJMenuBar(mb);
  }

  private class MenuActionListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
      String cmd = e.getActionCommand();

      switch (cmd) {
        case "New Game":
          ((GamePanel) getContentPane()).resetGame();
          break;

        case "Add Monster":
          ((GamePanel) getContentPane()).addMonster();
          break;

        case "Pause / Resume":
          isPaused = !isPaused;
          break;

        case "Quit":
          System.exit(0);
          break;
      }
    }
  }

  public static void main(String[] args) {
    new FinalProduct();
  }
}
