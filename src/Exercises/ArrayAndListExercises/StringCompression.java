package Exercises.ArrayAndListExercises;

/**
 * Created by Asiaa on 6/8/17.
 */
public class StringCompression {
    public StringCompression() {
    }

    public String generateCompressedString(String originalWord) {
        if (originalWord.isEmpty()){
            return originalWord;
        }

        Boolean hasCompressedValue = false;
        Integer numberOfCompressionsInCurrentSubString = 1;
        Character currentCharacter = originalWord.charAt(0);
        StringBuilder compressedString = new StringBuilder();

        for (int i = 1; i < originalWord.length(); i++) {
            if (currentCharacter.equals(originalWord.charAt(i))) {
                hasCompressedValue = true;
                numberOfCompressionsInCurrentSubString++;
            } else {
                compressedString.append(currentCharacter).append(numberOfCompressionsInCurrentSubString);
                currentCharacter = originalWord.charAt(i);
                numberOfCompressionsInCurrentSubString = 1;
            }
        }

        compressedString.append(currentCharacter).append(numberOfCompressionsInCurrentSubString);

        return hasCompressedValue ? compressedString.toString() : originalWord;
    }
}
