/*
2 <= nums.length <= 105
-30 <= nums[i] <= 30
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 */

#include "gtest/gtest.h"
#include <vector>
#include "Solution.h"
#include <algorithm>

class ProductExceptSelfTest : public ::testing::Test{

	ProductExceptSelfTest(){
		// Setup
	}

	~ProductExceptSelfTest(){
		// Teardown
	}
};

TEST(ProductExceptSelfTest, nominal){
	std::vector<int> nums;
	std::vector<int> exp;
	Solution sol;

	{
		nums = {1,2,3,4};
		exp = {24,12,8,6};
		EXPECT_EQ(exp, sol.productExceptSelf(nums));
	}
	{
		nums = {-1,1,0,-3,3};
		exp = {0,0,9,0,0};
		EXPECT_EQ(exp, sol.productExceptSelf(nums));
	}
}
