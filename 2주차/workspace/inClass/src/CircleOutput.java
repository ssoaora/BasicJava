// 원의 면적을 계산하여 출력하는 프로그램

public class CircleOutput {
	
	public static final double PI = 3.141592;
	// final은 C의 const와 같음 *상수: 변하면 안되는 값
	
	public static double getArea(double radius) {
		return PI * radius * radius;
	}

	public static void main(String[] args) {
		double radius = 12.3;
		double area = getArea(radius);
		
		System.out.println("area = " + area);
	}

}
