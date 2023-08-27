/*
 * Tests.cpp
 *
 *  Created on: Aug 27, 2023
 *      Author: george
 */

#include "gtest/gtest.h"
#include "Solution.h"

class LinkedListCycleTest : public ::testing::Test{
	LinkedListCycleTest(){

	}

	~LinkedListCycleTest(){

	}
};

TEST(LinkedListCycleTest, nominal){
	Solution sol;

	{ // (3)->(2)->(0)->(-4)-->(back to 2)
		ListNode* input = new ListNode(3);
		input->next = new ListNode(2);
		input->next->next = new ListNode(-4);
		EXPECT_FALSE(sol.hasCycle(input)); // No cycle yet

		input->next->next->next = input->next; // loop back to 2
		EXPECT_TRUE(sol.hasCycle(input)); // Now has cycle
	}
	{ // (1)->nullptr
		ListNode* input = new ListNode(1);
		EXPECT_FALSE(sol.hasCycle(input));
	}
}
