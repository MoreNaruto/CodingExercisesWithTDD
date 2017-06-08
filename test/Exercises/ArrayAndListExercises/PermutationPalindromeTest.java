package Exercises.ArrayAndListExercises;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by tmosq on 6/7/17.
 */
public class PermutationPalindromeTest {

    private PermutationPalindrome permutationPalindrome;

    @Before
    public void setUp() throws Exception {
        permutationPalindrome = new PermutationPalindrome();
    }

    @Test
    public void palindromePermutations_whenAnOddNumberedCharacterWordIsNotAPalindrome_returnFalse() throws Exception {
        assertEquals(permutationPalindrome.permutationPalindrome("ripples"), false);
    }

    @Test
    public void palindromePermutations_whenAnEvenNumberedCharacterWordIsNotAPalindrome_returnFalse() throws Exception {
        assertEquals(permutationPalindrome.permutationPalindrome("ripple"), false);
    }

    @Test
    public void palindromePermutations_whenWordIsAPalindromePermutation_returnTrue() throws Exception {
        assertEquals(permutationPalindrome.permutationPalindrome("Catoact"), true);
        assertEquals(permutationPalindrome.permutationPalindrome("arcrac"), true);
        assertEquals(permutationPalindrome.permutationPalindrome("yolioli"), true);
        assertEquals(permutationPalindrome.permutationPalindrome("thehet"), true);
    }

    @Test
    public void palindromePermutations_whenWordIsNotAPalindromePermutation_returnFalse() throws Exception {
        assertEquals(permutationPalindrome.permutationPalindrome("Frog"), false);
    }
}