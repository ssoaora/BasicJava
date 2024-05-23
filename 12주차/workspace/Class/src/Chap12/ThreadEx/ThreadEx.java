package Chap12.Thread;

class TimerThread extends Thread {
  int n = 0;

  @Override
  public void run() {
    while (true) {
      System.out.println(n);
      n++;

      try {
        sleep(1000);
      }
      catch(InterruptedException e) {
        return; // run() method 빠져나감
      }
    }
  }
}

public class ThreadEx {

  public static void main(String[] args) {
    TimerThread th = new TimerThread();
    th.start();
  }
}
