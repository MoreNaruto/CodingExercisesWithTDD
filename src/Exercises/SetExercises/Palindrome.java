package Exercises.SetExercises;

import java.util.LinkedList;

public class Palindrome {

    private LinkedList<Character> characterLinkedList;

    public Palindrome(LinkedList<Character> characterLinkedList) {
        this.characterLinkedList = characterLinkedList;
    }

    public Boolean isLinkedListAPalindrome() {
        if (characterLinkedList.isEmpty()) {
            return false;
        }

        int halfLengthOfLinkedList = (int) Math.ceil((double) characterLinkedList.size() / 2);

        for (int currentPosition = 0; currentPosition < halfLengthOfLinkedList; currentPosition++) {
            if (characterLinkedList.get(currentPosition) != characterLinkedList.get(characterLinkedList.size() - (currentPosition + 1))) {
                return false;
            }
        }
        return true;
    }
}
