package se.lexicon;

public class Exercise10 {

  /**
   * 10.Write a program which will represent multiplication table stored in multidimensional array.
   * Hint: You have two-dimensional array with values
   * [[1,2,3,4,5,6,7,8,9,10], [1,2,3,4,5,6,7,8,9,10]]
   */
  public static void ex10() {
  int [][] MultiTable =new int [11][11];
  int i,j;

    System.out.println("Multiplication table:");
  for (j=1; j<MultiTable.length;j++) {
    MultiTable[0][j] = j;
  }
    for (i = 1; i < MultiTable.length; i++) {
      MultiTable[i][0] = i;
    }
    for (i = 1; i < MultiTable.length; i++) {
      for (j = 1; j < MultiTable[i].length; j++) {
        MultiTable[i][j]= MultiTable[0][j]*MultiTable[i][0];
      }
    }
      for (i = 1; i < MultiTable.length; i++) {
        for (j = 1; j < MultiTable[i].length; j++) {

          System.out.print(MultiTable[i][j]+"\t");
          if (j == MultiTable[i].length - 1) {
            System.out.println();
          }
        }
      }
    System.out.println();
    }
  }




