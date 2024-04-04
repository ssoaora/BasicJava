public class problem05 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            int innerSum = 0;
            for (int j = 1; j <= i; j++) {
                innerSum += j;
            }
            sum += innerSum;
        }

        System.out.println("결과: " + sum);
    }
}
