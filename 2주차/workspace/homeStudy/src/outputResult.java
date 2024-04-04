import java.util.Scanner;

public class outputResult {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("알아서 입력하세요: ");

        /*
        char a = 'c';
        System.out.println(a + 1);


        double b = 10.0;
        System.out.println(b / 3);


        int i;
        int j;
        i = 20;
        j = 30;
        System.out.println(i + j);


        int option = 4;
        switch (option) {
            case 1: System.out.println("옵션1");
            case 2: System.out.println("옵션2");
            case 3: System.out.println("옵션3"); break;
            default: System.out.println("해당 없음");
        }


        int i;
        int j = 17;

        i = j%2 == 0?10:20;

        System.out.println(i + " and " + j);
        */


        int i = input.nextInt();
        switch (i) {
            case 1:
                System.out.println("!");
                break;
            case 2:
                System.out.println("@");
                break;
            case 3:
                System.out.println("#");
                break;
            default:
                System.out.println("*");
        }

        input.close();
    }
}
