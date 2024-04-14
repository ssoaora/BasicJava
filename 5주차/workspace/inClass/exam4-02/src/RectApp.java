class Rectangle {
    public Rectangle() {
        width = 3;
        height = 5;
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    int width, height;
    
    public int getArea() {
        return width * height;
    }
}

public class RectApp {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        // 인수가 없으면 없는 메소드를, 있으면 있는 메소드를 호출
/*
        rect.width = 10;
        rect.height = 20;
*/

        System.out.println(rect.getArea());
    }
}
