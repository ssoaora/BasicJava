package Chap06.Equals;

class Point {
  int x, y;

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  @Override
  public boolean equals(Object obj) {
    Point p = (Point) obj;  // obj를 Point 타입으로 다운캐스팅
    if (x == p.x && y == p.y)
      return true;
    else
      return false;
  }
}

public class EqualsEx {

  public static void main(String[] args) {
    Point a = new Point(2, 3);
    Point b = new Point(2, 3);
    Point c = new Point(3, 4);

    if (a == b)
      System.out.println("a==b");
    if (a.equals(b))
      System.out.println("a is equal to b");
    if (a.equals(c))
      System.out.println("a is equal to c");
  }

}
