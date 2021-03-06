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

//    Task D: Write a Java program to uppercase first letter of every word in a text(string).

    public String upper(String text) {
        String[] array = text.split(" ");
        StringBuffer sb = new StringBuffer();

        System.out.println(text);

        for (int i = 0; i < array.length; i++) {
            sb.append(Character.toUpperCase(array[i].charAt(0)))
                    .append(array[i].substring(1)).append(" ");
        }

        System.out.println(sb.toString().trim());

        return sb.toString().trim();
    }

//    Task E: Write a Java program to compare 2 strings ignoring case consideration.  (e.g: “Dog” is equal to “dOG”)

    public void compareNoCase(String text1, String text2) {
        if (text1.equalsIgnoreCase(text2)) {
            System.out.println("Texts are equal");
            return;
        }
        System.out.println("Texts aren't equal");
    }

}
