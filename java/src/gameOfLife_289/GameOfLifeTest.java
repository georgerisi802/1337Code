package gameOfLife_289;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GameOfLifeTest {

	@Test
	void example1() {
		int[][] board = new int[][] {{0,1,0},{0,0,1},{1,1,1},{0,0,0}};
		
		int[][] newBoard = new int[][] {{0,0,0},{1,0,1},{0,1,1},{0,1,0}};
		
		Solution sol = new Solution();
		sol.gameOfLife(board);
		
		assertArrayEquals(newBoard, board);
	}
	
	@Test
	void example2() {
		int[][] board = new int[][] {{1,1},{1,0}};
		
		int[][] newBoard = new int[][] {{1,1},{1,1}};
		
		Solution sol = new Solution();
		sol.gameOfLife(board);
		
		assertArrayEquals(newBoard, board);
	}
}
