import java.math.*;
import java.util.Random;

public class randomNumber {

    public static void main(String[] args) {

        // Math.random()
        double randomNum = Math.floor(Math.random() * 100) + 1;

        // java.util.Random;
        /*
        nextInt()
        nextInt(100) 100보다 작은 정수
        nextLong()
        nextFloat()
        nextDouble()
        */
        Random r = new Random(); // r 객체 생성
        int randomInt = r.nextInt(101);
    }
}
