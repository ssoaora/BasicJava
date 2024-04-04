// 교제 p.125 실습문제 1번
// 영문 소문자를 하나 입력받고 그 문자보다 알파벳 순위가 낮은 모든 문자를 출력하는 프로그램을 작성하라.
import java.util.Scanner;

public class practice01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("알파벳 한 문자를 입력하세요>>");

        char alphabet = scanner.next().charAt(0);

        // 입력받은 문자가 영문 소문자인지 확인
        if (alphabet < 'a' || alphabet > 'z') {
            System.out.println("영문 소문자를 입력하세요.");
        }
        else {
            for (char start = 'a'; start <= alphabet; start++) {
                for (char i = start; i <= alphabet; i++) {
                    System.out.print(i);
                }
                System.out.println("");
            }
        }
    }
}
