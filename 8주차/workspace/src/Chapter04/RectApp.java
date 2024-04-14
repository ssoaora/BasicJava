package Chapter04;

import java.util.Scanner;

class Rectangle {
  int width, height;

  public int getArea() {
    return width * height;
  }

}

public class RectApp {
  public static void main(String[] args) {
    Rectangle r = new Rectangle();
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the width and height of the rectangle: ");

    r.width = sc.nextInt();
    r.height = sc.nextInt();

    System.out.println("The area of the rectangle is " + r.getArea());

  }

}
