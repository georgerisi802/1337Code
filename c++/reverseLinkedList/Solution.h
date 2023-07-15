/*
Given the head of a singly linked list, reverse the list, and return the reversed list.
 */

#ifndef SOLUTION_H_
#define SOLUTION_H_

#include "ListNode.h"

class Solution{
public:
	ListNode* reverseList(ListNode* head){
		if(head==nullptr) return head; // In case original list is empty

		ListNode* prevNode = nullptr; // Previous node in list, starts null because nothing is before head
		ListNode* curNode = head;
		ListNode* nextNode = head->next;

		while(curNode != nullptr){
			curNode->next = prevNode;
			prevNode = curNode;
			curNode = nextNode;
			nextNode = (curNode == nullptr) ? nullptr : nextNode->next;
		}
		return prevNode;
	}
};



#endif /* SOLUTION_H_ */
