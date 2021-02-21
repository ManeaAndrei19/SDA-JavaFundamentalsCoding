package advanced.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Input nr: ");

        try (Scanner scanner = new Scanner(System.in)) {
            if (scanner.hasNextInt()) {
                int nr = scanner.nextInt();
                System.out.println("INT= " + nr);
            } else if (scanner.hasNextDouble()) {
                double nr = scanner.nextDouble();
                System.out.println("Double= " + nr);
            } else {
                throw new MyException("Ai introdus un string");
            }
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }

        /**Try-Catch-Finnaly

         try {
         //            String text = null;
         //            text.toString();
         //            int x = 5 / 0;

         int[] array = {5, 7};
         int index = 3;

         printArrayElement(array, index);

         } catch (ArithmeticException arithmeticException) {
         System.out.println("Aritmetic exception " + arithmeticException.getMessage());
         } finally {
         System.out.println("This will be printed no matter what the value is");
         }
         }

         public static void printArrayElement(int[] array, int index) {
         if (index < 0 || index >= array.length) {
         throw new MyRuntimeException("Incorrect index value");
         }
         System.out.println(array[index]);
         */
    }


}

