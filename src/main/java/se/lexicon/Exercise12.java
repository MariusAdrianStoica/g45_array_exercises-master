package se.lexicon;

public class Exercise12 {

  /**
   * 12.Write a program which will print the diagonal elements of two-dimensional array.
   * Expected output: 1 4 9
   */
  public static void ex12() {
    int[][] ex12A = new int[3][3];

    int number =1;


    for (int i = 0; i < ex12A.length; i++) {
      for (int j = 0; j < ex12A[i].length; j++) {

        ex12A[i][j] = number;
        number = number+1;

      }
    }

    for (int i = 0; i < ex12A.length; i++) {
      //for (int j = 0; j < ex12A[i].length; j++) {
        System.out.print(ex12A[i][i] + "\t");
        if (i == ex12A[i].length - 1) {
          System.out.println();
        }
      }
      System.out.println();
    }
  }



