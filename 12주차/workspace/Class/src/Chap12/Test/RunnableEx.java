package Chap12.Test;

import java.awt.*;
import javax.swing.*;

class TimerRunnable implements Runnable {

  private JLabel timerLabel;

  public TimerRunnable(JLabel timerLabel) {
    this.timerLabel = timerLabel;
  }

  @Override
  public void run() {
    int n = 0;

    while (true) {
      timerLabel.setText(String.valueOf(n));
      n++;

      try {
        Thread.sleep(1000);
      }
      catch (InterruptedException e) {
        return;
      }
    }
  }
}

public class RunnableEx extends JFrame {

  public RunnableEx() {
    this.setTitle("Runnable을 구현한 타이머 스레드 예제");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Container cp = getContentPane();
    cp.setLayout(new FlowLayout());

    JLabel timerLabel = new JLabel();
    timerLabel.setFont(new Font("Gothic", Font.ITALIC, 160));
    cp.add(timerLabel);

    TimerRunnable runnable = new TimerRunnable(timerLabel);
    Thread th = new Thread(runnable);

    this.setSize(500, 300);
    this.setVisible(true);

    th.start();
  }

  public static void main(String[] args) {
    new RunnableEx();
  }

}
