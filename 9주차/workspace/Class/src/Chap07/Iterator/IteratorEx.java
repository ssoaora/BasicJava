package Chap07.Iterator;

import java.util.Iterator;
import java.util.Vector;

public class IteratorEx {

  public static void main(String[] args) {
    Vector<Integer> v = new Vector<>();
    v.add(5);
    v.add(4);
    v.add(-1);
    v.add(2, 100);

    // Iterator를 이용한 모든 정수 출력하기
    Iterator<Integer> it = v.iterator();
    while (it.hasNext()) {
      int n = it.next();
      System.out.println(n);
    }

    // Iterator를 이용한 모든 정수 더하기
    int sum = 0;
    it = v.iterator();
    while (it.hasNext()) {
      int n = it.next();
      sum += n;
    }
    System.out.printf("벡터에 있는 정수 합: %d\n", sum);
  }

}
