// 교제 p.106 예제 3-7: 배열 선언 및 생성
import java.util.Scanner;

public class arrayAccess {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int intArray[] = new int[5];
        int max = 0;

        System.out.print("양수 5개를 입력하세요: ");

        for (int i=0; i<5; i++) {
            intArray[i] = input.nextInt();
            max = intArray[i]>max ? intArray[i] : max;
        }

        System.out.println("가장 큰 수는 " + max + "입니다.");

        input.close();
    }
}
