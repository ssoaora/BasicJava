import java.util.Scanner;

public class practice01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("두 정수를 입력하세요>>");

        int first = input.nextInt();
        int second = input.nextInt();
        int result = first + second;

        System.out.println(first + "+" + second + "은 " + result);

        input.close();
    }
}
