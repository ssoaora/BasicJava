// Problem 05
// 해답 봤음. 다시 풀어보기.

import java.util.Scanner;

interface StackInterface {
  int length();
  String pop();
  boolean push(String ob);
}

class StringStack implements StackInterface {
  private String[] stackArray;
  private int length;
  private int top;

  public StringStack(int length) {
    this.length = length;
    stackArray = new String[length];
    this.top = -1;
  }

  @Override
  public int length() {
    return top + 1;
  }

  @Override
  public String pop() {
    if (top == -1) {
      System.out.println("Stack is empty");
      return null;
    }
    else {
      String popped = stackArray[top];
      top--;
      return popped;
    }
  }

  @Override
  public boolean push(String ob) {
    if (top == length - 1) {
      System.out.println("Stack is full");
      return false;
    }
    else {
      top++;
      stackArray[top] = ob;
      return true;
    }
  }
}

public class StackManager {

  public static void main(String[] args) {
    StringStack st = new StringStack(5);

    Scanner sc = new Scanner(System.in);
    System.out.print("문자열 5개 입력 >> ");

    for (int i = 0; i < 5; i++) {
      String input = sc.next();
      st.push(input);
    }

    while (st.length() > 0) {
      System.out.print(st.pop() + " ");
    }
  }
}
