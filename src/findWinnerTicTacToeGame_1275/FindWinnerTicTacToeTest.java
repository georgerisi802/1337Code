package findWinnerTicTacToeGame_1275;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FindWinnerTicTacToeTest {

	@Test
	void example1() {
		int[][] moves = new int[][] {{0,0},{2,0},{1,1},{2,1},{2,2}};
		String expected = "A";
		
		Solution sol = new Solution();

		assertEquals(expected, sol.tictactoe(moves));
	}
	@Test
	void example2() {
		int[][] moves = new int[][] {{0,0},{1,1},{0,1},{0,2},{1,0},{2,0}};
		String expected = "B";
		
		Solution sol = new Solution();
		
		assertEquals(expected, sol.tictactoe(moves));
	}
	@Test
	void example3() {
		int[][] moves = new int[][] {{0,0},{1,1},{2,0},{1,0},{1,2},{2,1},{0,1},{0,2},{2,2}};
		String expected = "Draw";
		
		Solution sol = new Solution();
		
		assertEquals(expected, sol.tictactoe(moves));
	}
	@Test
	void pending1() {
		int[][] moves = new int[][] {{0,0},{1,1},{2,0},{1,0},{1,2}};
		String expected = "Pending";
		
		Solution sol = new Solution();
		
		assertEquals(expected, sol.tictactoe(moves));
	}
}
