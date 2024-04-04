// 최대공약수, 최소공배수 구하는 문제. 어렵다. 내 힘으론 풀 수 없었다. 복습 필요.
import java.util.Scanner;

public class problem12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("두 개의 정수를 입력 >> ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int gcd;
        int lcm = a * b;

        int temp;

        while (a != 0) {
            if (a > b)
                a = a % b;
            else {
                temp = a;
                a = b;
                b = temp;
            }
        }
        gcd = b;
        lcm /= gcd;
        System.out.printf("최대공약수는 %d, 최소공배수는 %d", gcd, lcm);
    }
}
