package fundamentals.oop;

public class StringExercises {

//    Task A: Write a Java program to get the character at the given index within the String

    public char charaterIndexGet(String word, int index) {
        System.out.println("The character is: " + word.charAt(index - 1));
        return word.charAt(index - 1);
    }

//    Task B: Write a Java program to test if a given string contains the
//    specified sequence of char values (another string).

    public void stringInStringCheck(String search, String find) {
        boolean foundIt = false;
        for (int i = 0; i <= (search.length() - find.length()); i++) {
            if (search.regionMatches(i, find, 0, find.length())) {
                foundIt = true;
                System.out.println("Match found.");
                break;
            }
        }
        if (!foundIt)
            System.out.println("No match found.");
    }

}
