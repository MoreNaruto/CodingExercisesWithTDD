package Exercises.ArrayAndListExercises;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringRotationTest {

    private StringRotation stringRotation;

    @Before
    public void setUp() throws Exception {
        stringRotation = new StringRotation();
    }

    @Test
    public void isARotatedString_theProvidedStringIsNotTheSameLengthAsTheOriginal() throws Exception {
        assertEquals(stringRotation.isARotatedString("hotel", "htle"), false);
        assertEquals(stringRotation.isARotatedString("frogs", "frog"), false);
        assertEquals(stringRotation.isARotatedString("cooking", "cook"), false);
        assertEquals(stringRotation.isARotatedString("kimberly", "kim"), false);
    }

    @Test
    public void isARotatedString_theProvidedStringIsSameAsTheOriginalString() throws Exception {
        assertEquals(stringRotation.isARotatedString("hotel", "hotel"), false);
        assertEquals(stringRotation.isARotatedString("frogs", "frogs"), false);
        assertEquals(stringRotation.isARotatedString("cooking", "cooking"), false);
        assertEquals(stringRotation.isARotatedString("kimberly", "kimberly"), false);
    }

    @Test
    public void isARotatedString_theProvidedStringIsNotARotatedString() throws Exception {
        assertEquals(stringRotation.isARotatedString("hotel", "htole"), false);
        assertEquals(stringRotation.isARotatedString("grindhouse", "housegirnd"), false);
        assertEquals(stringRotation.isARotatedString("lollipop", "lillpopo"), false);
        assertEquals(stringRotation.isARotatedString("pediatrician", "tripediacain"), false);
    }

    @Test
    public void isARotatedString_theProvidedStringIsARotatedString() throws Exception {
        assertEquals(stringRotation.isARotatedString("waterbottle", "wabottleter"), true);
        assertEquals(stringRotation.isARotatedString("hyena", "nahye"), true);
        assertEquals(stringRotation.isARotatedString("birdhouse", "rdbihouse"), true);
        assertEquals(stringRotation.isARotatedString("chicken", "hiccken"), true);
        assertEquals(stringRotation.isARotatedString("chevron", "vcheron"), true);
    }
}