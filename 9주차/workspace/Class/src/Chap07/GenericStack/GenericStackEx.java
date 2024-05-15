package Chap07.GenericStack;

class GStack<T> {
  int tos;
  Object[] stck;

  public GStack() {
    tos = 0;
    stck = new Object[10];
  }

  public void push(T item) {
    if (tos == 10) {
      return;
    }
    stck[tos] = item;
    tos++;
  }

  public T pop() {
    if (tos == 0) {
      return null;
    }
    tos--;
    return (T) stck[tos];
  }
}

public class GenericStackEx {

  public static void main(String[] args) {
    GStack<String> stringStack = new GStack<>();
    stringStack.push("Seoul");
    stringStack.push("Busan");
    stringStack.push("LA");

    for (int i = 0; i < 3; i++) {
      System.out.println(stringStack.pop());
    }

    GStack<Integer> intStack = new GStack<>();
    intStack.push(1);
    intStack.push(3);
    intStack.push(5);

    for (int i = 0; i < 3; i++) {
      System.out.println(intStack.pop());
    }
  }
}
