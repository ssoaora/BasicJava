// 레이블을 클릭하면 0.1초에 1씩 증가하는 카운팅(0부터 시작), 다시 클릭하면 카운팅 중지

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Example02 extends JFrame {
  JLabel label;
  TimerThread th = null;

  public Example02() {
    this.setTitle("디지털 타이머");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(300, 160);

    label = new JLabel();
    label.setFont(new Font("Gothic", Font.ITALIC, 80));

    this.setLayout(new FlowLayout());
    th = new TimerThread(label);
    label.requestFocus();
    label.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent e) {
        if (th.isAlive()) {
          th.interrupt();
        }
        else {
          th = new TimerThread(label);
          th.start();
        }
      }
    });

    this.add(label);
    this.setVisible(true);
    th.start();
  }

  public static void main(String[] args) {
    new Example02();
  }
}

class TimerThread extends Thread {
  JLabel label;
  int counter = 0;

  public TimerThread(JLabel obj) {
    this.label = obj;
  }

  @Override
  public void run() {
    while (true) {
      label.setText(String.format("%d", counter++));

      try {
        Thread.sleep(1000);
      }
      catch (InterruptedException e) {
        counter = 0;
        return;
      }
    }
  }

}
