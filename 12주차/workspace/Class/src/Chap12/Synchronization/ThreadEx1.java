// Thread join() 실습문제

package Chap12.Practice;

class CountingThread extends Thread {
  boolean flag;

  public CountingThread(boolean flag) {
    this.flag = flag;
  }

  @Override
  public void run() {
    for (int i = 1; i <= 100; i++) {
      if (flag) {
        System.out.println(i);
      }
      else {
        System.out.println(101 - i);
      }
    }
  }

}

public class ThreadEx1 {

  public static void main(String[] args) {
    System.out.println("Thread 시작 전");

    Thread th1 = new CountingThread(true);
    th1.start();


    try {
      th1.join();  // main() 스레드와 th 스레드가 동시에 실행되기 때문에 main() 스레드가 th 스레드가 종료될 때까지 기다림 (동기화)
    }
    catch (InterruptedException e) {
      return;
    }

    Thread th2 = new CountingThread(false);
    th2.start();

    try {
      th2.join();
    }
    catch (InterruptedException e) {
      return;
    }

    System.out.println("Thread 종료");
  }
}
