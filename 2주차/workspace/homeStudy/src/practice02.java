import java.util.Scanner;

public class practice02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("몇 층인지 입력하세요>>");

        int floor = input.nextInt();
        int height = floor * 5;

        System.out.println(height + "m 입니다.");

        input.close();

    }
}
