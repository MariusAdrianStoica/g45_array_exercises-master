package se.lexicon;

public class Exercise13 {

  /**
   * 13. Create two arrays with arbitrary size and fill one with random numbers.
   * Then copy over the numbers from the array with random numbers so
   * that the even numbers are located in the rear (the right side) part of the
   * array and the odd numbers are located in the front part (the left side).
   */
  public static void ex13() {

    int[] ex13A = new int[10];
    int[] newArr = new int[10];
    int[] aux = new int[10];
    int min = 0;
    int max = 1000;

    System.out.println("Array with random generated numbers:");
    for (int i = 0; i < ex13A.length; i++) {
      ex13A[i] = (int) (Math.random() * (max - min + 1) + min);
    }
    for (int number : ex13A) {
      System.out.print(number + "\t");
    }
    System.out.println("\n");

    int j = 0;
    int k = 9;
    for (int i = 0; i < ex13A.length; i++) {
      if (ex13A[i] % 2 != 0) {

        newArr[j] = ex13A[i];
        //System.out.print(i+"\t"+j+"\t");
        //System.out.print(ex13A[i]+"\t"+newArr[j]+"\t");
        //System.out.println();
        j++;


      } else {aux[k] = ex13A[i];
        //System.out.print(i+"\t"+k+"\t");
        //System.out.print(ex13A[i]+"\t"+aux[k]+"\t");
        //System.out.println();
        k--;}


    }
    k=9;
    for (int x=j; x<newArr.length;x++){
            newArr[x]=aux[k];
            k--;
    }
   System.out.println("Array with even numbers in the rear part of the array\n" +
            "*and the odd numbers in the front part:");
    for (int number : newArr) {
      System.out.print(number + "\t");
    }
    System.out.println("\n");
  }
}
