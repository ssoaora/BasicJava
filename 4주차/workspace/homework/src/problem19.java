// 정답 봤음. 혼자서 처음부터 다시 풀어보기.
public class problem19 {
    public static void main(String[] args) {
        int[][] intArray = new int[4][4];
        int data = 1;

        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++) {
                intArray[i][j] = data;
                data++;
            }
        }
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++) {
                System.out.print(intArray[i][j] + "\t");
            }
            System.out.println();
        }

        rotate(intArray);
        rotate(intArray);
        rotate(intArray);
    }

    public static void rotate(int[][] array) {
        int[][] temp = new int[4][4];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                temp[j][(3 - i)] = array[i][j];
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = temp[i][j];
            }
        }

        System.out.println();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
