package Exercises.SetExercises;

import java.util.ArrayList;
import java.util.LinkedList;

public class LoopDetection {

    public LoopDetection() {

    }

    public Character getInitialLoopedNode(LinkedList<Character> characterLinkedList) {
        ArrayList<Character> inspectedCharacters = new ArrayList<>();

        for (int currentNode = 0; currentNode < characterLinkedList.size(); currentNode++) {
            Character currentNodeCharacter = characterLinkedList.get(currentNode);
            if (inspectedCharacters.contains(currentNodeCharacter)){
                return currentNodeCharacter;
            }
            inspectedCharacters.add(currentNodeCharacter);
        }
        return null;
    }
}
