// 정답 봤음. 혼자서 다시 풀어봐야 함.
import java.util.Scanner;

public class problem17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("문자열을 입력하세요 (띄어쓰기 금지) >> ");

        findPalindrome(scanner.nextLine());
    }

    public static void findPalindrome (String x) {
        int check = 0;
        char[] chars = new char[10000];
        chars = x.toCharArray();

        for (int i = 0; i < (chars.length / 2); i++) {
            if (chars[i] != chars[chars.length - i - 1])
                check = 1;
        }

        if (check == 0)
            System.out.println("회문입니다.");
        else
            System.out.println("회문이 아닙니다.");
    }
}
