package se.lexicon;

public class Exercise05 {

  /**
   * 5. Create a two-dimensional string array [2][2]. Assign values to the 2d array containing any Country and City.
   * Expected output:
   *              France Paris
   *              Sweden Stockholm
   */
  public static void ex5() {
    String[][] ex5Array = new String[2][2];
    ex5Array[0][0] = "France";
    ex5Array[0][1] = "Paris";
    ex5Array[1][0] = "Sweden";
    ex5Array[1][1] = "Stockholm";

    for(int i=0; i<ex5Array.length;i++){
      for(int j=0;j<ex5Array[i].length;j++ ){
        System.out.print(ex5Array[i][j]+"\t");
        if(j == ex5Array[i].length -1) {
          System.out.println();
        }
      }
    }
    System.out.println();
  }
}
