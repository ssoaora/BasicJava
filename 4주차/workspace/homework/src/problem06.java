public class problem06 {
    public static void main(String[] args) {
        double sum = 0;

        for (double i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum -= (1 / i);
            }
            else {
                sum += (1 / i);
            }
        }

        System.out.println("결과: " + sum);
    }
}
