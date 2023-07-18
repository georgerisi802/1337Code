/*
	2 <= nums.length <= 104
	-109 <= nums[i] <= 109
	-109 <= target <= 109
	Only one valid answer exists
 */

#include <vector>
#include <algorithm>
#include "gtest/gtest.h"
#include "Solution.h"
#include "SolutionTemplated.h"

class TwoSumTest : public ::testing::Test{
public:
	TwoSumTest(){
		// Need any setup here?
	}

	~TwoSumTest() override{
		// Anything here?
	}
};

TEST(TwoSumTest, nominal){
	std::vector<int> nums;
	Solution sol;
	std::vector<int> ans;
	std::vector<int> exp;
	{
		nums = {2,7,11,15};
		ans = sol.twoSum(nums,9);
		std::sort(ans.begin(), ans.end());
		exp = {0,1};

		EXPECT_EQ(exp, ans);
	}
	{
		nums = {3,2,4};
		ans = sol.twoSum(nums,6);
		std::sort(ans.begin(), ans.end());
		exp = {1,2};

		EXPECT_EQ(exp, ans);
	}
	{
		nums = {3,3};
		ans = sol.twoSum(nums,6);
		std::sort(ans.begin(), ans.end());
		exp = {0,1};

		EXPECT_EQ(exp, ans);
	}

}

TEST(TwoSumTest, templated){
	{
		std::vector<float> nums;
		SolutionTemplated<float> solT;
		std::vector<float> ans;
		std::vector<float> exp;

		nums = {1.9,7.1,11.0,15.2};
		ans = solT.twoSum(nums,9);
		std::sort(ans.begin(), ans.end());
		exp = {0,1};
	}
}

int main(int argc, char** argv){
   
	::testing::InitGoogleTest(&argc, argv);
	return RUN_ALL_TESTS();
}
