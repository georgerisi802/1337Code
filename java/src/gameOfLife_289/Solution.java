package gameOfLife_289;

import java.util.Arrays;

/*
 * According to Wikipedia's article: "The Game of Life, also known simply as Life, is a cellular automaton devised 
 * by the British mathematician John Horton Conway in 1970."
 *
 * The board is made up of an m x n grid of cells, where each cell has an initial state: live (represented by a 1) 
 * or dead (represented by a 0). Each cell interacts with its eight neighbors (horizontal, vertical, diagonal) using 
 * the following four rules (taken from the above Wikipedia article):
 * 	1. Any live cell with fewer than two live neighbors dies as if caused by under-population.
 * 	2. Any live cell with two or three live neighbors lives on to the next generation.
 * 	3. Any live cell with more than three live neighbors dies, as if by over-population.
 * 	4. Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.
 * 
 * The next state is created by applying the above rules simultaneously to every cell in the current state, where 
 * births and deaths occur simultaneously. Given the current state of the m x n grid board, return the next state.
 */
public class Solution {
	void gameOfLife(int[][] board) {
		
		// For the in-place solution, we use two extra values in the board instead of the extra board:
			// 2 indicates dead -> alive
			// 3 indicates alive -> dead
		int ln;
		for(int i=0; i<board.length;i++) {
			for(int j=0; j<board[0].length; j++) {
				ln = getLiveNeighbors(board, i, j);
				if(board[i][j] == 1) {
					if(ln < 2 || ln > 3) board[i][j] = 3;	// Transition from alive to dead
				}
				else {
					if(ln == 3) board[i][j] = 2;	// Transition from dead to alive
				}	
			}
		}
		// For the in-place solution, we need to go over the board again and change it to the 0/1 values
		for(int i=0; i<board.length;i++) {
			for(int j=0; j<board[0].length; j++) {
				if(board[i][j] == 3) board[i][j] = 0;
				else if(board[i][j] == 2) board[i][j] = 1;
			}
		}
	}
	
	// This function runs in constant time
	private int getLiveNeighbors(int[][] board, int i, int j) {
		int count = 0;
		boolean right = (j+1 < board[0].length);
		boolean left = (j-1 >= 0);
		boolean up = (i-1 >= 0);
		boolean down = (i+1 < board.length);
		
		// To accomodate the extra enums for the in-place solution, the cell values are mod 2 so they indicate
		// ... their original value: 2%2 = 0, 3%2 = 1
		if(up && 			board[i-1][j]%2 == 1) count++;
		if(up && right && 	board[i-1][j+1]%2 == 1) count++;
		if(right && 		board[i][j+1]%2 == 1) count++;
		if(down && right && board[i+1][j+1]%2 == 1) count++;
		if(down && 			board[i+1][j]%2 == 1) count++;
		if(down && left && 	board[i+1][j-1]%2 == 1) count++;
		if(left && 			board[i][j-1]%2 == 1) count++;
		if(left && up && 	board[i-1][j-1]%2 == 1) count++;
		return count;
	}
	
}
