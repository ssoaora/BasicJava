// 교제 p.127 실습문제 7번: 1부터 99까지, 369게임에서 박수를 쳐야하는 경우, 순서대로 화면에 출력하라.
public class practice07 {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            int a = i / 10;
            int b = i % 10;
            int count = 0;

            if (a == 3 || a == 6 || a == 9) {
                count++;
            }

            if (b == 3 || b == 6 || b == 9) {
                count++;
            }

            if (count == 2) {
                System.out.println(i + " 박수두번");
            }
            else if (count == 1) {
                System.out.println(i + " 박수한번");
            }
        }
    }
}