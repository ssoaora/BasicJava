// 교제 p.128 실습문제 8번:
// 컴퓨터와 사용자의 가위바위보 게임 프로그램을 작성하라. 사용자가 입력하고 <Enter>. 키를 치면, 컴퓨터는 랜덤하게 가위, 바위, 보 중 하나를 선택한다. 누가 이겼는지 출력한다. "그만"을 입력하면 게임을 종료한다.
import java.util.Scanner;

public class practice08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] choice = {"가위", "바위", "보"};
        System.out.println("컴퓨터와 가위 바위 보 게임을 시작합니다.");

        while (true) {
            System.out.print("가위 바위 보! >> ");
            String input = scanner.next();
            int comChoice = (int)(Math.random()*3);

            if (input.equals("그만")) {
                System.out.println("게임을 종료합니다..");
                break;
            }
            else if (!(input.equals("가위") || input.equals("바위") || input.equals("보"))) {
                System.out.println("가위 바위 보 중 하나를 내주세요.");
                continue;
            }

            System.out.print("사용자 = " + input + " , " + "컴퓨터 = " + choice[comChoice] + ".. ");

            if (choice[comChoice].equals(input)) {
                System.out.println("비겼습니다.");
            }
            else if ((input.equals("가위") && choice[comChoice].equals("보")) ||
                    (input.equals("바위") && choice[comChoice].equals("가위")) ||
                    (input.equals("보") && choice[comChoice].equals("바위"))) {
                System.out.println("사용자가 이겼습니다.");
            }
            else {
                System.out.println("컴퓨터가 이겼습니다.");
            }
        }
    }
}
