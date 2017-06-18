package Exercises.SetExercises;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Partition {

    private LinkedList<Integer> integerLinkedList;

    public Partition(LinkedList<Integer> integerLinkedList) {
        this.integerLinkedList = integerLinkedList;
    }


    public LinkedList<Integer> partitionedLinkedList(Integer partitionedAtValue) {
        ArrayList<Integer> integersLessThanPartitionedAtValue = new ArrayList<>();
        ArrayList<Integer> integersGreaterThanPartitionedAtValue = new ArrayList<>();
        ArrayList<Integer> integersSameAsPartitionedAtValue = new ArrayList<>();

        for (Integer currentIntegerNode : integerLinkedList) {
            if (currentIntegerNode > partitionedAtValue) {
                integersGreaterThanPartitionedAtValue.add(currentIntegerNode);
            } else if (currentIntegerNode < partitionedAtValue){
                integersLessThanPartitionedAtValue.add(currentIntegerNode);
            } else {
                integersSameAsPartitionedAtValue.add(currentIntegerNode);
            }
        }
        List<Integer> partitionedList = new ArrayList<>(integersLessThanPartitionedAtValue);
        partitionedList.addAll(integersSameAsPartitionedAtValue);
        partitionedList.addAll(integersGreaterThanPartitionedAtValue);

        return new LinkedList<>(partitionedList);
    }
}
