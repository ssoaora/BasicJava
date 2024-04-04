// 교제 p.113 예제 3-11: 배열 리턴
public class returnArray {
    static int[] makeArray() {
        int[] temp = new int[4];
        for (int n = 0; n < temp.length; n++)
            temp[n] = n;

        return temp;
    }

    public static void main(String[] args) {

        int[] intArray;
        intArray = makeArray();

        for (int j : intArray) {
            System.out.print(j + " ");
        }

    }
}
