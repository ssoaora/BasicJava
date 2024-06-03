// 디지털시계 시, 분, 초

import java.awt.*;
import javax.swing.*;
import java.util.Calendar;

public class Example03 extends JFrame {

  JLabel label;

  public Example03() {
    this.setTitle("디지털 시계");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(500, 160);

    label = new JLabel();
    label.setFont(new Font("Gothic", Font.ITALIC, 80));
    this.setLayout(new FlowLayout());
    this.add(label);

    Clock th = new Clock(label);
    this.setVisible(true);

    th.start();
  }

  public static void main(String[] args) {
    new Example03();
  }
}

class Clock extends Thread {
  JLabel label;
  int hour, min, second;

  public Clock(JLabel obj) {
    this.label = obj;
  }

  @Override
  public void run() {
    while (true) {
      Calendar cal = Calendar.getInstance();
      hour = cal.get(Calendar.HOUR_OF_DAY);
      min = cal.get(Calendar.MINUTE);
      second = cal.get(Calendar.SECOND);

      label.setText(String.format("%02d:%02d:%02d", hour, min, second));

      try {
        Thread.sleep(1000);
      }
      catch (InterruptedException e) {
        return;
      }
    }
  }
}
