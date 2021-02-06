package testing.fundamentals;

//        Replaces all the spaces in a text with “:”
//        Ads in a text, after every “a” letter the length of the text read until then.
//        Appends to the end of the text the number of “z” letters found in the text
//        Replaces all the even number in an array with their half
//        Specifies if the array contains elements that fit inside a number interval
//        Finds the position of the min element from the array (if they are multiple elements, the last position,
//        if there aren’t => return -1)


public class ArrayStringsExercises {

    public String changeSpaceInString(String text) {
        return text.replace(' ', ':');
    }

    public String insertLenghtAfterLetterA(String text) {
        return "";
    }

    public String appendLenght(String text) {
        return text + text.length();
    }

    public int[] replaceEvenNumber(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array[i] /= 2;
            }
        }

        return array;
    }


    //    Finds the position of the min element from the array (if they are multiple elements,
//    the last position, if there aren’t => return -1)
    public int findMinPosition(int[] array) {
        if (array.length == 0) {
            return -1;
        }
        int minim = array[0];
        int position = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= minim) {
                minim = array[i];
                position = i;
            }
        }
        return position;
    }
}
