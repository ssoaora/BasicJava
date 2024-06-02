package Chap12.Synchronization;

class Thread1 extends Thread {
  ShareData obj;

  public Thread1(ShareData obj) {
    this.obj = obj;
  }

  public void run() {
    double total = 0.0;

    for (int i = 0; i < 1000000000; i++) {
      if ((i / 2) % 2 == 0) {
        total += 1.0 / i;
      }
      else {
        total -= 1.0 / i;
      }
    }
    obj.pi = total * 4;
  }
}

class ShareData {
  double pi;
}

public class SyncEx {
  public static void main(String[] args) {
    ShareData sd = new ShareData();

    Thread1 t1 = new Thread1(sd);
    Thread2 t2 = new Thread2(sd);

    t1.start();
    t2.start();
  }
}

class Thread2 extends Thread {
  ShareData obj;

  Thread2(ShareData obj) {
    this.obj = obj;
  }

  public void run() {
    System.out.println("PI: " + obj.pi);
  }
}
