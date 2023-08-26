/*
The number of nodes in both lists is in the range [0, 50].
-100 <= Node.val <= 100
Both list1 and list2 are sorted in non-decreasing order.
 */

#include "gtest/gtest.h"
#include "ListNode.h"
#include "Solution.h"

class MergeTwoSortedListsTest : public ::testing::Test{
public:
	MergeTwoSortedListsTest(){
		// Setup
	}
	~MergeTwoSortedListsTest(){
		// Teardown
	}
};

TEST(MergeTwoSortedListsTest, nominal){
	ListNode* list1;
	ListNode* list2;
	ListNode* expected;
	Solution sol;
	{
		list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
		list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
		expected = new ListNode(1,new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(4))))));
		ListNode* solution = sol.mergeTwoLists(list1, list2);

		EXPECT_EQ(expected->val, solution->val);
		EXPECT_EQ(expected->next->val, solution->next->val);
		EXPECT_EQ(expected->next->next->val, solution->next->next->val);
		EXPECT_EQ(expected->next->next->next->val, solution->next->next->next->val);
		EXPECT_EQ(expected->next->next->next->next->val, solution->next->next->next->next->val);
		EXPECT_EQ(expected->next->next->next->next->next->val, solution->next->next->next->next->next->val);
	}
	{
		list1 = new ListNode();
		list2 = new ListNode();
		expected = new ListNode();
		ListNode* solution = sol.mergeTwoLists(list1, list2);

		EXPECT_EQ(expected->val, solution->val);
	}
	{
		list1 = new ListNode();
		list2 = new ListNode(0);
		expected = new ListNode(0);
		ListNode* solution = sol.mergeTwoLists(list1, list2);

		EXPECT_EQ(expected->val, solution->val);
	}
}


