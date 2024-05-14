// Problem 02

interface AdderInterface {
  int add(int x, int y);
  int add(int n);
}

public class MyAdder implements AdderInterface {
  private int sum = 0;

  @Override
  public int add(int x, int y) {
    return x + y;
  }

  @Override
  public int add(int n) {
    for (int i = 0; i <= n; i++) {
      sum += i;
    }
    return sum;
  }

  public static void main(String[] args) {
    MyAdder adder = new MyAdder();
    System.out.println(adder.add(5, 10));
    System.out.println(adder.add(10));
  }
}
