/*
	2 <= nums.length <= 104
	-109 <= nums[i] <= 109
	-109 <= target <= 109
 */

#include <vector>
#include "gtest/gtest.h"
#include "Solution.h"

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
	{
		std::vector<int> nums{2,7,11,15};
		Solution sol;
		std::vector<int> ans = sol.twoSum(nums,9);
		std::vector<int> expected{1,2};

		EXPECT_EQ(expected, ans);
	}

}

int main(int argc, char** argv){
   
	::testing::InitGoogleTest(&argc, argv);
	return RUN_ALL_TESTS();
}
