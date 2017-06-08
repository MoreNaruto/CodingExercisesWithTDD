package Exercises.ArrayAndListExercises;

/**
 * Created by tmosq on 6/7/17.
 */
public class PermutationPalindrome {
    public Boolean permutationPalindrome(String word) {
        return word.length() % 2 == 0 ? isEvenCharacterPotentialPalindrome(word.toLowerCase()) : isOddCharacterPotentialPalindrome(word.toLowerCase());
    }

    private Boolean isOddCharacterPotentialPalindrome(String word) {
        Boolean foundUniqueCharacter = false;
        String mutableString = new StringBuilder(word).toString();

        for (int currentPosition = 0; currentPosition < (word.length() + 1) / 2; currentPosition++) {
            if (canRemoveCurrentCharacterAgain(mutableString)) {
                mutableString = getMutatedStringWithRemoveCharacter(mutableString);
            } else {
                if (foundUniqueCharacter) {
                    return false;
                } else {
                    mutableString = mutableString.replaceFirst(mutableString.charAt(0) + "", "");
                    foundUniqueCharacter = true;
                }
            }
        }
        return true;
    }

    private Boolean isEvenCharacterPotentialPalindrome(String word) {
        String mutableString = new StringBuilder(word).toString();

        for (int currentPosition = 0; currentPosition < (word.length() + 1) / 2; currentPosition++) {
            if (canRemoveCurrentCharacterAgain(mutableString)) {
                mutableString = getMutatedStringWithRemoveCharacter(mutableString);
            } else {
                return false;
            }
        }
        return true;
    }

    private Boolean canRemoveCurrentCharacterAgain(String word) {
        Character currentCharacter = word.charAt(0);
        String removedMutatedWord = word.replaceFirst(currentCharacter.toString(), "");
        return !removedMutatedWord.isEmpty() && removedMutatedWord.contains(currentCharacter.toString());
    }

    private String getMutatedStringWithRemoveCharacter(String word) {
        Character currentCharacter = word.charAt(0);
        return word.replaceFirst(currentCharacter.toString(), "").replaceFirst(currentCharacter.toString(), "");
    }
}
