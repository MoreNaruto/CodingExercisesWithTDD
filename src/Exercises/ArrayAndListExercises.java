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
}
