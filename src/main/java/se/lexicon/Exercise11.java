package se.lexicon;
import java.util.Arrays;
import java.util.Scanner;
public class Exercise11 {

  /**
   * 11.Write a program that ask the user for an integer and repeat that
   * question until user give you a specific value that user already has been
   * told about as a message in your program. Store these values in an array
   * and print that array. After that reverse the array elements so that the
   * first element becomes the last element, the second element becomes
   * the second to last element, etc. Do not just reverse the order in which
   * they are printed. You need to change the way they are stored in the
   * array.
   */
  public static void ex11() {
    int[] ex11A = new int[1];
    Scanner sc = new Scanner(System.in);
    int count2 = 0;

    boolean enter = true;

    while (enter) {
      System.out.print("Please enter a value-type int-"+"\n"+"or << 0 >> if you want to stop:");
      int number = sc.nextInt();
      if (number != 0) {
        ex11A= Arrays.copyOf(ex11A, ex11A.length + 1);
        ex11A[count2] = number;
        count2 = count2 + 1;
      } else enter = false;
    }
    System.out.println("Array from user input:");
  for(int i=0;i<count2;i++){
  System.out.print(ex11A[i]+"\t");
  }
    System.out.println();
    int[] newArr =Arrays.copyOf(ex11A, ex11A.length);

    for (int i=0;i<count2;i++){
      newArr[count2-1-i]=ex11A[i];
    }

    System.out.println("Array in reverse order:");
    for(int i=0;i<count2;i++){
      System.out.print(newArr[i]+"\t");
    }
    System.out.println("\n");

  }

  }
