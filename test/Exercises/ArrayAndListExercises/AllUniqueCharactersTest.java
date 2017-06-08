package Exercises.ArrayAndListExercises;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by tmosq on 6/7/17.
 */
public class AllUniqueCharactersTest {

    private AllUniqueCharacters allUniqueCharacters;

    @Before
    public void setUp() throws Exception {
        allUniqueCharacters = new AllUniqueCharacters();
    }

    @Test
    public void allUniqueCharacters_whenWordHasNonUniqueCharacters_returnFalse() throws Exception {
        assertEquals(allUniqueCharacters.allUniqueCharacters("tree"), false);
    }

    @Test
    public void allUniqueCharacters_whenWordHasUniqueCharacters_returnTrue() throws Exception {
        assertEquals(allUniqueCharacters.allUniqueCharacters("frog"), true);
        assertEquals(allUniqueCharacters.allUniqueCharacters("hyena"), true);
        assertEquals(allUniqueCharacters.allUniqueCharacters("whistle"), true);
    }
}