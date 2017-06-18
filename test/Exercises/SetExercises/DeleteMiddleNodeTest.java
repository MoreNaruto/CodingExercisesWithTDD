package Exercises.SetExercises;

import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;

public class DeleteMiddleNodeTest {

    private DeleteMiddleNode deleteMiddleNode;
    private LinkedList<Character> characterLinkedList;

    @Before
    public void setUp() throws Exception {
        characterLinkedList = generateLinkedListsOfCharacters();
        deleteMiddleNode = new DeleteMiddleNode(characterLinkedList);
    }

    @Test
    public void deleteMiddleNode_whenSizeOfLinkedListIsEven_shouldReturnLinkedListWithMiddleNodeGone() throws Exception {
        deleteMiddleNode.deleteMiddleNode();

        LinkedList<Character> expectedCharacters = generateLinkedListsOfCharacters();
        expectedCharacters.remove(2);

        assertEquals(deleteMiddleNode.getLinkedList(), expectedCharacters);
    }

    @Test
    public void deleteMiddleNode_whenSizeOfLinkedListIsOdd_shouldReturnLinkedListWithMiddleNodeGone() throws Exception {
        characterLinkedList.add('g');
        deleteMiddleNode.deleteMiddleNode();

        LinkedList<Character> expectedCharacters = generateLinkedListsOfCharacters();
        expectedCharacters.add('g');
        expectedCharacters.remove(3);

        assertEquals(deleteMiddleNode.getLinkedList(), expectedCharacters);
    }

    private LinkedList<Character> generateLinkedListsOfCharacters() {
        LinkedList<Character> linkedList = new LinkedList<>();
        linkedList.add('a');
        linkedList.add('b');
        linkedList.add('c');
        linkedList.add('d');
        linkedList.add('e');
        linkedList.add('f');
        return linkedList;
    }
}