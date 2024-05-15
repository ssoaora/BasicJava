package Chap06.Wrapper;

public class SwapEx {

  static class MyClass {
    int value;

    public MyClass(int value) {
      this.value = value;
    }
  }

  public static void swap(MyClass x, MyClass y) {
    int temp;

    temp = x.value;
    x.value = y.value;
    y.value = temp;
  }

  public static void main(String[] args) {
    MyClass a = new MyClass(3);
    MyClass b = new MyClass(5);
    System.out.printf("prev value: a = %d, b = %d\n", a.value, b.value);

    swap(a, b);

    System.out.printf("next value: a = %d, b = %d\n", a.value, b.value);
  }

}
