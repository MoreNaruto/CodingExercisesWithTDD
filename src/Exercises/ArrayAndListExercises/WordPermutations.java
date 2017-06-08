package Exercises.ArrayAndListExercises;

/**
 * Created by tmosq on 6/7/17.
 */
public class WordPermutations {
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
