package productExceptSelf_238;

/*
 * Given an integer array nums, return an array answer such that answer[i] is equal to the product 
 * of all the elements of nums except nums[i]. The product of any prefix or suffix of nums is guaranteed 
 * to fit in a 32-bit integer.
 * 
 * You must write an algorithm that runs in O(n) time and without using the division operation.
 * 
 * Follow up: Can you solve the problem in O(1) extra space complexity? 
 * (The output array does not count as extra space for space complexity analysis.)
 */
class Solution {
	public int[] productExceptSelf(int[] nums) {
		int n = nums.length, a = 1, b = 1;
		int[] ans = new int[n];
		ans[0] = 1;
		
		for(int i=1; i<n; i++) {
			a *= nums[i-1];
			ans[i] = a;
		}
		for(int j=n-2; j>=0; j--) {
			b *= nums[j+1];
			ans[j] *= b;
			}
		return ans;
	}
}
// Runs in O(n) time and O(1) complexity