// 교제 p.109 예제 3-9: for-each 문 활용
public class foreachExample {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int k : nums) {
            System.out.print(k + " ");
            sum += k;
        }
        System.out.println("합은 " + sum);

        String[] fruits = {"사과", "배", "바나나", "체리", "딸기", "포도"};
        for (String s : fruits) {
            System.out.print(s + " ");
        }

    }
}
