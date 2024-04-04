public class problem07 {
    public static void main(String[] args) {
        int cityH = 2500000;
        double growthRateH = 3.6 / 100.0;
        int cityK = 180;
        double growthRateK = 4.2 / 100.0;

        int year = 1984;

        while (cityK < cityH) {
            System.out.println(year + "년, H시의 인구수: " + cityH + "명, K시의 인구수: " + cityK + "명");
            cityH *= (1 + growthRateH);
            cityK *= (1 + growthRateK);

            year++;
        }
        System.out.println(year + "년, K시가 H시의 인구수를 넘었습니다.");
    }
}
