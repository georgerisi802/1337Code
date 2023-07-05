/*
1 <= nums.length <= 105
-109 <= nums[i] <= 109
 */

#include <vector>
#include "gtest/gtest.h"
#include "Solution.h"

class ContainsDuplicateTest : public ::testing::Test{
	ContainsDuplicateTest(){
		// Setup
	}

	~ContainsDuplicateTest(){
		// Teardown
	}
};

TEST(ContainsDuplicateTest, nominal){

	std::vector<int> nums;
	Solution sol;
	{
		nums = {1,2,3,1};
		EXPECT_TRUE(sol.containsDuplicate(nums));
	}
	{
		nums = {1,2,3,4};
		EXPECT_FALSE(sol.containsDuplicate(nums));
	}
	{
		nums = {1,1,1,3,3,4,3,2,4,2};
		EXPECT_TRUE(sol.containsDuplicate(nums));
	}
}

