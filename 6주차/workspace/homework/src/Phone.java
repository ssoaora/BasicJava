// Problem 02

import java.util.Scanner;

public class Phone {
  private String name, tel;

  public Phone(String name, String tel) {
    this.name = name;
    this.tel = tel;
  }

  public String getName() {
    return name;
  }
  public String getTel() {
    return tel;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("이름과 전화번호 입력 >> ");
    Phone phone1 = new Phone(sc.next(), sc.next());

    System.out.print("이름과 전화번호 입력 >> ");
    Phone phone2 = new Phone(sc.next(), sc.next());

    System.out.printf("%s의 번호 %s\n", phone1.getName(), phone1.getTel());
    System.out.printf("%s의 번호 %s\n", phone2.getName(), phone2.getTel());
  }
}
