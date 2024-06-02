// 1에서 100까지 출력한 뒤 종료하는 스레드를 Runnable 인터페이스를 이용하여 작성

class CountingThread extends Thread {
  @Override
  public void run() {
    for (int i = 1; i <= 100; i++) {
      System.out.println(i);
    }
  }
}

public class Example01 {

  public static void main(String[] args) {
    Thread th = new CountingThread();
    th.start();

    System.out.println("Thread Started!");

    try {
      th.join();
    } catch (InterruptedException e) {
      return;
    }

    System.out.println("After Join");
  }
}
