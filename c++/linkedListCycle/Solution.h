/*
Given head, the head of a linked list, determine if the linked list has a cycle in it.

There is a cycle in a linked list if there is some node in the list that can be reached again by
continuously following the next pointer. Internally, pos is used to denote the index of the node
that tail's next pointer is connected to. Note that pos is not passed as a parameter.

Return true if there is a cycle in the linked list. Otherwise, return false.
 */

#ifndef SOLUTION_H_
#define SOLUTION_H_

#include "ListNode.h"
#include <set>

class Solution{
public:
	bool hasCycle(ListNode *head){
		std::set<void*> addrSet;

		ListNode* addr = head;
		while(addr != nullptr){
			if(!addrSet.insert(addr).second) return true;
			addr = addr->next;
		}
		return false;
	}
};



#endif /* SOLUTION_H_ */
