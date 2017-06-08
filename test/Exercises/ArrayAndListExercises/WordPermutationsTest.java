package Exercises.ArrayAndListExercises;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by tmosq on 6/7/17.
 */
public class WordPermutationsTest {

    private WordPermutations wordPermutations;

    @Before
    public void setUp() throws Exception {
        wordPermutations = new WordPermutations();
    }

    @Test
    public void wordPermutations_whenTwoWordsAreNotPermutations_returnFalse() throws Exception {
        assertEquals(wordPermutations.wordPermutations("mor", "wpe"), false);
    }

    @Test
    public void wordPermutations_whenWordsAreNotEqualLength_returnFalse() throws Exception {
        assertEquals(wordPermutations.wordPermutations("Clear", "Portal"), false);
    }

    @Test
    public void wordPermutations_whenTwoWordsArePermutations_returnTrue() throws Exception {
        assertEquals(wordPermutations.wordPermutations("ball", "llba"), true);
        assertEquals(wordPermutations.wordPermutations("free", "eerf"), true);
        assertEquals(wordPermutations.wordPermutations("ollie", "eloil"), true);
    }
}