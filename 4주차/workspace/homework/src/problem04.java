public class problem04 {
    public static void main(String[] args) {
        System.out.println("1 부터 50 사이의 소수를 출력합니다..");

        for (int i = 2; i <= 50; i++) {
            int count = 0;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    count += 1;
                }
            }

            if (count == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
