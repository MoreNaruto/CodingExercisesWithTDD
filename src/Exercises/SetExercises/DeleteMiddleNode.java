package Exercises.SetExercises;

import java.util.LinkedList;

public class DeleteMiddleNode {

    private LinkedList<Character> characterLinkedList;

    public DeleteMiddleNode(LinkedList<Character> characterLinkedList) {
        this.characterLinkedList = characterLinkedList;
    }


    public void deleteMiddleNode() {
        int middlePositionIndex = (int) Math.ceil((double) characterLinkedList.size() / 2) - 1;
        characterLinkedList.remove(middlePositionIndex);
    }

    public LinkedList<Character> getLinkedList() {
        return characterLinkedList;
    }
}
