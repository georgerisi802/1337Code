/*
Given the root of a binary tree, return the level order traversal of its nodes' values.
(i.e., from left to right, level by level).
 */

#ifndef SOLUTION_H_
#define SOLUTION_H_

#include <vector>
#include <deque>
#include "TreeNode.h"

class Solution{
public:
	std::vector<std::vector<int>> levelOrder(TreeNode* root){
		std::vector<std::vector<int>> result;

		if(root == nullptr) return result; // Special case for empty input

		std::deque<TreeNode*> curLevel;
		std::deque<TreeNode*> nextLevel;
		nextLevel.push_back(root); // Begin with just root in the queue

		TreeNode* cur;
		std::vector<int> levelResult;
		while(!nextLevel.empty()){
			curLevel = nextLevel;
			nextLevel.clear();
			levelResult.clear();
			while(!curLevel.empty()){
				cur = curLevel.front();
				levelResult.push_back(cur->val);
				if(cur->left != nullptr) nextLevel.push_back(cur->left);
				if(cur->right != nullptr) nextLevel.push_back(cur->right);
				curLevel.pop_front();
			}
			result.push_back(levelResult);
		}
		return result;
	}
};



#endif /* SOLUTION_H_ */
