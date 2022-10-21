package se.lexicon;

import java.util.Arrays;

public class Exercise04 {

  /**
   * 4. Write a program which will copy the elements of one array into another array.
   * Expected output:
   * Elements from first array: 1 15 20
   * Elements from second array: 1 15 20
   */
  public static void ex4() {
    int[] ex4Array = {1, 15, 20};
    System.out.print("Elements from first  array: ");
    for (int number : ex4Array) {
      System.out.print(number + "\t");
    }
    System.out.println();
    int[] ex4Array_copy = Arrays.copyOf(ex4Array, 3);
    System.out.print("Elements from second array: ");
    for (int number : ex4Array_copy) {
            System.out.print(number + "\t");
    }
    System.out.println("\n");
  }
}
