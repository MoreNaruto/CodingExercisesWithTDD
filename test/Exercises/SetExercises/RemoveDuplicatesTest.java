package Exercises.SetExercises;

import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.assertEquals;

public class RemoveDuplicatesTest {

    @Test
    public void removeDuplicate_ifLinkedLinkHasNoDuplicates_shouldNotRemoveAnyNodes() throws Exception {
        LinkedList<Integer> initialLinkedList = generateLinkedListWithAllUniqueIntegers();
        RemoveDuplicates removeDuplicates = new RemoveDuplicates(initialLinkedList);
        removeDuplicates.removeDuplication();
        assertEquals(removeDuplicates.getLinkedList(), initialLinkedList);
    }

    @Test
    public void removeDuplicate_ifLinkedLinkHasOneDuplicate_shouldRemoveThatDuplicateNode() throws Exception {
        LinkedList<Integer> initialLinkedList = generateLinkedListWithAllUniqueIntegers();
        initialLinkedList.add(1);
        RemoveDuplicates removeDuplicates = new RemoveDuplicates(initialLinkedList);
        removeDuplicates.removeDuplication();
        assertEquals(removeDuplicates.getLinkedList(), generateLinkedListWithAllUniqueIntegers());
    }

    @Test
    public void removeDuplicate_ifLinkedLinkHasMultipleDuplicate_shouldRemoveThatDuplicateNode() throws Exception {
        LinkedList<Integer> initialLinkedList = generateLinkedListWithAllUniqueIntegers();
        initialLinkedList.add(1);
        initialLinkedList.add(2);
        initialLinkedList.add(1);
        initialLinkedList.add(3);
        initialLinkedList.add(2);
        initialLinkedList.add(4);
        RemoveDuplicates removeDuplicates = new RemoveDuplicates(initialLinkedList);
        removeDuplicates.removeDuplication();
        assertEquals(removeDuplicates.getLinkedList(), generateLinkedListWithAllUniqueIntegers());
    }

    private LinkedList<Integer> generateLinkedListWithAllUniqueIntegers() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(6);
        return linkedList;
    }
}