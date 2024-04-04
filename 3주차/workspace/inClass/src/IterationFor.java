public class IterationFor {
    public static void main(String[] args) {
        int i, sum = 0;

        for(i = 1; i <= 10; i++) { // 1~10까지 반복
            sum += i;
            System.out.print(i);

            if (i <= 9) // 1~9 까지는 '+' 출력
                System.out.print("+");
            else { // i가 10인 경우
                System.out.print("=");
                System.out.print(sum);
            }
        }
    }
}
