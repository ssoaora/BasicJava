// 혼자 힘으로 도저히 못 풀 지경임. 논리 구조를 잘 파악해볼 필요가 있음.
import java.util.Scanner;

public class problem20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수 n 입력 >> ");
        int n = scanner.nextInt();

        int[][] intArray = new int[n][n];

        snail(intArray, n);
    }

    public static void snail(int[][] array, int size) {
        int numInsert = 1;
        int change = 1;
        int row = 0, col = -1;

        while (true) {
            for (int i = 0; i < size; i++) {
                col += change;
                array[row][col] = numInsert;
                numInsert += 1;
            }
            size -= 1;

            if (size == 0)
                break;

            for (int i = 0; i < size; i++) {
                row += change;
                array[row][col] = numInsert;
                numInsert += 1;
            }
            change *= -1;
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
