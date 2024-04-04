// 교제 p.111 예제 3-10: 2차원 배열 생성 및 활용하기
public class scoreAverageTwoDimensionsArray {

    public static void main(String[] args) {
        double[][] score = {{3.3, 3.4},  // 1학년 1, 2학기 평점
                            {3.5, 3.6},  // 2학년 1, 2학기 평점
                            {3.7, 4.0},  // 3학년 1, 2학기 평점
                            {4.1, 4.2}}; // 4학년 1, 2학기 평점
        double sum = 0;

        for (int grade = 0; grade < score.length; grade++)
            for (int term = 0; term < score[grade].length; term++) {
                sum += score[grade][term];
            }

        int grades = score.length;
        int terms = score[0].length;

        System.out.println(sum);
        System.out.println("4년 전체 평점 평균은 " + sum/(grades*terms));
    }
}
