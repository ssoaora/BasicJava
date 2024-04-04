import java.util.Scanner;

public class problem01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("두 개의 정수를 입력하세요 >> ");

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if ((b != 0) && (a % b == 0))
            System.out.println("첫 번째 수가 두 번째 수로 나누어 떨어집니다.");
        else
            System.out.println("첫 번째 수가 두 번째 수로 나누어 떨어지지 않습니다.");
    }
}
