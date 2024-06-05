// 화면에 출력되자마자 심하게 흔들리는 프레임 만들기

import java.awt.*;
import javax.swing.*;

public class Example04 extends JFrame {

  public Example04() {
    super("흔들리는 프레임");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(250, 200);
    this.setLocation(500, 400);
    this.setVisible(true);

    Thread th = new Thread(new Vibration(this));
    th.start();
  }

  public static void main(String[] args) {
    new Example04();
  }
}

class Vibration implements Runnable {

  JFrame f;
  boolean flag = false;
  int count = 0;

  public Vibration(JFrame obj) {
    this.f = obj;
  }

  @Override
  public void run() {
    while (count++ < 10000) {
      if (flag) {
        f.setLocation(f.getX() + 3, f.getY() + 3);
        flag = false;
      }
      else {
        f.setLocation(f.getX() - 3, f.getY() - 3);
        flag = true;
      }
    }
  }
}
