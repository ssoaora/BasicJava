// 교제 p.108 예제 3-8: 배열의 length 필드 활용
import java.util.Scanner;

public class arrayLength {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("5개의 정수를 입력하세요.");

        int intArray[] = new int[5];
        double sum = 0.0 ;

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = input.nextInt();
            sum += intArray[i];
        }

        System.out.println("평균은 " + sum/intArray.length);

        input.close();

    }
}
