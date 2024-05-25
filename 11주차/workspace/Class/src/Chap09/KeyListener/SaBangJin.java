package Chap09.KeyListener;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SaBangJin extends JFrame {

  private JLabel lbl = new JLabel("사방향 키를 입력해주세요.");

  public SaBangJin() {
    super("사방진");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Container cp = getContentPane();
    cp.setLayout(null);
    cp.addKeyListener(new MyKeyListener());

    lbl.setLocation(50, 50);
    lbl.setSize(200, 20);
    cp.add(lbl);

    this.setSize(500, 500);
    this.setVisible(true);

    cp.setFocusable(true);
    cp.requestFocus();
  }

  private class MyKeyListener extends KeyAdapter {

    @Override
    public void keyPressed(KeyEvent e) {
      int keyCode = e.getKeyCode();

      switch (keyCode) {
        case KeyEvent.VK_UP:
          lbl.setLocation(lbl.getX(), lbl.getY() - 10);
          break;

        case KeyEvent.VK_DOWN:
          lbl.setLocation(lbl.getX(), lbl.getY() + 10);
          break;

        case KeyEvent.VK_LEFT:
          lbl.setLocation(lbl.getX() - 10, lbl.getY());
          break;

        case KeyEvent.VK_RIGHT:
          lbl.setLocation(lbl.getX() + 10, lbl.getY());
          break;
      }
    }
  }

  public static void main(String[] args) {
    new SaBangJin();
  }
}
