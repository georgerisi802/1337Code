package transposeMatrix_867;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TransposeMatrixTest {

	@Test
	void example1() {
		int[][] matrix = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		int[][] expected = new int[][]{{1,4,7},{2,5,8},{3,6,9}};
		
		Solution sol = new Solution();
		
		assertArrayEquals(expected, sol.transpose(matrix));
	}
	@Test
	void example2() {
		int[][] matrix = new int[][]{{1,2,3},{4,5,6}};
		int[][] expected = new int[][]{{1,4},{2,5},{3,6}};
		
		Solution sol = new Solution();
		
		assertArrayEquals(expected, sol.transpose(matrix));
	}
	@Test
	void edge1() {
		int[][] matrix = new int[][]{{1},{4}};
		int[][] expected = new int[][]{{1,4}};
		
		Solution sol = new Solution();
		
		assertArrayEquals(expected, sol.transpose(matrix));
	}
	@Test
	void edge2() {
		int[][] matrix = new int[][]{{1}};
		int[][] expected = new int[][]{{1}};
		
		Solution sol = new Solution();
		
		assertArrayEquals(expected, sol.transpose(matrix));
	}
}
