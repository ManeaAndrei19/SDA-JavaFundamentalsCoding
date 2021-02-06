package testing.fundamentals;
//        Given

//        When

//        Then

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

import static org.assertj.core.api.Assertions.in;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayStringsExercisesTest {
    @Test
    void shouldSpaceInString() {
//        Given
        String text = "Ala bala portocala";
        String expectedResult = "Ala:bala:portocala";
        ArrayStringsExercises arrayEX = new ArrayStringsExercises();
//        When
        String actualResult = arrayEX.changeSpaceInString(text);
//        Then
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldAppendLenght() {
//        Given
        String text = "Characters";
        String expectedResult = "Characters10";
        ArrayStringsExercises arrayEX = new ArrayStringsExercises();
//        When
        String actualResult = arrayEX.appendLenght(text);
//        Then
        assertEquals(expectedResult, actualResult);
        assertThat(actualResult).endsWith("10");
    }

    @Test
    void shouldReplaceNumber() {
//        Given
        int[] array = {1, 5, 7, 2, 5, 4, 88};
        int[] expectedResult = {1, 5, 7, 1, 5, 2, 44};
        ArrayStringsExercises arrayEX = new ArrayStringsExercises();
//        When
        int[] actualResult = arrayEX.replaceEvenNumber(array);
//        Then
        assertArrayEquals(expectedResult, actualResult);
    }

    //    Finds the position of the min element from the array (if they are multiple elements,
//    the last position, if there aren’t => return -1)
    @Test
    void shouldFindMinPosition() {
//        Given
        int[] array = {11, 23, 10, -3, 33, 1, 333, 2, -1, 7};
        int expectedResult = 3;
        ArrayStringsExercises arrayEX = new ArrayStringsExercises();
//        When
        int actualResult = arrayEX.findMinPosition(array);
//        Then
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldFindMinPositionForEmptyArray() {
//        Given
        int[] array = {};
        int expectedResult = -1;
        ArrayStringsExercises arrayEX = new ArrayStringsExercises();
//        When
        int actualResult = arrayEX.findMinPosition(array);
//        Then
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldFindMinPositionForLastMin() {
//        Givens
        int[] array = {1, 2, 3, 4, 5, 1};
        int expectedResult = 5;
        ArrayStringsExercises arrayEX = new ArrayStringsExercises();
//        When
        int actualResult = arrayEX.findMinPosition(array);
//        Then
        assertEquals(expectedResult, actualResult);
    }

}