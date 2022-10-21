package se.lexicon;

import java.util.Arrays;
import java.util.Scanner;
public class Exercise09 {

  /**
   * 9. Write a method which will add elements in an array.
   * Remember that arrays are fixed in size, so you need to come up with a
   * solution to “expand” the array
   */
  public static void ex9() {

    String[] ex9A = new String[]{"Marius","Adrian","Stoica"};
    String[] newArray = Arrays.copyOf(ex9A,ex9A.length);
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter element:");
    String element = sc.nextLine();


    newArray = addElement(ex9A,element);
    System.out.print("New Array contains elements: ");
    for (String elem : newArray) {
      System.out.print(elem + " ");
    }

    System.out.println("\n");
  }

  public static String[] addElement(String[] ex9A,String element) {
    String[] newArray = Arrays.copyOf(ex9A,ex9A.length + 1);

    newArray[newArray.length - 1]= element;
    return newArray;

  }
}


