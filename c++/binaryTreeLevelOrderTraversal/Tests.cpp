/*
The number of nodes in the tree is in the range [0, 2000].
-1000 <= Node.val <= 1000
 */

#include <vector>
#include "gtest/gtest.h"
#include "Solution.h"
#include "TreeNode.h"

class BTreeLevelOrderTraversalTest : public ::testing::Test{
	BTreeLevelOrderTraversalTest(){
		//setup
	}
	~BTreeLevelOrderTraversalTest(){
		//teardown
	}
};

TEST(BTreeLevelOrderTraversalTest, nominal){
	Solution sol;
	std::vector<std::vector<int>> expected;
	{
		TreeNode* root = new TreeNode(1);
		expected = {{1}};
		EXPECT_EQ(sol.levelOrder(root),expected);
	}
	{
		TreeNode* root = nullptr;
		expected = {};
		EXPECT_EQ(sol.levelOrder(root),expected);
	}
	{
		TreeNode* root = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
		expected = {{3},{9,20},{15,7}};
		EXPECT_EQ(sol.levelOrder(root),expected);
	}

}
