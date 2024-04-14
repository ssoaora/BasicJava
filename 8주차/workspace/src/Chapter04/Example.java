package Chapter04;

class Number {
  int n;

  public Number(int n) {
    this.n = n;
  }
}

public class Example {
  static void plusTen(Number x) {
    x.n += 10;
  }

  public static void main(String[] args) {
    Number ob = new Number(5);
    plusTen(ob);
    System.out.println(ob.n);
  }

}
