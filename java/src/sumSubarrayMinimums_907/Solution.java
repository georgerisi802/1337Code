package sumSubarrayMinimums_907;

import java.util.Arrays;

/*
 * Given an array of integers arr, find the sum of min(b), where b ranges over every (contiguous) subarray 
 * of arr. Since the answer may be large, return the answer modulo (10^9) + 7.
 * 
 */

import java.util.Stack;

public class Solution {
	public int sumSubarrayMins(int[] arr) {
        // Two monotonous increasing stacks -- stacks will store the index of the PLE and NLE 
		Stack<Integer> stk = new Stack<>();
		
		int[] left = new int[arr.length];	// Previous less
		Arrays.fill(left,  -1);
		int[] right = new int[arr.length];	// Next less 
		Arrays.fill(right,  arr.length);
		
		for(int i=arr.length-1; i>=0; i--) {	// Iterate over arr backwards
			while(!stk.isEmpty() && arr[i] <= arr[stk.peek()]) {	
				left[stk.pop()] = i;	// Set the index of the next
			}
			stk.push(i);
		}
		stk.clear();
		for(int i=0; i< arr.length; i++) {		// Iterate over arr 
			while(!stk.isEmpty() && arr[i] < arr[stk.peek()]) {
				right[stk.pop()] = i;
			}
			stk.push(i);
		}		
		long res = 0;
		long leftRange;
		long rightRange;
		// Iterate over arr once more 
		// ...calculate the product of the min * the range over which it applies
		// ...add the product to the result sum
		for(int i=0; i<arr.length; i++) {
			leftRange = (long)(i - left[i]);
			rightRange = (long)(right[i] - i);
			res += (arr[i] * leftRange * rightRange) % (10e9 + 7);
		}
		return (int)res;
    }
}
