package Exercises;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayAndListExercisesTest {

    private ArrayAndListExercises arrayAndListExercises;

    @Before
    public void setUp() throws Exception {
        arrayAndListExercises = new ArrayAndListExercises();
    }

    @Test
    public void allUniqueCharacters_whenWordHasNonUniqueCharacters_returnFalse() throws Exception {
        assertEquals(arrayAndListExercises.allUniqueCharacters("tree"), false);
    }

    @Test
    public void allUniqueCharacters_whenWordHasUniqueCharacters_returnTrue() throws Exception {
        assertEquals(arrayAndListExercises.allUniqueCharacters("frog"), true);
        assertEquals(arrayAndListExercises.allUniqueCharacters("hyena"), true);
        assertEquals(arrayAndListExercises.allUniqueCharacters("whistle"), true);
    }

    @Test
    public void wordPermutations_whenTwoWordsAreNotPermutations_returnFalse() throws Exception {
        assertEquals(arrayAndListExercises.wordPermutations("mor", "wpe"), false);
    }

    @Test
    public void wordPermutations_whenWordsAreNotEqualLength_returnFalse() throws Exception {
        assertEquals(arrayAndListExercises.wordPermutations("Clear", "Portal"), false);
    }

    @Test
    public void wordPermutations_whenTwoWordsArePermutations_returnTrue() throws Exception {
        assertEquals(arrayAndListExercises.wordPermutations("ball", "llba"), true);
        assertEquals(arrayAndListExercises.wordPermutations("free", "eerf"), true);
        assertEquals(arrayAndListExercises.wordPermutations("ollie", "eloil"), true);
    }

    @Test
    public void palindromePermutations_whenAnOddNumberedCharacterWordIsNotAPalindrome_returnFalse() throws Exception {
        assertEquals(arrayAndListExercises.permutationPalindrome("ripples"), false);
    }

    @Test
    public void palindromePermutations_whenAnEvenNumberedCharacterWordIsNotAPalindrome_returnFalse() throws Exception {
        assertEquals(arrayAndListExercises.permutationPalindrome("ripple"), false);
    }

    @Test
    public void palindromePermutations_whenWordIsAPalindromePermutation_returnTrue() throws Exception {
        assertEquals(arrayAndListExercises.permutationPalindrome("Catoact"), true);
        assertEquals(arrayAndListExercises.permutationPalindrome("arcrac"), true);
        assertEquals(arrayAndListExercises.permutationPalindrome("yolioli"), true);
        assertEquals(arrayAndListExercises.permutationPalindrome("thehet"), true);
    }

    @Test
    public void palindromePermutations_whenWordIsNotAPalindromePermutation_returnFalse() throws Exception {
        assertEquals(arrayAndListExercises.permutationPalindrome("Frog"), false);
    }
}