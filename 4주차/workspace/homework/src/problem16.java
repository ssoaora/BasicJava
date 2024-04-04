import java.util.Scanner;

public class problem16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수 10개를 입력하세요 >> ");
        int[] intArray = new int[10];

        int front = 0, back = 9;

        for (int i = 0; i < intArray.length; i++) {
            int temp = scanner.nextInt();
            if (temp % 2 == 0) {
                intArray[back] = temp;
                back -= 1;
            }
            else {
                intArray[front] = temp;
                front += 1;
            }
        }

        for (int j : intArray) {
            System.out.printf("%d ", j);
        }
    }
}
