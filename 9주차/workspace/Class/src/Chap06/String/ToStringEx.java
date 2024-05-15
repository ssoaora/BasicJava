package Chap06.String;

class Point {
  private int x, y;

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  @Override
  public String toString() {
    return "Point(" + x + ", " + y + ")";
  }
}

public class ToStringEx {

  public static void main(String[] args) {
    Point p = new Point(2, 3);

    System.out.println(p.toString());
    System.out.println(p);
  }
}
