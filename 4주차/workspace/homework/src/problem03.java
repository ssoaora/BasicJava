import java.util.Scanner;

public class problem03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("사각형의 넓이를 입력하세요 >> ");
            int width = scanner.nextInt();
            System.out.print("사각형의 높이를 입력하세요 >> ");
            int height = scanner.nextInt();

            if ((width == 0) || (height == 0)) {
                System.out.println("알맞은 넓이와 높이를 입력하세요.");
                continue;
            }

            if (height == 1) {
                for (int i = 1; i <= width; i++) {
                    System.out.print("*" + "\t");
                }
                System.out.println();
            }
            else {
                // 첫 번째 줄 찍기
                for (int i = 1; i <= width; i++) {
                    System.out.print("*" + "\t");
                }
                System.out.println();

                // 빈 공간 찍기
                for (int i = 1; i <= (height - 2); i++) {
                    System.out.print("*" + "\t");
                    for (int j = 1; j <= (width - 2); j++) {
                        System.out.print(" " + "\t");
                    }
                    System.out.println("*" + "\t");
                }

                // 마지막 줄 찍기
                for (int i = 1; i <= width; i++) {
                    System.out.print("*" + "\t");
                }
                System.out.println();
            }
        }
    }
}
