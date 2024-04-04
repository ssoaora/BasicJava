// 정답 봤음. 혼자서 다시 풀어봐야 함.
import java.util.Scanner;

public class problem15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("10진 정수(양수) 하나를 입력하세요 >> ");
        int input = scanner.nextInt();

        if (input < 0)
            System.out.printf("%d는 양수가 아닙니다!", input);

        int[] a = new int[100];
        int count = 0;

        for (int i = 0; input > 0; i++) {
            a[i] = input % 2;
            input /= 2;
            count += 1;
        }

        for (int i = count - 1; i >= 0; i--) {
            System.out.printf("%d", a[i]);
        }
    }
}
