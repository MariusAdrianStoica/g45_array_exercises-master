package se.lexicon;

public class Exercise08 {

  /**
   * 8. Write a program which will remove the duplicate elements of a given array [20, 20, 40, 20, 30, 40, 50, 60, 50].
   * Expected output:
   * Array: 20 20 40 20 30 40 50 60 50
   * Array without duplicate values: 20 40 30 50 60
   */
  public static void ex8() {
    int[] ex8A = {20, 20, 40, 20, 30, 40, 50, 60, 50};

    int[] ex8AWD = new int[ex8A.length];
    int n = ex8A.length;
    int k = 0; //position in ex8AWD
    int i=0; //position in ex8A
    int z=0; // index in ex8AWD to verify duplicates
    System.out.print("Array: ");
    for (int number : ex8A) {
      System.out.print(number + " ");
    }
    System.out.println("\n");
    System.out.println(n);
    //Arrays.sort(ex8A);


    ex8AWD[0] = ex8A[0];
    System.out.println(i + "\t" + k + "\t" + z + "\t" + ex8A[i] + "\t" + ex8AWD[k]);

    i=i+1;
    k=k+1;

    ex8AWD[k]=ex8A[i];


    if (ex8AWD[k] == ex8AWD[z]){
            ex8AWD[k]=0;
    }
    System.out.println(i + "\t" + k+  "\t"+z  + "\t" + ex8A[i] + "\t" + ex8AWD[k] );

    i=i+1;
    System.out.print(i+"\t");
    k=k+1;
    z=0;
    ex8AWD[k]=ex8A[i];
boolean duplicate = false;
for (int x=0;x<k;x++) {
  if (ex8AWD[i] == ex8AWD[z]) {

    ex8AWD[k] = 0;
    duplicate =true;
    continue;

  }
}

if (duplicate){
  k=k-1;
}

  System.out.println(i + "\t" + k+  "\t"+z  + "\t" + ex8A[i] + "\t" + ex8AWD[k]);

    /*for (int i = 1; i < 5; i++) {
      //int i=1;


      System.out.print("i:" + i + "\t" + "k:" + k + "\t" + ex8A[i] + "\t" + ex8AWD[k] + "\t");
      boolean duplicate = false;
      while (!duplicate) {
        for (int x = 0; x < k; x++) {
          System.out.print("i:" + i + "\t" + "k:" + k + "\t" + "# " + x + "\t" + ex8A[i] + "\t" + ex8AWD[k] + "\t" + ex8AWD[x] + "\t");
          System.out.println("\n");
          if (ex8A[i] == ex8AWD[x]) {
            ex8AWD[k] = 0;
            duplicate = true;

          }


        }
      }
      if (duplicate) {
        System.out.println(k);
        System.out.println("\n");
      }
      else{
        ex8AWD[k] = ex8A[i];
        k=k+1;
      }
    }
         // System.out.println(ex8A[i]+"\t"+ex8AWD[k]);
                //System.out.print(i+"\t"+k+"\t"+ex8A[i]+"\t"+ex8AWD[k]);
              System.out.println("\n");



      }

    */
    System.out.print("Array without duplicate values: ");
    for (z = 0; z < 6; z++) {
      System.out.print(ex8AWD[z] + " ");
    }

    System.out.println("\n");
    System.out.println("!!!Need something to keep position!!!");
    System.out.println("\n");
  }
}








