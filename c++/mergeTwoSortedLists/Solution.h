/*
You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.
 */

#ifndef SOLUTION_H_
#define SOLUTION_H_

#include "ListNode.h"

class Solution{
public:
	ListNode* mergeTwoLists(ListNode* list1, ListNode* list2){
		ListNode* dummyHead = new ListNode();
		ListNode* resultTail = dummyHead;

		ListNode* node1 = list1;
		ListNode* node2 = list2;
		while(node1 != nullptr && node2 != nullptr){
			if(node1->val < node2->val){
				resultTail->next = node1;
				resultTail = resultTail->next;
				node1 = node1->next;
			}
			else{
				resultTail->next = node2;
				resultTail = resultTail->next;
				node2 = node2->next;
			}
		}
		while(node1 != nullptr){ // Dump the rest of list1 into the result
			resultTail->next = node1;
			resultTail = resultTail->next;
			node1 = node1->next;
		}
		while(node2 != nullptr){ // Dump the rest of list2 into the result
			resultTail->next = node2;
			resultTail = resultTail->next;
			node2 = node2->next;
		}
		return dummyHead->next; // The dummyHead has no data
	}
};

#endif /* SOLUTION_H_ */
