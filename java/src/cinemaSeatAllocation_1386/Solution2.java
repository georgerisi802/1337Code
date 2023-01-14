package cinemaSeatAllocation_1386;

/*
 * A cinema has n rows of seats, numbered from 1 to n and there are ten seats in each row, labeled from 1 to 10 
 * as shown in the figure above.
 * 
 * Given the array reservedSeats containing the numbers of seats already reserved, for example, 
 * reservedSeats[i] = [3,8] means the seat located in row 3 and labeled with 8 is already reserved.
 * 
 * Return the maximum number of four-person groups you can assign on the cinema seats. A four-person group 
 * occupies four adjacent seats in one single row. Seats across an aisle (such as [3,3] and [3,4]) are not 
 * considered to be adjacent, but there is an exceptional case on which an aisle split a four-person group, 
 * in that case, the aisle split a four-person group in the middle, which means to have two people on each side.
 */

class Solution2 {
	public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
		boolean[][] occupied = new boolean[3][n];
		
		int row;
		int col;
		for(int i=0; i<reservedSeats.length; i++) {
			row = reservedSeats[i][0] -1;
			col = reservedSeats[i][1] -1;
			
			if(col==1 || col==2) {
				occupied[0][row] = true;
			}
			else if(col==3 || col==4) {
				occupied[0][row] = true;
				occupied[1][row] = true;
			}
			else if(col==5 || col==6) {
				occupied[1][row] = true;
				occupied[2][row] = true;
			}
			else if(col==7 || col==8) {
				occupied[2][row] = true;
			}
		}
		int maxFams = 2*n;
		for(int i=0; i<n; i++) {
			if(occupied[0][i]) {
				maxFams--;
				if(occupied[1][i] && occupied[2][i]) maxFams--;
			}
			else if(occupied[2][i]) {
				maxFams--;
				if(occupied[0][i] && occupied[1][i]) maxFams--;
			}
		}
		return maxFams;
	}
}
