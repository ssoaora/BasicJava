// Problem 03

import java.util.Scanner;

class Rect {
  private int width, height;

  public Rect(int width, int height) {
    this.width = width;
    this.height = height;
  }

  public int getArea() { return width*height; }
}

public class RectArray {

  public static void main(String[] args) {
    Rect[] rects = new Rect[4];
    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < rects.length; i++) {
      System.out.printf("%d 너비와 높이 >> ", i + 1);
      rects[i] = new Rect(sc.nextInt(), sc.nextInt());
    }

    System.out.println("저장하였습니다...");

    int sum = 0;
    for (int i = 0; i < rects.length; i++) {
      sum += rects[i].getArea();
    }

    System.out.printf("사각형의 전체 합은 %d\n", sum);
  }

}
