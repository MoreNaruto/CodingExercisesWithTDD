package Exercises.ArrayAndListExercises;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class ZeroMatrixTest {

    @Test
    public void setColumnAndRowToZeroForElementThatIsZero_withNoElementAsZero() throws Exception {
        Integer[][] board = generateInitialBoardWithOneZero(4, 6);
        ZeroMatrix zeroMatrix = new ZeroMatrix(board);

        zeroMatrix.setColumnAndRowToZeroForElementThatIsZero();
        Integer[][] actualBoard = zeroMatrix.getBoard();

        assertNotEquals(actualBoard[1][1].intValue(), 0);
        assertNotEquals(actualBoard[1][3].intValue(), 0);
        assertNotEquals(actualBoard[2][3].intValue(), 0);
        assertNotEquals(actualBoard[3][3].intValue(), 0);
    }

    @Test
    public void setColumnAndRowToZeroForElementThatIsZero_withOnlyOneElementAsZero() throws Exception {
        Integer[][] board = generateInitialBoardWithOneZero(5, 4);
        board[1][2] = 0;
        ZeroMatrix zeroMatrix = new ZeroMatrix(board);

        zeroMatrix.setColumnAndRowToZeroForElementThatIsZero();
        Integer[][] actualBoard = zeroMatrix.getBoard();

        assertEquals(actualBoard[1][1].intValue(), 0);
        assertEquals(actualBoard[1][3].intValue(), 0);
        assertNotEquals(actualBoard[2][3].intValue(), 0);
        assertNotEquals(actualBoard[3][3].intValue(), 0);
    }

    @Test
    public void setColumnAndRowToZeroForElementThatIsZero_withTwoElementAsZero() throws Exception {
        Integer[][] board = generateInitialBoardWithOneZero(7, 3);
        board[1][2] = 0;
        board[2][1] = 0;
        ZeroMatrix zeroMatrix = new ZeroMatrix(board);

        zeroMatrix.setColumnAndRowToZeroForElementThatIsZero();
        Integer[][] actualBoard = zeroMatrix.getBoard();

        assertEquals(actualBoard[1][1].intValue(), 0);
        assertEquals(actualBoard[0][1].intValue(), 0);
        assertEquals(actualBoard[0][2].intValue(), 0);
        assertNotEquals(actualBoard[4][0].intValue(), 0);
        assertNotEquals(actualBoard[3][0].intValue(), 0);
        assertNotEquals(actualBoard[5][0].intValue(), 0);
    }

    private Integer[][] generateInitialBoardWithOneZero(int row, int column) {
        Integer[][] boardIntegers = new Integer[row][column];
        for (int i = 0; i < row; i++){
            for (int j = 0; j < column; j++){
                boardIntegers[i][j] = new Random().nextInt(100) + 1;
            }
        }
        return boardIntegers;
    }
}