// Problem 06
// 도형 추가 부분 혼자 구현 못함.

import java.util.Scanner;

abstract class Shape {
  abstract void draw();
}

class Line extends Shape {
  @Override
  public void draw() {
    System.out.println("Line");
  }
}

class Rectangle extends Shape {
  @Override
  public void draw() {
    System.out.println("Rectangle");
  }
}

class Circle extends Shape {
  @Override
  public void draw() {
    System.out.println("Circle");
  }
}


public class GraphicEditor {
  static void paint(Shape p) {
    p.draw();
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Shape[] shapes = new Shape[100];
    int shapeCount = 0;

    while (true) {
      System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4) >> ");
      int action = sc.nextInt();
      sc.nextLine();

      switch (action) {
        case 1:
          if (shapeCount >= shapes.length) {
            System.out.println("더 이상 도형을 추가할 수 없습니다.");
            break;
          }
          System.out.print("도형 종류 Line(1), Rect(2), Circle(3) >> ");
          int shapeOption = sc.nextInt();
          Shape shape;
          switch (shapeOption) {
            case 1:
              shape = new Line();
              break;
            case 2:
              shape = new Rectangle();
              break;
            case 3:
              shape = new Circle();
              break;
            default:
              System.out.println("올바른 도형 옵션을 선택하세요.");
              continue;
          }
          shapes[shapeCount] = shape;
          shapeCount++;
          break;

        case 2:
          if (shapeCount == 0) {
            System.out.println("삭제할 도형이 없습니다.");
          }
          System.out.print("삭제할 도형의 위치 >> ");
          int shapeRemoveNum = sc.nextInt();
          if (shapeRemoveNum < 1 || shapeRemoveNum > shapeCount) {
            System.out.println("삭제할 수 없습니다.");
          }
          else {
            for (int i = shapeRemoveNum - 1; i < shapeCount - 1; i++) {
              shapes[i] = shapes[i + 1];
            }
          }
          shapeCount--;
          break;

        case 3:
          for (int i = 0; i < shapeCount; i++) {
            shapes[i].draw();
          }
          break;

        case 4:
          System.out.println("프로그램을 종료합니다...");
          System.exit(0);

        default:
          System.out.println("올바른 옵션을 입력해주세요.");
          break;
      }
    }
  }
}
