package Examples;

import java.util.Scanner;

public class MaxMin {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number: ");
    int[] array = new int[5];

    for (int i = 0; i < array.length; i++) {
      array[i] = sc.nextInt();
    }

    int max = array[0];
    int min = array[0];

    for (int i = 0; i < array.length; i++) {
      if (max > array[i]) {
        max = array[i];
      }
      if (min < array[i]) {
        min = array[i];
      }
    }

    System.out.printf("Max: %d, Min: %d\n", max, min);
  }

}
