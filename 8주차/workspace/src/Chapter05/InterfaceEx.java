package Chapter05;

interface PhoneInterface {
  final int TIMEOUT = 10000;
  void sendCall();
  void receiveCall();

  default void printLogo() {
    System.out.println("** Phone **");
  }
}

class Calculator {
  public int calculate(int a, int b) {
    return a + b;
  }
}

class SamsungPhone extends Calculator implements PhoneInterface {
  @Override
  public void sendCall() {  // 인터페이스의 메서드는 항상 public 으로 구현해야 한다.
    System.out.println("전화 거는 중..");
  }

  @Override
  public void receiveCall() {
    System.out.println("전화가 왔습니다.");
  }

  public void flash() {
    System.out.println("전화기에 불이 켜졌습니다.");
  }

  public void schedule() {
    System.out.println("일정을 관리합니다.");
  }
}

public class InterfaceEx {

  public static void main(String[] args) {
    SamsungPhone galaxy = new SamsungPhone();
    galaxy.printLogo();
    galaxy.sendCall();
    galaxy.receiveCall();
    System.out.printf("3과 5를 더하면 %d\n", galaxy.calculate(3, 5));
    galaxy.flash();
    galaxy.schedule();
  }

}
