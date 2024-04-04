import java.util.Scanner;

public class problem09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Numeric Center를 구합니다.");
        System.out.print("1부터 500사이의 값을 입력하세요 >> ");

        int start = 1;
        int end = scanner.nextInt();

        if (end <= 500) {
            int a = (start + end) / 2;
            int b = (start + end) % 2;

            if (b == 0) {
                System.out.println(a);
            }
            else {
                System.out.println(a);
                System.out.println(a + 1);
            }
        }
        else {
            System.out.println("500이하의 숫자를 입력하세요.");
        }
    }
}
