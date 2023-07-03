/*
1 <= prices.length <= 105
0 <= prices[i] <= 104
 */

#include <vector>
#include "gtest/gtest.h"
#include "Solution.h"

// Fixture
class MaxProfitTest : public ::testing::Test{
public:
	MaxProfitTest(){
		//Setup
	}

	~MaxProfitTest(){
		// Teardown
	}
};

TEST(MaxProfitTest, nominal){
	std::vector<int> prices;
	int exp;
	{
		prices = {7,1,5,3,6,4};
		exp = 5;
		Solution sol;

		EXPECT_EQ(exp, sol.maxProfit(prices));
	}
	{
		prices = {7,6,4,3,1};
		exp = 0;
		Solution sol;

		EXPECT_EQ(exp, sol.maxProfit(prices));
	}
}


