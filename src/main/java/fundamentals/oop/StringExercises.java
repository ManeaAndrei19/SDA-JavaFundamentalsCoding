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

//    Task C: Write a Java program to replace a specified character with another character in a string.

    public String changeChar(String text, char before, char after) {
        System.out.println("Word before change: " + text);
        text = text.replace(before, after);
        System.out.println("Word after change: " + text);

        return text;
    }
}
