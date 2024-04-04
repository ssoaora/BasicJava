import java.util.Scanner;

public class problem02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("10개의 정수를 입력하세요 >> ");

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

        System.out.println("최대값은 " + intArray[9] + " 입니다.");
    }
}
