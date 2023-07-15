/*
The number of nodes in the list is the range [0, 5000].
-5000 <= Node.val <= 5000
 */

#include "gtest/gtest.h"
#include "ListNode.h"
#include "Solution.h"

class ReverseLinkedListTest : public ::testing::Test{
public:
	ReverseLinkedListTest(){
		// Setup
	}

	~ReverseLinkedListTest(){
		// Teardown
	}
};

TEST(ReverseLinkedListTest, nominal){
	ListNode* head = new ListNode(1, new ListNode(2, new ListNode(3)));
	Solution sol;
	ListNode* solNode = sol.reverseList(head);

	EXPECT_EQ(3, solNode->val);
	EXPECT_EQ(2, solNode->next->val);
	EXPECT_EQ(1, solNode->next->next->val);
}


