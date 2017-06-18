package Exercises.SetExercises;

import java.util.LinkedList;

public class SumLists {

    public SumLists() {
    }

    public int reverseSumLinks(LinkedList<Integer> firstIntegerLinkedList, LinkedList<Integer> secondIntegerLinkedList) {
        int firstLinkedListIntegerRepresentationOfNodes = createIntegerRepresentationOfListInReverse(firstIntegerLinkedList);
        int secondLinkedListIntegerRepresentationOfNodes = createIntegerRepresentationOfListInReverse(secondIntegerLinkedList);

        return firstLinkedListIntegerRepresentationOfNodes + secondLinkedListIntegerRepresentationOfNodes;
    }

    private int createIntegerRepresentationOfListInReverse(LinkedList<Integer> linkedList) {
        StringBuilder nodeStringBuilder = new StringBuilder();
        for (int currentIndex = linkedList.size() - 1; currentIndex >= 0; currentIndex--) {
             nodeStringBuilder.append(linkedList.get(currentIndex));
        }
        String nodeString = nodeStringBuilder.toString();
        return nodeString.isEmpty() ? 0 : Integer.parseInt(nodeString);
    }

    public int sumLinks(LinkedList<Integer> firstLinkedList, LinkedList<Integer> secondLinkedList) {
        int firstIntegerRepresentationOfList = createIntegerRepresentationOfList(firstLinkedList);
        int secondIntegerRepresentationOfList = createIntegerRepresentationOfList(secondLinkedList);
        return firstIntegerRepresentationOfList + secondIntegerRepresentationOfList;
    }

    private int createIntegerRepresentationOfList(LinkedList<Integer> linkedList) {
        StringBuilder nodeStringBuilder = new StringBuilder();
        for (int currentIndex = 0; currentIndex < linkedList.size(); currentIndex++) {
            nodeStringBuilder.append(linkedList.get(currentIndex));
        }
        String nodeString = nodeStringBuilder.toString();
        return nodeString.isEmpty() ? 0 : Integer.parseInt(nodeString);
    }
}
