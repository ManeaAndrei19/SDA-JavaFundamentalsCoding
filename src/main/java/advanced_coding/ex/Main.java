package advanced_coding.ex;

public class Main {
    public static void main(String[] args) {
        System.out.println(displayLongestString("James", "Andrei", "Uvuzeueossasa"));
    }

    private static String displayLongestString(String... longestStringArray) {
        int aux = 0;
        String longestString = null;
        for (String element : longestStringArray) {
            if (aux < element.length()) {
                aux = element.length();
                longestString = element;
            }
        }
        return longestString;
    }
}
