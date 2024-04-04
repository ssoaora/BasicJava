// 혼자서 다시 풀어보기.
import java.util.Scanner;

public class problem18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("배열의 크기를 입력하세요 >> ");
        int arraySize = scanner.nextInt();
        int[] intArray = new int[arraySize];

        System.out.print("정수 입력 >> ");
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = scanner.nextInt();
        }

        problem18 m = new problem18();
        m.BubbleSort(intArray, arraySize);
        
        for (int j : intArray) {
            System.out.print(j + " ");
        }
    }

    public void BubbleSort(int[] array, int len) {
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
