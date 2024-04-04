import java.util.Scanner;

public class problem08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("생년월일을 입력하세요 (입력예시: yyyymmdd) >> ");

        int input = scanner.nextInt();
        int year = input / 10000;

        if (year % 4 == 0 && (year % 400 == 0 || year % 100 != 0)) {
            System.out.println(year + "년은 윤년입니다.");
        }
        else {
            System.out.println(year + "년은 윤년이 아닙니다.");
        }
    }
}
