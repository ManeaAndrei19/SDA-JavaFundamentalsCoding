package advanced.exceptions;

public class Main {
    public static void main(String[] args) {

        /**Try-Catch-Finnaly
         */
        try {
//            String text = null;
//            text.toString();
//            int x = 5 / 0;

            int[] array = {5, 7};
            int index = 3;

            printArrayElement(array, index);

        } catch (ArithmeticException arithmeticException) {
            System.out.println("Aritmetic exception " + arithmeticException.getMessage());
        }finally {
            System.out.println("This will be printed no matter what the value is");
        }
    }

    public static void printArrayElement(int[] array, int index) {
        if (index < 0 || index >= array.length) {
            throw new MyRuntimeException("Incorrect index value");
        }
        System.out.println(array[index]);
    }

}

