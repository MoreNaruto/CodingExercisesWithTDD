package Exercises.SetExercises;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class KthToLastNodes {

    private LinkedList<Integer> linkedList;

    public KthToLastNodes(LinkedList<Integer> linkedList) {
        this.linkedList = linkedList;
    }

    public List<Integer> getKthToLastNodes(Integer kthPosition){
        ArrayList<Integer> nodes = new ArrayList<>();
        for (int currentPosition = kthPosition - 1; currentPosition < linkedList.size(); currentPosition++) {
            nodes.add(linkedList.get(currentPosition));
        }
        return nodes;
    }
}
