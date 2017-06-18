package Exercises.SetExercises;

import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;

import static java.util.Arrays.asList;
import static org.junit.Assert.*;

public class SumListsTest {

    private SumLists sumLists;

    @Before
    public void setUp() throws Exception {
        sumLists = new SumLists();
    }

    @Test
    public void reverseSumLists_returnZeroIfBothLinkedListsAreEmpty() throws Exception {
        LinkedList<Integer> firstLinkedList = new LinkedList<>();
        LinkedList<Integer> secondLinkedList = new LinkedList<>();

        assertEquals(sumLists.reverseSumLinks(firstLinkedList, secondLinkedList), 0);
    }

    @Test
    public void reverseSumLists_whenSecondLinkedListsIsEmpty_returnReverseIntegerRepresentationOfFirstValue() throws Exception {
        LinkedList<Integer> firstLinkedList = new LinkedList<>(asList(3, 1, 4));
        LinkedList<Integer> secondLinkedList = new LinkedList<>();

        assertEquals(sumLists.reverseSumLinks(firstLinkedList, secondLinkedList), 413);
    }

    @Test
    public void reverseSumLists_whenFirstLinkedListsIsEmpty_returnReverseIntegerRepresentationOfSecondValue() throws Exception {
        LinkedList<Integer> firstLinkedList = new LinkedList<>();
        LinkedList<Integer> secondLinkedList = new LinkedList<>(asList(1, 2, 0, 9));

        assertEquals(sumLists.reverseSumLinks(firstLinkedList, secondLinkedList), 9021);
    }

    @Test
    public void reverseSumLists_returnReverseIntegerRepresentationOfSumOfLinkedList() throws Exception {
        LinkedList<Integer> firstLinkedList = new LinkedList<>(asList(9, 1, 3, 3, 3));
        LinkedList<Integer> secondLinkedList = new LinkedList<>(asList(1, 0));
        LinkedList<Integer> thirdLinkedList = new LinkedList<>(asList(12, 43, 1, 2));
        LinkedList<Integer> fourthLinkedList = new LinkedList<>(asList(3, 4, 1, 0));
        LinkedList<Integer> fifthLinkedList = new LinkedList<>(asList(0, 3, 1));

        assertEquals(sumLists.reverseSumLinks(firstLinkedList, secondLinkedList), 33320);
        assertEquals(sumLists.reverseSumLinks(secondLinkedList, thirdLinkedList), 214313);
        assertEquals(sumLists.reverseSumLinks(fourthLinkedList, fifthLinkedList), 273);
        assertEquals(sumLists.reverseSumLinks(fourthLinkedList, firstLinkedList), 33462);
        assertEquals(sumLists.reverseSumLinks(secondLinkedList, fifthLinkedList), 131);
    }

    @Test
    public void sumLists_returnZeroIfBothLinkedListsAreEmpty() throws Exception {
        LinkedList<Integer> firstLinkedList = new LinkedList<>();
        LinkedList<Integer> secondLinkedList = new LinkedList<>();

        assertEquals(sumLists.sumLinks(firstLinkedList, secondLinkedList), 0);
    }

    @Test
    public void sumLists_whenSecondLinkedListsIsEmpty_returnIntegerRepresentationOfFirstValue() throws Exception {
        LinkedList<Integer> firstLinkedList = new LinkedList<>(asList(3, 1, 4));
        LinkedList<Integer> secondLinkedList = new LinkedList<>();

        assertEquals(sumLists.sumLinks(firstLinkedList, secondLinkedList), 314);
    }

    @Test
    public void sumLists_whenFirstLinkedListsIsEmpty_returnIntegerRepresentationOfSecondValue() throws Exception {
        LinkedList<Integer> firstLinkedList = new LinkedList<>();
        LinkedList<Integer> secondLinkedList = new LinkedList<>(asList(1, 2, 0, 9));

        assertEquals(sumLists.sumLinks(firstLinkedList, secondLinkedList), 1209);
    }

    @Test
    public void sumLists_returnIntegerRepresentationOfSumOfLinkedList() throws Exception {
        LinkedList<Integer> firstLinkedList = new LinkedList<>(asList(9, 1, 3, 3, 3));
        LinkedList<Integer> secondLinkedList = new LinkedList<>(asList(1, 0));
        LinkedList<Integer> thirdLinkedList = new LinkedList<>(asList(12, 43, 1, 2));
        LinkedList<Integer> fourthLinkedList = new LinkedList<>(asList(3, 4, 1, 0));
        LinkedList<Integer> fifthLinkedList = new LinkedList<>(asList(0, 3, 1));

        assertEquals(sumLists.sumLinks(firstLinkedList, secondLinkedList), 91343);
        assertEquals(sumLists.sumLinks(secondLinkedList, thirdLinkedList), 124322);
        assertEquals(sumLists.sumLinks(fourthLinkedList, fifthLinkedList), 3441);
        assertEquals(sumLists.sumLinks(fourthLinkedList, firstLinkedList), 94743);
        assertEquals(sumLists.sumLinks(secondLinkedList, fifthLinkedList), 41);
    }
}