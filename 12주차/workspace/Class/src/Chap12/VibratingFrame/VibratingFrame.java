package Chap12.VibratingFrame;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;

public class VibratingFrame extends JFrame implements Runnable {

  private Thread th;

  public VibratingFrame() {
    this.setTitle("진동하는 프레임 만들기");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocation(300, 300);
    this.setSize(500, 500);
    this.setVisible(true);

    getContentPane().addMouseListener(new MouseAdapter() {
      @Override
      public void mousePressed(MouseEvent e) {
        if (th != null && th.isAlive()) {
          th.interrupt();
          th = null;
        }
        else {
          th = new Thread(VibratingFrame.this);
          th.start();
        }
      }
    });

    th = new Thread(this);
    th.start();
  }

  @Override
  public void run() {
    Random r = new Random();

    while (true) {

      try {
        Thread.sleep(20);
      }
      catch (InterruptedException e) {
        return;
      }

      int x = this.getX() + r.nextInt()%5;
      int y = this.getY() + r.nextInt()%5;
      setLocation(x, y);
    }
  }

  public static void main(String[] args) {
    new VibratingFrame();
  }
}
