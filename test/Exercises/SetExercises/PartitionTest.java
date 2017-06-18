package Exercises.SetExercises;

import org.junit.Test;

import java.util.LinkedList;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

public class PartitionTest {

    @Test
    public void partitionAtProvidedValue_shouldPartitionLinkedLinkWithOutProvidedValue() throws Exception {
        LinkedList<Integer> integerLinkedList = generateIntegerLinkedList();
        Partition partition = new Partition(integerLinkedList);
        LinkedList<Integer> expectedIntegerLinkedList = new LinkedList<>(asList(3, 9, 7, 5, 11, 15, 32, 17, 23, 39,17));

        assertEquals(partition.partitionedLinkedList(10), expectedIntegerLinkedList);
    }

    @Test
    public void partitionAtProvidedValue_shouldPartitionLinkedLinkWithProvidedValue() throws Exception {
        LinkedList<Integer> integerLinkedList = generateIntegerLinkedList();
        Partition partition = new Partition(integerLinkedList);
        LinkedList<Integer> expectedIntegerLinkedList = new LinkedList<>(asList(11, 15, 3, 9, 7, 5, 17, 17, 32, 23, 39));

        assertEquals(partition.partitionedLinkedList(17), expectedIntegerLinkedList);
    }

    private LinkedList<Integer> generateIntegerLinkedList() {
        LinkedList<Integer> integers = new LinkedList<>();
        integers.add(11);
        integers.add(15);
        integers.add(3);
        integers.add(32);
        integers.add(17);
        integers.add(9);
        integers.add(7);
        integers.add(23);
        integers.add(39);
        integers.add(5);
        integers.add(17);
        return integers;
    }
}