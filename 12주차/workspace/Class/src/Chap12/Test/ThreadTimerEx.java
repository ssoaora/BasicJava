package Chap12.Test;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class TimerThread extends Thread {
  private JLabel timerLabel;

  public TimerThread(JLabel timerLabel) {
    this.timerLabel = timerLabel;
  }

  @Override
  public void run() {
    int n = 0;
    while (true) {
      timerLabel.setText(Integer.toString(n));
      n++;

      try {
        sleep(1000);
      }
      catch (InterruptedException e) {
        return;
      }
    }
  }
}

public class ThreadTimerEx extends JFrame {

  public ThreadTimerEx() {
    this.setTitle("Thread를 상속받은 타이머 스레드 예제");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Container cp = getContentPane();
    cp.setLayout(new FlowLayout());

    JLabel timerLabel = new JLabel();
    timerLabel.setFont(new Font("Gothic", Font.ITALIC, 160));
    cp.add(timerLabel);

    TimerThread th = new TimerThread(timerLabel);

    this.setSize(500, 300);
    this.setVisible(true);

    th.start();
  }

  public static void main(String[] args) {
    new ThreadTimerEx();
  }
}
