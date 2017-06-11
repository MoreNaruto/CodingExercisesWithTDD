package Exercises.ArrayAndListExercises;

import java.util.ArrayList;

public class ZeroMatrix {
    private Integer[][] board;

    public ZeroMatrix(Integer[][] board) {
        this.board = board;
    }

    public Integer[][] getBoard() {
        return board;
    }

    public void setColumnAndRowToZeroForElementThatIsZero() {
        Integer numberOfRows = board.length;
        Integer numberOfColumns = board[0].length;
        ArrayList<Integer> rowsWithZeroValue = new ArrayList<>();
        ArrayList<Integer> columnWithZeroValue = new ArrayList<>();

        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfColumns; j++) {
                if (board[i][j] == 0) {
                    if(!rowsWithZeroValue.contains(i)) rowsWithZeroValue.add(i);
                    if(!columnWithZeroValue.contains(j)) columnWithZeroValue.add(j);
                }
            }
        }

        for (Integer currentColumn : columnWithZeroValue) {
            for(int i = 0; i < numberOfRows; i++){
                board[i][currentColumn] = 0;
            }
        }

        for (Integer currentRow  : rowsWithZeroValue) {
            for(int i = 0; i < numberOfColumns; i++){
                board[currentRow][i] = 0;
            }
        }
    }
}
