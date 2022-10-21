package se.lexicon;

public class Exercise07 {

  /**
   * 7. Write a program which will set up an array to hold 10 numbers and print out only the uneven numbers.
   * Expected output: Array: 1 2 4 7 9 12
   * Odd Array: 1 7 9
   */
  public static void ex7() {
int[] ex7Array = new int[10];
    ex7Array[0] = 1;
    ex7Array[1] = 2;
    ex7Array[2] = 4;
    ex7Array[3] = 7;
    ex7Array[4] = 9;
    ex7Array[5] = 12;
    System.out.print("Array: ");
    for (int number : ex7Array) {
        System.out.print(number + " ");
    }
      System.out.println();

      System.out.print("Odd Array: ");
    for (int i=0; i<ex7Array.length; i++){
      if (ex7Array[i] % 2 !=0){
        System.out.print(ex7Array[i]+" ");
      }
    }
    System.out.println("\n");
  }

}
