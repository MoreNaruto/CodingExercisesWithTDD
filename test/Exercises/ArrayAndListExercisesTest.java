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
}