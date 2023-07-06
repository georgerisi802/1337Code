/*
Given an integer array nums, return an array answer such that answer[i] is equal
to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit
integer.

You must write an algorithm that runs in O(n) time and without using the
division operation.

Follow up: Can you solve the problem in O(1) extra space complexity?
(The output array does not count as extra space for space complexity analysis.)
 */

#ifndef SOLUTION_H_
#define SOLUTION_H_

#include <vector>

class Solution{
public:
	std::vector<int> productExceptSelf(std::vector<int>& nums){

		std::vector<int> returnVec;

		int product = 1;
		int subProduct;
		for(int& n : nums) product *= n; // Get product of all elements

		for(size_t i=0; i<nums.size(); ++i){
			if(nums[i] != 0) returnVec.emplace_back(product/nums[i]);
			else{
				subProduct = 1;
				for(size_t j=0; j<nums.size(); ++j){
					if(i != j) subProduct *= nums[j];
				}
				returnVec.push_back(subProduct);
			}
		}
		return returnVec;
	}
};


#endif /* SOLUTION_H_ */
