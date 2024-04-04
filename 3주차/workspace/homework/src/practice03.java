// 교제 p.126 실습문제 3번
// 정수를 입력받아 짝수이면 “짝”, 홀수이면 “홀”을 출력하는 프로그램을 작성하라.
import java.util.InputMismatchException;
import java.util.Scanner;

public class practice03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            while (true) {
                System.out.print("정수를 입력하세요>>");
                int num = scanner.nextInt();

                if (num == 0) {
                    System.out.print("프로그램을 종료합니다.");
                    break;
                }
                if (num % 2 == 0)
                    System.out.println("짝수");
                else
                    System.out.println("홀수");
            }
        }
        catch (InputMismatchException e) {
            System.out.println("수를 입력하지 않아 프로그램 종료합니다.");
        }
        finally {
            scanner.close();
        }
    }
}
