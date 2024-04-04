// 혼자 다시 풀어볼 필요 있음.
import java.util.Scanner;

public class problem14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n 입력 >> ");

        int input = scanner.nextInt();
        int x = 1, k = 0;

        while ((x *= 2) <= input) {
            k++;
        }
        System.out.println("k는 " + k);
    }
}
