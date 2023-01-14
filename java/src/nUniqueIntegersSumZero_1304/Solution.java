package nUniqueIntegersSumZero_1304;

/*
 * Given an integer n, return any array containing n unique integers such that they add up to 0.
 */

class Solution {
	public int[] sumZero(int n) {
		if(n==0) return new int[] {0};
		
		int[] arr = new int[n];
		
		for(int i=0, j=n-1; i<j;i++, j--) {
			arr[i] = -i-1;
			arr[j] = i+1;
		}
		return arr;
    }
}
