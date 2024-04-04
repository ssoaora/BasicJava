import java.util.Scanner;

public class problem11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수 2개를 입력하세요 >> ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a >= b) {
            for (int i = b; i <= a; i++) {
                for (int j = 1; j < 10; j++) {
                    System.out.printf("%d * %d = %d\n", i, j, i * j);
                }
                System.out.println();
            }
        }
        else {
            for (int i = a; i <= b; i++) {
                for (int j = 1; j < 10; j++) {
                    System.out.printf("%d * %d = %d\n", i, j, i * j);
                }
                System.out.println();
            }
        }
    }
}
