// Exercise Problem 11-(2)

abstract class Shapes {
  public void paint() {
    draw();
  }
  abstract void draw();
}

class Circles extends Shapes {
  private int radius;
  public Circles(int radius) {
    this.radius = radius;
  }
  double getArea() {
    return 3.14 * radius * radius;
  }
  public void draw() {
    System.out.printf("반지름 = %d\n", radius);
    System.out.printf("넓이 = %.2f\n", getArea());
  }

  public static void main(String[] args) {
    Circles c = new Circles(10);
    c.paint();
  }
}