// Problem 04

import java.util.Scanner;

class Phone04 {  // 2번 문제와 클래스명 중복을 피하기 위해 Phone04 사용
  private String name;
  private String tel;

  Phone04(String name, String tel) {
    this.name = name;
    this.tel = tel;
  }

  public String getName() {
    return name;
  }
  public String getTel() {
    return tel;
  }
}

public class PhoneManager {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("인원수 >> ");
    int people = sc.nextInt();

    Phone04[] phones = new Phone04[people];

    for (int i = 0; i < phones.length; i++) {
      System.out.print("이름과 전화번호(번호는 연속적으로 입력) >> ");
      phones[i] = new Phone04(sc.next(), sc.next());
    }
    System.out.println("저장되었습니다...");

    while (true) {
      System.out.print("검색할 이름 >> ");
      String searchName = sc.next();

      for (int i = 0; i < phones.length; i++) {
        if (phones[i].getName().equals(searchName)) {
          System.out.printf("%s의 번호는 %s 입니다.\n", phones[i].getName(), phones[i].getTel());
        }
      }

      if (searchName.equals("exit")) {
        System.out.println("프로그램을 종료합니다...");
        break;
      }
    }
  }
}
