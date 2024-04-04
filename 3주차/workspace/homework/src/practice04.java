// 교제 p.126 실습문제 4번
// '일', '월', '화', '수', '목', '금', '토'로 초기화된 문자 배열 day 를 선언하고, 사용자로부터 정수를 입력받아 7(배열 day 의 크기)로 나눈 나머지를 인덱스로 하여 배열 day에 저장된 문자를 출력하라. 음수가 입력되면 프로그램을 종료하라. 아래 실행 결과와 같이 예외 처리하라.
import java.util.InputMismatchException;
import java.util.Scanner;

public class practice04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] day = {'일', '월', '화', '수', '목', '금', '토'};

        while (true) {
            System.out.print("정수를 입력하세요>>");
            int input;

            try {
                input = scanner.nextInt();
            }
            catch (InputMismatchException e) {
                scanner.nextLine(); // 입력 버퍼 비우기
                System.out.println("경고! 수를 입력하지 않았습니다.");
                continue;
            }

            if (input == -1) {
                System.out.println("프로그램 종료합니다...");
                break;
            }

            System.out.println(day[input % day.length]);
        }
    }
}
