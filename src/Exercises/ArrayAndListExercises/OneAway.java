package Exercises.ArrayAndListExercises;

import java.util.ArrayList;

public class OneAway {

    public OneAway() {

    }

    public Boolean wordModifiedOneWay(String originalWord, String modifiedWord){
        if (passesPreConditionWordModificationCheck(originalWord, modifiedWord)) {
            return isModifiedOneWay(originalWord, modifiedWord);
        }
        return false;
    }

    private Boolean isModifiedOneWay(String originalWord, String modifiedWord) {
        if (originalWord.length() > modifiedWord.length()) return isRemovedOneWay(originalWord, modifiedWord);
        if (originalWord.length() < modifiedWord.length()) return isAddedOneWay(originalWord, modifiedWord);
        if (originalWord.length() == modifiedWord.length()) return isReplacedOneWay(originalWord, modifiedWord);
        return false;
    }

    private Boolean isReplacedOneWay(String originalWord, String modifiedWord) {
        String expectedOriginalWord = "";
        String originalWordWithRemovedUniqueCharacter = "";
        for (int i = 0; i < originalWord.length(); i++){
            if (originalWord.charAt(i) != modifiedWord.charAt(i)) {
                originalWordWithRemovedUniqueCharacter = new StringBuilder(originalWord).deleteCharAt(i).toString();
                expectedOriginalWord = new StringBuilder(modifiedWord).deleteCharAt(i).toString();
                break;
            }
        }
        return !originalWordWithRemovedUniqueCharacter.isEmpty() && expectedOriginalWord.equals(originalWordWithRemovedUniqueCharacter);
    }

    private Boolean isAddedOneWay(String originalWord, String modifiedWord) {
        String expectedOriginalWord = "";
        for (int i = 0; i < originalWord.length(); i++){
            if (originalWord.charAt(i) != modifiedWord.charAt(i)) {
                expectedOriginalWord = new StringBuilder(modifiedWord).deleteCharAt(i).toString();
                break;
            }
        }
        return expectedOriginalWord.isEmpty() || expectedOriginalWord.equals(originalWord);
    }

    private Boolean isRemovedOneWay(String originalWord, String modifiedWord) {
        ArrayList<String> correctPossibleModifiedWords = new ArrayList<>();
        for (int i = 0; i < originalWord.length(); i++){
            correctPossibleModifiedWords.add(new StringBuilder(originalWord).deleteCharAt(i).toString());
        }
        return correctPossibleModifiedWords.contains(modifiedWord);
    }

    private Boolean passesPreConditionWordModificationCheck(String originalWord, String modifiedWord) {
        if (originalWord.length() == 0){
            return modifiedWord.length() == 1;
        }
        if (originalWord.equals(modifiedWord)) return false;
        if (modifiedWord.length() == 0) return true;

        Boolean doesOriginalWordHaveOneCharacterLessThanTheModifiedWord = originalWord.length() % modifiedWord.length() == 1;
        Boolean doesOriginalWordHaveOneCharacterMoreThanTheModifiedWord = originalWord.length() % modifiedWord.length() == modifiedWord.length() - 1;
        Boolean doesOriginalWordHaveSameAmountOfCharactersAsTheModifiedWord = originalWord.length() % modifiedWord.length() == 0;

        return doesOriginalWordHaveOneCharacterLessThanTheModifiedWord ||
                doesOriginalWordHaveOneCharacterMoreThanTheModifiedWord ||
                doesOriginalWordHaveSameAmountOfCharactersAsTheModifiedWord;
    }
}
