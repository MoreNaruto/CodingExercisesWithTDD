package Exercises.ArrayAndListExercises;

public class StringRotation {

    public StringRotation() {
    }

    public Boolean isARotatedString(String originalWord, String rotatedWord) {
        if (originalWord.length() != rotatedWord.length() || originalWord.equals(rotatedWord)) {
            return false;
        }

        SubStringBuilder subStringBuilder = new SubStringBuilder(originalWord, rotatedWord).generate();

        String subStringOfOriginalWord = subStringBuilder.getSubStringOfOriginalWord();
        String subStringOfRotatedWord = subStringBuilder.getSubStringOfRotatedWord();
        if (subStringOfOriginalWord.equals(subStringOfRotatedWord)){
            return true;
        }

        SubStringBuilder subStringBuilderOfSubString =
                new SubStringBuilder(subStringOfOriginalWord,
                        subStringOfRotatedWord).generate();

        return subStringBuilderOfSubString.getSubStringOfOriginalWord()
                .equals(subStringBuilderOfSubString.getSubStringOfRotatedWord());
    }

    private class SubStringBuilder {
        private String originalWord;
        private String rotatedWord;
        private StringBuilder subStringBuilderOfRotatedWord;
        private StringBuilder subStringBuilderOfOriginalWord;

        public SubStringBuilder(String originalWord, String rotatedWord) {
            this.originalWord = originalWord;
            this.rotatedWord = rotatedWord;
        }

        public String getSubStringOfRotatedWord() {
            return subStringBuilderOfRotatedWord.toString();
        }

        public String getSubStringOfOriginalWord() {
            return subStringBuilderOfOriginalWord.toString();
        }

        public SubStringBuilder generate() {
            subStringBuilderOfRotatedWord = new StringBuilder(rotatedWord);
            subStringBuilderOfOriginalWord = new StringBuilder(originalWord);

            Boolean firstLetterWasFound = false;
            Integer currentPositionForRotatedWord = 0;
            Integer numberOfTimeCharacterWasDeleted = 0;
            Character currentCharacter = rotatedWord.charAt(currentPositionForRotatedWord);

            for (int currentPositionForOriginalWord = 0; currentPositionForOriginalWord < originalWord.length(); currentPositionForOriginalWord++) {
                if (originalWord.charAt(currentPositionForOriginalWord) == currentCharacter) {
                    firstLetterWasFound = true;
                    subStringBuilderOfOriginalWord.deleteCharAt(currentPositionForOriginalWord - numberOfTimeCharacterWasDeleted);
                    subStringBuilderOfRotatedWord.deleteCharAt(currentPositionForRotatedWord - numberOfTimeCharacterWasDeleted);
                    currentPositionForRotatedWord++;
                    numberOfTimeCharacterWasDeleted++;
                    currentCharacter = rotatedWord.charAt(currentPositionForRotatedWord);
                } else {
                    if (firstLetterWasFound){
                        break;
                    }
                }
            }
            return this;
        }
    }
}
