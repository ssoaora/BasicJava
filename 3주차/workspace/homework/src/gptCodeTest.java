import java.util.Scanner;

public class gptCodeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        // 정수 10개 입력받기
        System.out.println("정수 10개를 입력하세요:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }

        // 삽입 정렬을 사용하여 배열을 증가 순으로 정렬하기
        for (int i = 1; i < numbers.length; i++) {
            int current = numbers[i];
            int j = i - 1;

            while (j >= 0 && numbers[j] > current) {
                numbers[j + 1] = numbers[j];
                j--;
            }

            numbers[j + 1] = current;
        }

        // 정렬된 배열 출력하기
        System.out.println("입력된 정수를 증가 순으로 정렬한 결과:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();  // 줄 바꿈

        scanner.close();
    }
}
