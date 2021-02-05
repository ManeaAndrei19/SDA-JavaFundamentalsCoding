package fundamentals.oop;

import java.util.Scanner;

public class ArrayExercises {

//    Task A: Write a Java program to find maximum product of two integers in a given array of integers.
//            Example: nums = { 2, 3, 5, 7, -7, 5, 8, -5 } => Pair is (7, 8), Maximum Product: 56


    public void maxProduct(int[] array) {
        int neg1 = Integer.MAX_VALUE, neg2 = Integer.MAX_VALUE, p1 = Integer.MIN_VALUE, p2 = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                if (array[i] < neg1) {
                    neg2 = neg1;
                    neg1 = array[i];
                } else if (array[i] < neg2) {
                    neg2 = array[i];
                }
            } else {
                if (array[i] > p1) {
                    p2 = p1;
                    p1 = array[i];
                } else if (array[i] > p2) {
                    p2 = array[i];
                }
            }
        }
        if (p1 * p2 > neg1 * neg2) {
            System.out.println("Pair is (" + p1 + ", " + p2 + " ) \nMaximum Product: " + p1 * p2);

        } else {
            System.out.println("Pair is (" + neg1 + ", " + neg2 + " ) \nMaximum Product: " + neg1 * neg2);

        }
    }


//    Task B: Write a Java program to test if an array of strings contains a specific value.

    public void testStringArray(String[] array) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input the word: ");
        String word = scan.nextLine();
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(word)) {
                System.out.println("The array contains the word");
                return;
            }
        }
        System.out.println("The array doesn't contain the word");
    }

}
