package Chap07.Vector;

import java.util.Vector;

public class VectorEx {

  public static void main(String[] args) {
    Vector<Integer> v = new Vector<>();

    v.add(5);
    v.add(4);
    v.add(-1);

    v.add(2, 100);

    System.out.printf("벡터 내의 요소 객체 수: %d\n", v.size());
    System.out.printf("벡터의 현재 용량: %d\n", v.capacity());

    for (int i = 0; i < v.size(); i++) {
      int n = v.get(i);
      System.out.println(n);
    }

    int sum = 0;
    for (int i = 0; i < v.size(); i++) {
      int n = v.elementAt(i);
      sum += n;
    }
    System.out.printf("벡터에 있는 정수 합: %d\n", sum);
  }

}
