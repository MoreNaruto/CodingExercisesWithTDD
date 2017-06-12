package Exercises.SetExercises;

import java.util.ArrayList;
import java.util.LinkedList;

public class RemoveDuplicates {

    private LinkedList linkedList;

    public RemoveDuplicates(LinkedList<Integer> linkedList) {
        this.linkedList = linkedList;
    }

    public LinkedList getLinkedList() {
        return linkedList;
    }

    public void removeDuplication(){
        ArrayList<Integer> uniqueIntegers = new ArrayList<>();
        for (int currentNodePosition = 0; currentNodePosition < linkedList.size(); currentNodePosition++) {
            Integer currentNode = (Integer) linkedList.get(currentNodePosition);
            if (uniqueIntegers.contains(currentNode)){
                linkedList.remove(currentNodePosition);
                currentNodePosition--;
            } else {
                uniqueIntegers.add(currentNode);
            }
        }
    }
}
