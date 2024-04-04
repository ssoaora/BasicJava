// 교재 p.65 예제 2-5: Scanner 를 이용한 키 입력 연습
import java.util.Scanner;

public class basicInputOutput {

    public static void main(String[] args) {

        System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요.");
        Scanner information = new Scanner(System.in);

        String name = information.next();
        System.out.println("당신의 이름은 " + name + "입니다.");

        String city = information.next();
        System.out.println("당신이 사는 도시는 " + city + "입니다.");

        int age = information.nextInt();
        System.out.println("당신의 나이는 " + age + "살 입니다.");

        double weight = information.nextDouble();
        System.out.println("당신의 체중은 " + weight + "kg 입니다.");

        boolean alone = information.nextBoolean();
        System.out.println("당신의 독신 여부는 " + alone + "입니다.");

        information.close();

    }
}
