// 교제 p.126 실습문제 2번
// 정수를 10개 입력받아 배열에 저장한 후, 배열을 검색하여 3의 배수만 골라 출력하는 프로그램을 작성하라.
import java.util.Scanner;

public class practice02 {
    public static void main(String[] args) {

        int[] intArray = new int[10];
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수 10개 입력>>");

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = scanner.nextInt();
            if (intArray[i] % 3 == 0)
                System.out.print(intArray[i] + " ");
        }
    }
}
