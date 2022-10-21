package se.lexicon;
import java.util.Arrays;
public class Exercise03 {

  /**
   * 3. Write a program which will sort string array.
   * Expected output:
   *                String array: [Paris, London, New York, Stockholm]
   *                Sort string array: [London, New York, Paris, Stockholm]
   */
  public static void ex3() {
String[] capitals = new String []{"Paris", "London", "New York", "Stockholm"};
Arrays.sort(capitals);

for (String capital : capitals){
  System.out.print(capital+" ");
}
    System.out.println("\n");
  }
}
