package Exercises.ArrayAndListExercises;

public class RotateMatrix {
    private Character[][] characterBoard;

    public RotateMatrix(Character[][] characterBoard) {
        this.characterBoard = characterBoard;
    }

    public Character[][] getCharacterBoard() {
        return characterBoard;
    }

    public void rotate90Degrees(){
        Character[][] initialBoard = characterBoard;
        Character[][] finishedBoard = new Character[characterBoard.length][characterBoard.length];
        for (int i = 0; i < characterBoard.length; i++){
            for(int j = 0; j < characterBoard.length; j++){
                finishedBoard[j][i] = initialBoard[i][characterBoard.length - (j+1)];
            }
        }
        characterBoard = finishedBoard;
    }
}
