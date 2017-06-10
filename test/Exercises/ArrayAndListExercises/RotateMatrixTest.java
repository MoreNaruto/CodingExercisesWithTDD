package Exercises.ArrayAndListExercises;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RotateMatrixTest {

    private Character[][] characterBoard;
    private RotateMatrix rotateMatrix;

    @Before
    public void setUp() throws Exception {
        characterBoard = new Character[4][4];
        generateCharacterBoard();
        rotateMatrix = new RotateMatrix(characterBoard);
    }

    @Test
    public void rotateBoard90Degrees_shouldHave90DegreeMatrixValues() throws Exception {
        rotateMatrix.rotate90Degrees();
        Character[][] actualCharacterBoard = rotateMatrix.getCharacterBoard();
        assertEquals(actualCharacterBoard[0][0].charValue(), 'm');
        assertEquals(actualCharacterBoard[1][0].charValue(), 'i');
        assertEquals(actualCharacterBoard[2][0].charValue(), 'e');
        assertEquals(actualCharacterBoard[3][0].charValue(), 'a');
        assertEquals(actualCharacterBoard[0][1].charValue(), 'n');
        assertEquals(actualCharacterBoard[1][1].charValue(), 'j');
        assertEquals(actualCharacterBoard[2][1].charValue(), 'f');
        assertEquals(actualCharacterBoard[3][1].charValue(), 'b');
        assertEquals(actualCharacterBoard[0][2].charValue(), 'o');
        assertEquals(actualCharacterBoard[1][2].charValue(), 'k');
        assertEquals(actualCharacterBoard[2][2].charValue(), 'g');
        assertEquals(actualCharacterBoard[3][2].charValue(), 'c');
        assertEquals(actualCharacterBoard[0][3].charValue(), 'p');
        assertEquals(actualCharacterBoard[1][3].charValue(), 'l');
        assertEquals(actualCharacterBoard[2][3].charValue(), 'h');
        assertEquals(actualCharacterBoard[3][3].charValue(), 'd');
    }

    @Test
    public void rotateBoard180Degress_shouldHave180DegreeMatrixValues() throws Exception {
        rotateMatrix.rotate90Degrees();
        rotateMatrix.rotate90Degrees();
        Character[][] actualCharacterBoard = rotateMatrix.getCharacterBoard();
        assertEquals(actualCharacterBoard[0][0].charValue(), 'p');
        assertEquals(actualCharacterBoard[1][0].charValue(), 'o');
        assertEquals(actualCharacterBoard[2][0].charValue(), 'n');
        assertEquals(actualCharacterBoard[3][0].charValue(), 'm');
        assertEquals(actualCharacterBoard[0][1].charValue(), 'l');
        assertEquals(actualCharacterBoard[1][1].charValue(), 'k');
        assertEquals(actualCharacterBoard[2][1].charValue(), 'j');
        assertEquals(actualCharacterBoard[3][1].charValue(), 'i');
        assertEquals(actualCharacterBoard[0][2].charValue(), 'h');
        assertEquals(actualCharacterBoard[1][2].charValue(), 'g');
        assertEquals(actualCharacterBoard[2][2].charValue(), 'f');
        assertEquals(actualCharacterBoard[3][2].charValue(), 'e');
        assertEquals(actualCharacterBoard[0][3].charValue(), 'd');
        assertEquals(actualCharacterBoard[1][3].charValue(), 'c');
        assertEquals(actualCharacterBoard[2][3].charValue(), 'b');
        assertEquals(actualCharacterBoard[3][3].charValue(), 'a');
    }

    @Test
    public void rotateBoard270Degress_shouldHave270DegreeMatrixValues() throws Exception {
        rotateMatrix.rotate90Degrees();
        rotateMatrix.rotate90Degrees();
        rotateMatrix.rotate90Degrees();
        Character[][] actualCharacterBoard = rotateMatrix.getCharacterBoard();
        assertEquals(actualCharacterBoard[0][0].charValue(), 'd');
        assertEquals(actualCharacterBoard[1][0].charValue(), 'h');
        assertEquals(actualCharacterBoard[2][0].charValue(), 'l');
        assertEquals(actualCharacterBoard[3][0].charValue(), 'p');
        assertEquals(actualCharacterBoard[0][1].charValue(), 'c');
        assertEquals(actualCharacterBoard[1][1].charValue(), 'g');
        assertEquals(actualCharacterBoard[2][1].charValue(), 'k');
        assertEquals(actualCharacterBoard[3][1].charValue(), 'o');
        assertEquals(actualCharacterBoard[0][2].charValue(), 'b');
        assertEquals(actualCharacterBoard[1][2].charValue(), 'f');
        assertEquals(actualCharacterBoard[2][2].charValue(), 'j');
        assertEquals(actualCharacterBoard[3][2].charValue(), 'n');
        assertEquals(actualCharacterBoard[0][3].charValue(), 'a');
        assertEquals(actualCharacterBoard[1][3].charValue(), 'e');
        assertEquals(actualCharacterBoard[2][3].charValue(), 'i');
        assertEquals(actualCharacterBoard[3][3].charValue(), 'm');
    }

    @Test
    public void rotateBoard360Degress_shouldHave360DegreeMatrixValues() throws Exception {
        rotateMatrix.rotate90Degrees();
        rotateMatrix.rotate90Degrees();
        rotateMatrix.rotate90Degrees();
        rotateMatrix.rotate90Degrees();
        Character[][] actualCharacterBoard = rotateMatrix.getCharacterBoard();
        assertEquals(actualCharacterBoard[0][0].charValue(), 'a');
        assertEquals(actualCharacterBoard[1][0].charValue(), 'b');
        assertEquals(actualCharacterBoard[2][0].charValue(), 'c');
        assertEquals(actualCharacterBoard[3][0].charValue(), 'd');
        assertEquals(actualCharacterBoard[0][1].charValue(), 'e');
        assertEquals(actualCharacterBoard[1][1].charValue(), 'f');
        assertEquals(actualCharacterBoard[2][1].charValue(), 'g');
        assertEquals(actualCharacterBoard[3][1].charValue(), 'h');
        assertEquals(actualCharacterBoard[0][2].charValue(), 'i');
        assertEquals(actualCharacterBoard[1][2].charValue(), 'j');
        assertEquals(actualCharacterBoard[2][2].charValue(), 'k');
        assertEquals(actualCharacterBoard[3][2].charValue(), 'l');
        assertEquals(actualCharacterBoard[0][3].charValue(), 'm');
        assertEquals(actualCharacterBoard[1][3].charValue(), 'n');
        assertEquals(actualCharacterBoard[2][3].charValue(), 'o');
        assertEquals(actualCharacterBoard[3][3].charValue(), 'p');
    }

    private void generateCharacterBoard() {
        characterBoard[0][0] = 'a';
        characterBoard[1][0] = 'b';
        characterBoard[2][0] = 'c';
        characterBoard[3][0] = 'd';
        characterBoard[0][1] = 'e';
        characterBoard[1][1] = 'f';
        characterBoard[2][1] = 'g';
        characterBoard[3][1] = 'h';
        characterBoard[0][2] = 'i';
        characterBoard[1][2] = 'j';
        characterBoard[2][2] = 'k';
        characterBoard[3][2] = 'l';
        characterBoard[0][3] = 'm';
        characterBoard[1][3] = 'n';
        characterBoard[2][3] = 'o';
        characterBoard[3][3] = 'p';
    }
}