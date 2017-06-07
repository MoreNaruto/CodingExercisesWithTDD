package Exercises;

import java.util.ArrayList;

public class ArrayAndListExercises {

    public ArrayAndListExercises() {
    }

    public Boolean allUniqueCharacters(String word) {
        ArrayList<Character> charactersFromWord = new ArrayList<>();

        for (int i = 0; i < word.length(); i++) {
            if (charactersFromWord.contains(word.charAt(i))) {
                return false;
            } else {
                charactersFromWord.add(word.charAt(i));
            }
        }
        return true;
    }

    public Boolean wordPermutations(String wordOne, String wordTwo) {
        if (wordOne.length() != wordTwo.length()) {
            return false;
        }

        for (int i = 0; i < wordTwo.length(); i++) {
            if (wordTwo.contains(((Character) wordOne.charAt(i)).toString())) {
                wordTwo.replaceFirst("l", "");
            } else {
                return false;
            }
        }
        return true;
    }
}
