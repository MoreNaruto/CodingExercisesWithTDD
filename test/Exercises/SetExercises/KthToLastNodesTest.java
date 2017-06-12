package Exercises.SetExercises;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;

import static org.junit.Assert.assertEquals;

public class KthToLastNodesTest {

    @Test
    public void findKthToLastNodes_ifOneIsProvided_returnArrayListOfNodes() throws Exception {
        LinkedList<Integer> initialLinkedList = new LinkedList<>();
        initialLinkedList.addAll(generateArrayList());
        KthToLastNodes kthToLastNodes = new KthToLastNodes(initialLinkedList);

        assertEquals(kthToLastNodes.getKthToLastNodes(1), generateArrayList());
    }

    @Test
    public void findKthToLastNodes_ifLinkedListSizeIsProvided_returnLastNodeInArrayList() throws Exception {
        LinkedList<Integer> initialLinkedList = new LinkedList<>();
        initialLinkedList.addAll(generateArrayList());
        KthToLastNodes kthToLastNodes = new KthToLastNodes(initialLinkedList);

        ArrayList<Integer> expectedArrayList = new ArrayList<>();
        expectedArrayList.add(6);
        assertEquals(kthToLastNodes.getKthToLastNodes(initialLinkedList.size()), expectedArrayList);
    }

    @Test
    public void findKthToLastNodes_ifThreeIsProvided_return3rdToLastNodesInArrayList() throws Exception {
        LinkedList<Integer> initialLinkedList = new LinkedList<>();
        initialLinkedList.addAll(generateArrayList());
        KthToLastNodes kthToLastNodes = new KthToLastNodes(initialLinkedList);

        ArrayList<Integer> expectedArrayList = new ArrayList<>();
        expectedArrayList.add(3);
        expectedArrayList.add(4);
        expectedArrayList.add(5);
        expectedArrayList.add(6);
        assertEquals(kthToLastNodes.getKthToLastNodes(3), expectedArrayList);
    }

    private ArrayList<Integer> generateArrayList() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        return arrayList;
    }
}