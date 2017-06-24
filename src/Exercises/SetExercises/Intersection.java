package Exercises.SetExercises;

import java.util.LinkedList;
import java.util.Objects;

public class Intersection {

    public Intersection() {
    }


    public Integer intersectingNode(LinkedList<Integer> firstLinkedList, LinkedList<Integer> secondLinkedList) {
        if (firstLinkedList.isEmpty() || secondLinkedList.isEmpty()){
            return null;
        }

        if (firstLinkedList.size() > secondLinkedList.size()) {
            firstLinkedList = getRemovedFrontNodesLinkedList(firstLinkedList, secondLinkedList);
        } else if (firstLinkedList.size() < secondLinkedList.size()) {
            secondLinkedList = getRemovedFrontNodesLinkedList(secondLinkedList, firstLinkedList);
        }

        return getMostRecentIntersectingNode(firstLinkedList, secondLinkedList);
    }

    private Integer getMostRecentIntersectingNode(LinkedList<Integer> firstLinkedList, LinkedList<Integer> secondLinkedList) {
        Integer mostRecentIntersectingNode = null;

        for (int currentNode = firstLinkedList.size() - 1; currentNode >= 0 ; currentNode--) {
            if (Objects.equals(firstLinkedList.get(currentNode), secondLinkedList.get(currentNode))){
                mostRecentIntersectingNode = firstLinkedList.get(currentNode);
            } else {
                break;
            }
        }
        return mostRecentIntersectingNode;
    }

    private LinkedList<Integer> getRemovedFrontNodesLinkedList(LinkedList<Integer> largerLinkedList, LinkedList<Integer> smallerLinkedList) {
        int numberOfFrontNodesToRemove = largerLinkedList.size() - smallerLinkedList.size();
        for (int numberOfIterations = 0; numberOfIterations < numberOfFrontNodesToRemove; numberOfIterations++) {
            largerLinkedList.remove(0);
        }
        return largerLinkedList;
    }
}
