package Chap12.ThreadTimerEx;

import java.awt.*;
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
        Thread.sleep(1000);
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

    JLabel timerLabel = new JLabel("0");
    timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
    cp.add(timerLabel);

    TimerThread th = new TimerThread(timerLabel);
    th.start();

    this.setSize(300, 150);
    this.setVisible(true);
  }

  public static void main(String[] args) {
    new ThreadTimerEx();
  }

}
