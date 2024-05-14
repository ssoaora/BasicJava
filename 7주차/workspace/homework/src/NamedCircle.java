// Problem 01

class Circled {
  private int radius;

  public Circled(int radius) {
    this.radius = radius;
  }

  public int getRadius() {
    return radius;
  }
}

public class NamedCircle extends Circled {
  private String name;

  public NamedCircle(int radius, String name) {
    super(radius);
    this.name = name;
  }

  public void show() {
    System.out.printf("%s, 반지름 = %d\n", name, getRadius());
  }

  public static void main(String[] args) {
    NamedCircle w = new NamedCircle(5, "Waffle");
    w.show();
  }
}
