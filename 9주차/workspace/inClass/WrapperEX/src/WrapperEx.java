public class WrapperEx {

  public static void swap(Integer x, Integer y) {
    Integer temp = x;
    x = y;
    y = temp;
  }

  public static void main(String[] args) {
    int a = 3, b = 5;
    swap(a, b);
    System.out.printf("a = %d, b = %d\n", a, b);
  }

}
