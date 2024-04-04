// 해결 못 함 (인터넷 답 찾아봄)
public class problem10 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i+=3) {
            for (int j = 1; j < 10; j++) {
                System.out.printf("%d * %d = %d", i, j, i * j);
                System.out.print("\t");

                System.out.printf("%d * %d = %d", (i + 1), j, (i + 1) * j);
                System.out.print("\t");

                System.out.printf("%d * %d = %d", (i + 2), j, (i + 2) * j);
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("======================\n");

        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.printf("%d * %d = %d", i, j, i * j);
                System.out.print("\t");

                System.out.printf("%d * %d = %d", (i + 3), j, (i + 3) * j);
                System.out.print("\t");

                System.out.printf("%d * %d = %d", (i + 6), j, (i + 6) * j);
                System.out.println();
            }
            System.out.println();
        }
    }
}
