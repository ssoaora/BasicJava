package Chap06.Wrapper;

public class WrapperEx {

  public static void main(String[] args) {
    System.out.println(Integer.parseInt("28")); // 문자열 28을 정수로 변환
    System.out.println(Integer.toString(28)); // 정수 28을 문자열로 변환
    System.out.println(Integer.toBinaryString(28)); // 정수 28을 2진수로 변환
    System.out.println(Integer.bitCount(28)); // 정수 28에 대한 2진수의 1의 개수

    Integer i = Integer.valueOf(28);
    System.out.println(i.doubleValue());  // 정수 28을 double로 변환
  }
}