package Exercises.ArrayAndListExercises;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OneAwayTest {

    private OneAway oneAway;

    @Before
    public void setUp() throws Exception {
        oneAway = new OneAway();
    }

    @Test
    public void wordModifiedOneWay_ifWordIsTheSame_returnFalse() throws Exception {
        assertEquals(oneAway.wordModifiedOneWay("frog", "frog"), false);
    }

    @Test
    public void wordModifiedOneWay_whenModifiedWordLengthIsLessThanOrMoreThanOne_returnFalse() throws Exception {
        assertEquals(oneAway.wordModifiedOneWay("tall", "ta"), false);
        assertEquals(oneAway.wordModifiedOneWay("root", "rooter"), false);
        assertEquals(oneAway.wordModifiedOneWay("", "werrew"), false);
        assertEquals(oneAway.wordModifiedOneWay("erwerwe", ""), false);
    }

    @Test
    public void wordModifiedOneWay_whenOriginalWordRemovesOneCharacterToBeBlank_returnTrue() throws Exception {
        assertEquals(oneAway.wordModifiedOneWay("t", ""), true);
        assertEquals(oneAway.wordModifiedOneWay("r", ""), true);
    }

    @Test
    public void wordModifiedOneWay_whenBlankOriginalWordInsertsOneCharacter_returnTrue() throws Exception {
        assertEquals(oneAway.wordModifiedOneWay("", "t"), true);
        assertEquals(oneAway.wordModifiedOneWay("", "r"), true);
    }

    @Test
    public void wordModifiedOneWay_whenOriginalWordRemovesOneCharacterToBeModifiedWordWithOneLessCharacter_returnTrue() throws Exception {
        assertEquals(oneAway.wordModifiedOneWay("tall", "tal"), true);
        assertEquals(oneAway.wordModifiedOneWay("tall", "tll"), true);
        assertEquals(oneAway.wordModifiedOneWay("frog", "rog"), true);
        assertEquals(oneAway.wordModifiedOneWay("frog", "fog"), true);
    }

    @Test
    public void wordModifiedOneWay_whenOriginalWordRemovesOneCharacterToBeModifiedWordWithOneLessCharacterButOutOfOrder_returnFalse() throws Exception {
        assertEquals(oneAway.wordModifiedOneWay("tall", "alt"), false);
        assertEquals(oneAway.wordModifiedOneWay("tall", "lal"), false);
        assertEquals(oneAway.wordModifiedOneWay("frog", "rgo"), false);
        assertEquals(oneAway.wordModifiedOneWay("yorick", "yorkc"), false);
    }

    @Test
    public void wordModifiedOneWay_whenOriginalWordAddsOneCharacterToBeModifiedWordWithOneMoreCharacter_returnTrue() throws Exception {
        assertEquals(oneAway.wordModifiedOneWay("tall", "talls"), true);
        assertEquals(oneAway.wordModifiedOneWay("tall", "stall"), true);
        assertEquals(oneAway.wordModifiedOneWay("tall", "talel"), true);
        assertEquals(oneAway.wordModifiedOneWay("tall", "thall"), true);
    }

    @Test
    public void wordModifiedOneWay_whenOriginalWordAddsOneCharacterToBeModifiedWordWithOneMoreCharacterButOutOfOrder_returnFalse() throws Exception {
        assertEquals(oneAway.wordModifiedOneWay("tall", "tlals"), false);
        assertEquals(oneAway.wordModifiedOneWay("tall", "tslla"), false);
        assertEquals(oneAway.wordModifiedOneWay("tall", "ltale"), false);
        assertEquals(oneAway.wordModifiedOneWay("tall", "thlla"), false);
    }

    @Test
    public void wordModifiedOneWay_whenOriginalWordReplaceOneCharacterToBeModifiedWordWithOneReplacedCharacter_returnTrue() throws Exception {
        assertEquals(oneAway.wordModifiedOneWay("tall", "ball"), true);
        assertEquals(oneAway.wordModifiedOneWay("tall", "tell"), true);
        assertEquals(oneAway.wordModifiedOneWay("tall", "tale"), true);
        assertEquals(oneAway.wordModifiedOneWay("tall", "fall"), true);
    }

    @Test
    public void wordModifiedOneWay_whenOriginalWordReplaceOneCharacterToBeModifiedWordWithOneReplacedCharacterButOutOfOrder_returnTrue() throws Exception {
        assertEquals(oneAway.wordModifiedOneWay("tall", "blla"), false);
        assertEquals(oneAway.wordModifiedOneWay("tall", "letl"), false);
        assertEquals(oneAway.wordModifiedOneWay("tall", "tlae"), false);
        assertEquals(oneAway.wordModifiedOneWay("tall", "flla"), false);
    }

    @Test
    public void wordModifiedOneWay_whenOriginalWordReplaceOneCharacterToBeModifiedWordWithOneReplacedCharacterButOccursMoreThanOnce_returnTrue() throws Exception {
        assertEquals(oneAway.wordModifiedOneWay("tall", "balls"), false);
        assertEquals(oneAway.wordModifiedOneWay("tall", "tele"), false);
        assertEquals(oneAway.wordModifiedOneWay("tall", "ta"), false);
        assertEquals(oneAway.wordModifiedOneWay("tall", "fale"), false);
    }
}