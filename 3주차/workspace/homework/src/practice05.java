// 교제 p.126 실습문제 5번: 정수를 10개 입력받아 배열에 저장하고 증가 순으로 정렬하여 출력하라.
import java.util.Scanner;

public class practice05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수를 입력하세요 >> ");

        int[] intArray = new int[10];

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = scanner.nextInt();
        }

        for (int i = 0; i < intArray.length; i++) {
            for (int j = i + 1; j < intArray.length; j++) {
                if (intArray[i] > intArray[j]) {
                    int temp = intArray[i];
                    intArray[i] = intArray[j];
                    intArray[j] = temp;
                }
            }
        }
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
    }
}
