/*
m == matrix.length
n == matrix[i].length
1 <= m, n <= 10
-100 <= matrix[i][j] <= 100
 */

#include "gtest/gtest.h"
#include "Solution.h"

class SpiralMatrixTest : public ::testing::Test{

};

TEST(SpiralMatrixTest, nominal){
	std::vector<std::vector<int>> mat;
	std::vector<int> exp;
	Solution sol;
	{
		mat = {{1,2,3},{4,5,6},{7,8,9}};
		exp = {1,2,3,6,9,8,7,4,5};
		EXPECT_EQ(sol.spiralOrder(mat), exp);
	}
	{
		mat = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		exp = {1,2,3,4,8,12,11,10,9,5,6,7};
		EXPECT_EQ(sol.spiralOrder(mat), exp);
	}
}
