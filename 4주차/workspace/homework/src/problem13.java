// 로직 이해 안 갔음. 복습 필요.
public class problem13 {
    public static void main(String[] args) {
        int money = 3500;
        int cream = 500, shrimp = 700, coke = 400;

        for (int i = 1; i < money - (cream * i); i++) {
            for (int j = 1; j < money - (shrimp * j); j++) {
                for (int k = 1; k < money - (coke * k); k++) {
                    if (money == (cream * i) + (shrimp * j) + (coke * k))
                        System.out.printf("크림빵 %d개, 새우깡 %d개, 콜라 %d개\n", i, j, k);
                }
            }
        }
    }
}
