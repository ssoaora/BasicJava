// Bonus

interface Shape2 {
  final double PI = 3.14;
  void draw();
  double getArea();
  default public void redraw() {
    System.out.println("--- 다시 그립니다. ---");
    draw();
  }
}

class Circle2 implements Shape2 {
  private int radius;

  Circle2(int radius) {
    this.radius = radius;
  }

  public void draw() {
    System.out.printf("반지름 %d ", radius);
  }
  public double getArea() {
    return PI * radius * radius;
  }
}

public class ShapeApp {
  public static void main(String[] args) {
    Shape2 coin = new Circle2(10);
    coin.redraw();
    System.out.println("코인의 면적은 " + coin.getArea());
  }
}
