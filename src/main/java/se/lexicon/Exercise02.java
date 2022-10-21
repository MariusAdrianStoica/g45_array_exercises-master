package se.lexicon;

public class Exercise02 {

    /**
     * 2. Create a program and create a method with name ‘indexOf’ which will find and return the index of an element in the array.
     * If the element does not exist your method should return -1 as value.
     * Expected output: Index position of number 5 is: 2.
     */
    public static void ex2() {
        indexOf();
        System.out.println();
    }

    public static int indexOf() {

        int[] numbers = {4, 9, 5, 3, 2, 8};
        int element = 5;
        int index = -1;
        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == element) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Error!No Match: "+index);
        }
        else {
            System.out.println("Index position of number " + element + " is : " + index);
        }
        return index;

    }
}





