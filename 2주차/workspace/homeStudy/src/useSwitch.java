// 교제 p.82 예제 2-14: switch 문 사용하기
// 1~12 사이의 월을 입력 받아 봄, 여름, 가을, 겨울을 판단하여 출력하라.
import java.util.Scanner;

public class useSwitch {

    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);

        System.out.print("1~12 사이의 월을 입력하세요: ");
        int month = info.nextInt();

        switch (month) {
            case 3: case 4: case 5:
                System.out.println("봄 입니다.");
                break;
            case 6: case 7: case 8:
                System.out.println("여름 입니다.");
                break;
            case 9: case 10: case 11:
                System.out.println("가을 입니다.");
                break;
            case 12: case 1: case 2:
                System.out.println("겨울 입니다.");
                break;
            default:
                System.out.println("잘못된 입력입니다.");
        }
        info.close();
    }
}
