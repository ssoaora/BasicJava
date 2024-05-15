package Chap07.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class HashMapEx {

  public static void main(String[] args) {
    HashMap<String, String> dic = new HashMap<>();

    dic.put("baby", "아기");
    dic.put("love", "사랑");
    dic.put("apple", "사과");

    // dic HashMap에 들어있는 모든 (key, value) 쌍 출력
    Set<String> keys = dic.keySet();
    Iterator<String> it = keys.iterator();
    while (it.hasNext()) {
      String key = it.next();
      String value = dic.get(key);
      System.out.printf("(%s, %s)%n", key, value);
    }
    System.out.println();

    // 사용자로부터 영어 단어를 입력 받고 한글 단어 검색
    Scanner scanner = new Scanner(System.in);
    for (int i = 0; i < 3; i++) {
      System.out.print("찾고 싶은 단어 입력 >> ");
      String eng = scanner.next();

      String kor = dic.get(eng);
      if (kor == null) {
        System.out.printf("%s는 없는 단어입니다.%n", eng);
      }
      else {
        System.out.printf("%s는 %s%n", eng, kor);
      }
    }
  }

}
