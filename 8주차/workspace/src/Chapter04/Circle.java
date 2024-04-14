package Chapter04;

public class Circle {
  int radius;
  String name;

  public Circle() {
    this.radius = 1;
    name = "";
  }

  public Circle(int radius) {
    this.radius = radius;
  }

  public Circle(int radius, String name) {
    this.radius = radius;
    this.name = name;
  }

  public double getArea() {
    return 3.14 * this.radius * this.radius;
  }

  public static void main(String[] args) {
    Circle pizza;
    pizza = new Circle(10, "Java Pizza");
    double area = pizza.getArea();
    System.out.printf("Area of %s is: %.2f\n", pizza.name, area);

    Circle donut = new Circle();
    donut.name = "Java Donut";
    area = donut.getArea();
    System.out.printf("Area of %s is: %.2f\n", donut.name, area);

    Circle[] circles = new Circle[5];

    for (int i = 0; i < circles.length; i++) {
      circles[i] = new Circle(i);
    }

    for (int i = 0; i < circles.length; i++) {
      System.out.println((int) circles[i].getArea() + " ");
    }
  }

}
