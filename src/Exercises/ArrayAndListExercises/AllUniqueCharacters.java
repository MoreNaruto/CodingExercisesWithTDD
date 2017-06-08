package Exercises.ArrayAndListExercises;

import java.util.ArrayList;

/**
 * Created by tmosq on 6/7/17.
 */
public class AllUniqueCharacters {
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
