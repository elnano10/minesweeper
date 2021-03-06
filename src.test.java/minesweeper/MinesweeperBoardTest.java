package minesweeper;

import static org.junit.Assert.*;

import org.junit.Test;

public class MinesweeperBoardTest {

	@Test
	public void ConstructorTest() {
    MinesweeperBoard board = new MinesweeperBoard(5,5,10);
    boolean checkRows = board.getBoardRows() == 5;
    boolean checkCols = board.getBoardCols() == 5;
    boolean checkMines = board.getBoardMines() == 10;
    assertTrue(checkRows && checkCols && checkMines);
	}

}
