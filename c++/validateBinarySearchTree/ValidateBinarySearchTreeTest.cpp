/*
The number of nodes in the tree is in the range [1, 104].
-231 <= Node.val <= 231 - 1
 */


#include "gtest/gtest.h"
#include "TreeNode.h"
#include "SimpleSolution.h"

class ValidateBinarySearchTreeTest : public testing::Test{
public:
	ValidateBinarySearchTreeTest(){
		//Setup
	}
	~ValidateBinarySearchTreeTest(){
		//Teardown
	}
};

TEST(ValidateBinarySearchTreeTest, simple_solution){
	TreeNode* root;
	SimpleSolution sol;
	{
		root = new TreeNode(2,new TreeNode(1), new TreeNode(3));
		EXPECT_TRUE(sol.isValidBST(root));
		delete root;
	}
	{
		root = new TreeNode(5, new TreeNode(1), new TreeNode(4, new TreeNode(3), new TreeNode(6)));
		EXPECT_FALSE(sol.isValidBST(root));
		delete root;
	}
	{
		root = new TreeNode(4, new TreeNode(1), new TreeNode(5, new TreeNode(5), new TreeNode(6)));
		EXPECT_FALSE(sol.isValidBST(root));
		delete root;
	}
	{
		root = new TreeNode(5, new TreeNode(4), new TreeNode(6, new TreeNode(3), new TreeNode(7)));
		EXPECT_FALSE(sol.isValidBST(root));
		delete root;
	}
	{
		root = new TreeNode(-2147483648, nullptr, new TreeNode(2147483647));
		EXPECT_TRUE(sol.isValidBST(root));
		delete root;
	}
}
