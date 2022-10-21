package se.lexicon;
import java.util.Arrays;
public class Exercise08 {

  /**
   * 8. Write a program which will remove the duplicate elements of a given array [20, 20, 40, 20, 30, 40, 50, 60, 50].
   * Expected output:
   * Array: 20 20 40 20 30 40 50 60 50
   * Array without duplicate values: 20 40 30 50 60
   */
  public static void ex8() {

        int[] ex8A = {20, 20, 40, 20, 30, 40, 50, 60, 50};
        //int [] ex8AWD = Arrays.copyOf(ex8A,ex8A.length);
        int n = ex8A.length;

        System.out.print("Array: ");
        for (int number : ex8A) {
          System.out.print(number + " ");
        }
        System.out.println();

        Arrays.sort(ex8A);


        System.out.print("Array without duplicate values: ");

        for (int i = 0; i < n-1; i++) {
          if(ex8A[i]!=ex8A[i+1]){
            System.out.print(ex8A[i] + " ");
          }
        }

        System.out.println("\n");
        System.out.println( "!!!Need something to keep position!!!");
        System.out.println("\n");
      }
    }
