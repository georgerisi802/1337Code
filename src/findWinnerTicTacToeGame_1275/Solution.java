package findWinnerTicTacToeGame_1275;

/*
 * Tic-tac-toe is played by two players A and B on a 3 x 3 grid. The rules of Tic-Tac-Toe are:
 * 
 * Players take turns placing characters into empty squares ' '.
 * The first player A always places 'X' characters, while the second player B always places 'O' characters.
 * 'X' and 'O' characters are always placed into empty squares, never on filled ones.
 * The game ends when there are three of the same (non-empty) character filling any row, column, or diagonal.
 * The game also ends if all squares are non-empty.
 * No more moves can be played if the game is over.
 * Given a 2D integer array moves where moves[i] = [rowi, coli] indicates that the ith move will be played on 
 * grid[rowi][coli]. return the winner of the game if it exists (A or B). In case the game ends in a draw return "Draw". 
 * If there are still movements to play return "Pending".
 * 
 * You can assume that moves is valid (i.e., it follows the rules of Tic-Tac-Toe), the grid is initially empty, and A 
 * will play first.
 */

class Solution {
	int[] rowSums = new int[3];
	int[] colSums = new int[3];
	int diag1 = 0;
	int diag2 = 0;
	
	public String tictactoe(int[][] moves) {
		boolean aTurn = true;
		int moveVal = 1;
		
		int row;
		int col;
		for(int i=0; i<moves.length; i++) {
			row = moves[i][0];
			col = moves[i][1];
			
			rowSums[row] += moveVal;
			colSums[col] += moveVal;
			if(row == col) diag1 += moveVal;
			if(row == (2-col)) diag2 += moveVal;
			
			if((aTurn) && (rowSums[row] == 3 || colSums[col] == 3 || diag1 == 3 || diag2 == 3)) return "A";
			if((!aTurn) && (rowSums[row] == -3 || colSums[col] == -3 || diag1 == -3 || diag2 == -3)) return "B";
			
			aTurn = !aTurn;
			moveVal = -moveVal;
		}
		return (moves.length < 9) ? "Pending" : "Draw";
	}
}
