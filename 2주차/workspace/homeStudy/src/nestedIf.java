// 교제 p.75 예제 2-13: 중첩 if-else 문 사례
import java.util.Scanner;

public class nestedIf {

    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);

        System.out.print("점수를 입력하세요 (0~100): ");
        int score = info.nextInt();
        System.out.print("학년을 입력하세요 (1~4): ");
        int year = info.nextInt();

        if (score >= 60) {
            if (year != 4)
                System.out.println("합격입니다!");
            else if (score >= 70)
                System.out.println("불합격입니다.");
            else
                System.out.println("불합격입니다.");
        }
        else
            System.out.println("불합격입니다.");

        info.close();
    }
}
