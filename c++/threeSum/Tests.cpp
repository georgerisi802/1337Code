/*
3 <= nums.length <= 3000
-105 <= nums[i] <= 105
 */

#include "gtest/gtest.h"
#include "Solution.h"

class ThreeSumTest : public ::testing::Test{
	ThreeSumTest(){
		// Setup
	}

	~ThreeSumTest(){
		// Tear-down
	}
};

TEST(ThreeSumTest, nominal){
	std::vector<int> nums;
	std::vector<std::vector<int>> exp;
	Solution sol;
	{
		nums = {-1,0,1,2,-1,-4,-2,-3,3,0,4};
		exp = {{-4,0,4},{-4,1,3},{-3,-1,4},{-3,0,3},{-3,1,2},{-2,-1,3},{-2,0,2},{-1,-1,2},{-1,0,1}};
		EXPECT_EQ(exp, sol.threeSum(nums));
	}
	{
		nums = {-1,0,1,2,-1,-4};
		exp = {{-1,-1,2},{-1,0,1}};
		EXPECT_EQ(exp, sol.threeSum(nums));
	}
	{
		nums = {0,1,1};
		exp = {};
		EXPECT_EQ(exp, sol.threeSum(nums));
	}
	{
		nums = {0,0,0};
		exp = {{0,0,0}};
		EXPECT_EQ(exp, sol.threeSum(nums));
	}
}
