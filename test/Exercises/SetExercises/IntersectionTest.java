package Exercises.SetExercises;

import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;

public class IntersectionTest {

    private Intersection intersection;

    @Before
    public void setUp() throws Exception {
        intersection = new Intersection();
    }

    @Test
    public void intersectingNode_whenBothLinkedListsAreEmpty_returnNull() throws Exception {
        assertNull(intersection.intersectingNode(new LinkedList<Integer>(), new LinkedList<Integer>()));
    }

    @Test
    public void intersectingNode_whenLinkedListHaveNonIntersectingPoints_returnNull() throws Exception {
        LinkedList<Integer> firstLinkedList = new LinkedList<>();
        LinkedList<Integer> secondLinkedList = new LinkedList<>();

        firstLinkedList.add(0);
        firstLinkedList.add(1);
        firstLinkedList.add(2);
        firstLinkedList.add(3);

        secondLinkedList.add(4);
        secondLinkedList.add(5);
        secondLinkedList.add(6);
        secondLinkedList.add(7);

        assertNull(intersection.intersectingNode(firstLinkedList, secondLinkedList));
    }

    @Test
    public void intersectingNode_whenLinkedListHaveAnIntersectingPointAtEndOfBothList_returnTheEndNode() throws Exception {
        LinkedList<Integer> firstLinkedList = new LinkedList<>();
        LinkedList<Integer> secondLinkedList = new LinkedList<>();

        firstLinkedList.add(0);
        firstLinkedList.add(1);
        firstLinkedList.add(2);
        firstLinkedList.add(3);

        secondLinkedList.add(4);
        secondLinkedList.add(5);
        secondLinkedList.add(6);
        secondLinkedList.add(3);

        assertEquals(intersection.intersectingNode(firstLinkedList, secondLinkedList).intValue(), 3);
    }

    @Test
    public void intersectingNode_whenLinkedListHaveAnIntersectingPointAtEndOfBothListWithDifferentSizes_returnTheEndNode() throws Exception {
        LinkedList<Integer> firstLinkedList = new LinkedList<>();
        LinkedList<Integer> secondLinkedList = new LinkedList<>();

        firstLinkedList.add(3);

        secondLinkedList.add(4);
        secondLinkedList.add(5);
        secondLinkedList.add(6);
        secondLinkedList.add(3);

        assertEquals(intersection.intersectingNode(firstLinkedList, secondLinkedList).intValue(), 3);
    }

    @Test
    public void intersectingNode_whenLinkedListHaveMultipleIntersectingPoint_returnTheMostRecentIntersectingNode() throws Exception {
        LinkedList<Integer> firstLinkedList = new LinkedList<>();
        LinkedList<Integer> secondLinkedList = new LinkedList<>();

        firstLinkedList.add(11);
        firstLinkedList.add(5);
        firstLinkedList.add(6);
        firstLinkedList.add(3);

        secondLinkedList.add(4);
        secondLinkedList.add(5);
        secondLinkedList.add(6);
        secondLinkedList.add(3);

        assertEquals(intersection.intersectingNode(firstLinkedList, secondLinkedList).intValue(), 5);
    }

    @Test
    public void intersectingNode_whenLinkedListHaveMultipleIntersectingPointWithDifferentLengths_returnTheMostRecentIntersectingNode() throws Exception {
        LinkedList<Integer> firstLinkedList = new LinkedList<>();
        LinkedList<Integer> secondLinkedList = new LinkedList<>();

        firstLinkedList.add(11);
        firstLinkedList.add(5);
        firstLinkedList.add(6);
        firstLinkedList.add(3);
        firstLinkedList.add(12);
        firstLinkedList.add(32);

        secondLinkedList.add(4);
        secondLinkedList.add(5);
        secondLinkedList.add(12);
        secondLinkedList.add(32);

        assertEquals(intersection.intersectingNode(firstLinkedList, secondLinkedList).intValue(), 12);
    }
}