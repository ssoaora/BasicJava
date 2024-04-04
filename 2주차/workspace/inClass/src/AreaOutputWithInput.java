// 원의 반지름을 입력 받아 면적을 계산하여 출력하는 프로그램
import java.util.Scanner;

public class AreaOutputWithInput {
	
	public static final double PI = 3.141592;
	// final은 C의 const와 같음 *상수: 변하면 안되는 값
	
	public static double getArea(double radius) {
		return PI * radius * radius;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("radius = ");
		
		double radius = in.nextDouble();
		double area = getArea(radius);
		
		System.out.println("area = " + area);
		
		in.close();
	}

}
