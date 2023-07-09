/*
1 <= nums.length <= 105
-104 <= nums[i] <= 104
 */

#include "gtest/gtest.h"
#include "Solution.h"

class MaximumSubarrayTest : public ::testing::Test{
	MaximumSubarrayTest(){
		// Setup
	}

	~MaximumSubarrayTest(){
		// Teardown
	}
};

TEST(MaximumSubarrayTest, nominal){
	std::vector<int> nums;
	Solution sol;
	{
		nums = {-2,1,-3,4,-1,2,1,-5,4};
		EXPECT_EQ(6, sol.maxSubarray(nums));
	}
	{
		nums = {1};
		EXPECT_EQ(1, sol.maxSubarray(nums));
	}
	{
		nums = {5,4,-1,7,8};
		EXPECT_EQ(23, sol.maxSubarray(nums));
	}
}

TEST(MaximumSubarrayTest, edge){
	std::vector<int> nums;
	Solution sol;
	{
		nums = {-2,-1};
		EXPECT_EQ(-1, sol.maxSubarray(nums));
	}
}
