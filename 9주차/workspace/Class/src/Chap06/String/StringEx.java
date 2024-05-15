package Chap06.String;

public class StringEx {

  public static void main(String[] args) {
    String a = new String(" C#");
    String b = new String(",C++ ");

    System.out.printf("%s의 길이는 %d\n", a, a.length());
    System.out.println(a.contains("#"));

    a = a.concat(b);
    System.out.println(a);

    a = a.trim();
    System.out.println(a);

    a = a.replace("C#", "Java");
    System.out.println(a);

    String[] s = a.split(",");
    for (int i = 0; i < s.length; i++) {
      System.out.printf("분리된 문자열 %d: %s\n", i, s[i]);
    }

    a = a.substring(5);
    System.out.println(a);

    char c = a.charAt(0);
    System.out.println(c);
  }
}
