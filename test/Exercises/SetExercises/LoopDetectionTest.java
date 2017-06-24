package Exercises.SetExercises;

import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;

public class LoopDetectionTest {

    private LoopDetection loopDetection;

    @Before
    public void setUp() throws Exception {
        loopDetection = new LoopDetection();
    }

    @Test
    public void getInitialLoopedNode_whenLinkedListIsEmpty_returnNull() throws Exception {
        assertNull(loopDetection.getInitialLoopedNode(new LinkedList<>()));
    }

    @Test
    public void getInitialLoopedNode_whenThereIsNotInitialLoopedNode_returnNull() throws Exception {
        LinkedList<Character> characterLinkedList = new LinkedList<>();
        characterLinkedList.add('a');
        characterLinkedList.add('b');
        characterLinkedList.add('c');
        characterLinkedList.add('d');
        characterLinkedList.add('e');

        assertNull(loopDetection.getInitialLoopedNode(characterLinkedList));
    }

    @Test
    public void getInitialLoopedNode_whenThereIsInitialLoopedNode_returnInitialNode() throws Exception {
        LinkedList<Character> characterLinkedList = new LinkedList<>();
        characterLinkedList.add('a');
        characterLinkedList.add('b');
        characterLinkedList.add('c');
        characterLinkedList.add('d');
        characterLinkedList.add('c');

        assertEquals(loopDetection.getInitialLoopedNode(characterLinkedList).charValue(), 'c');
    }
}