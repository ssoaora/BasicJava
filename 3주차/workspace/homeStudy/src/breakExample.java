// 교제 p.100 예제 3-6: break 문을 이용하여 while 문 벗어나기
import java.util.Scanner;

public class breakExample {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("exit 을 입력하면 종료합니다.");

        while (true) {
            System.out.print(">> ");
            String text = input.nextLine();

            if (text.equals("exit"))
                break;
        }
        System.out.println("종료합니다.");

        input.close();

    }
}
