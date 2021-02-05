package fundamentals.oop;

public class StringExercises {

//    Task A: Write a Java program to get the character at the given index within the String

    public char charaterIndexGet(String word, int index) {
        System.out.println("The character is: " + word.charAt(index - 1));
        return word.charAt(index - 1);
    }
}
