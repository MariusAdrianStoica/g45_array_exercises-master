package se.lexicon;

import java.text.DecimalFormat;

public class Exercise06 {

    /**
     * 6. Write a program which will set up an array to hold the next values in this order: 43, 5, 23, 17, 2, 14 and print the average of these 6 numbers.
     * Expected output: Average is: 17.3
     */
    public static void ex6() {
        int[] ex6Array = {43, 5, 23, 17, 2, 14};
        int sum = 0;
        int n = ex6Array.length; //length
        for (int i = 0; i < n; i++) {
            sum = sum + ex6Array[i];
        }

        DecimalFormat numberFormat = new DecimalFormat("#.#");
        double avg = sum / (float) n;
        System.out.println("Average is :" + numberFormat.format(avg));
        System.out.println("how to print with one decinal?");
    }

}
