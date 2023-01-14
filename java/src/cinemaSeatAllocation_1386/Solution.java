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

class Solution {
	public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
		boolean[][] isReserved = new boolean[10][n];
		
		for(int i=0; i<reservedSeats.length; i++) {
			int x = reservedSeats[i][1] - 1; 
			int y = reservedSeats[i][0] - 1;
			isReserved[x][y] = true;
		}
		
		int openCount;
		int groupCount = 0;
		
		for(int i=0; i<n; i++) {
			openCount = 0;
			
			for(int j=0; j<10; j++) {
				if(!isReserved[j][i]) {
					openCount++;
					if(openCount==4) {
						groupCount++;
						openCount = 0;
					}
					if(j==2 || j==6){
						if(openCount==3) openCount = 2;
						else if(openCount != 2) openCount = 0;
					}
				}
				else openCount = 0;
			}
		}
    return groupCount;
	}
}
