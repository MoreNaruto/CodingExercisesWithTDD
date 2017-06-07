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
    }
}