package Exercises.ArrayAndListExercises;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringCompressionTest {

    private StringCompression stringCompression;

    @Before
    public void setUp() throws Exception {
        stringCompression = new StringCompression();
    }

    @Test
    public void generateCompressedString_whenStringIsNotCompressed_returnTheOriginalString() throws Exception {
        assertEquals(stringCompression.generateCompressedString("water"), "water");
        assertEquals(stringCompression.generateCompressedString(""), "");
        assertEquals(stringCompression.generateCompressedString("w"), "w");
        assertEquals(stringCompression.generateCompressedString("we"), "we");
        assertEquals(stringCompression.generateCompressedString("were"), "were");
        assertEquals(stringCompression.generateCompressedString("there"), "there");
    }

    @Test
    public void generateCompressedString_whenStringIsCompressed_returnTheCompressedString() throws Exception {
        assertEquals(stringCompression.generateCompressedString("wetter"), "w1e1t2e1r1");
        assertEquals(stringCompression.generateCompressedString("aaabbbbbccccccc"), "a3b5c7");
        assertEquals(stringCompression.generateCompressedString("blooper"), "b1l1o2p1e1r1");
        assertEquals(stringCompression.generateCompressedString("oooooooooo"), "o10");
        assertEquals(stringCompression.generateCompressedString("tall"), "t1a1l2");
    }
}