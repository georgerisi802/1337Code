package transposeMatrix_867;

/*
 * Given a 2D integer array matrix, return the transpose of matrix.
 * The transpose of a matrix is the matrix flipped over its main diagonal, switching the 
 * matrix's row and column indices.
 */

class Solution {
	public int[][] transpose(int[][] matrix) {
		int dimX = matrix.length;
		int dimY = matrix[0].length;
		
		int[][] out = new int[dimY][dimX];
		
		for(int i = 0; i < dimX; i++) {
			for(int j = 0; j < dimY; j++) {
				out[j][i] = matrix[i][j];
			}
		}
		return out;
    }
}
