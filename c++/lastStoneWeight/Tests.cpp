/*
 * Tests.cpp
 *
 *  Created on: Nov 7, 2023
 *      Author: george
 */

#include "gtest/gtest.h"
#include <vector>
#include "Solution.h"

class LastStoneWeightTest : public ::testing::Test{

};


TEST(LastStoneWeightTest, nominal){
	std::vector<int> stones;
	int res;
	Solution sol;
	{
		stones = {2,7,4,1,8,1};
		res = 1;
		EXPECT_EQ(1, sol.lastStoneWeight(stones));
	}
	{
		stones = {1};
		res = 1;
		EXPECT_EQ(1, sol.lastStoneWeight(stones));
	}
}
