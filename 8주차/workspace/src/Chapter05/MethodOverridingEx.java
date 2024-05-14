package Chapter05;

class Shape {
  public void draw() {
    System.out.println("Shape");
  }
}

class Line extends Shape {
  public void draw() {
    System.out.println("Line");
  }
}

class Rectangle extends Shape {
  public void draw() {
    System.out.println("Rectangle");
  }
}

class Circle extends Shape {
  public void draw() {
    System.out.println("Circle");
  }
}

public class MethodOverridingEx {
  static void paint(Shape p) {
    p.draw();
  }

  public static void main(String[] args) {
    Line line = new Line();
    line.draw();

    paint(new Shape());
    paint(new Line());
    paint(new Rectangle());
    paint(new Circle());
  }

}
