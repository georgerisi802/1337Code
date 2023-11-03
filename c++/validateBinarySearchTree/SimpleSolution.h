/*
 * SimpleSolution.h
 *
 *  Created on: Nov 2, 2023
 *      Author: george
 */

#ifndef SIMPLESOLUTION_H_
#define SIMPLESOLUTION_H_

#include "TreeNode.h"
#include <iostream>
#include <climits>

class SimpleSolution{
public:
	bool isValidBST(TreeNode *root){
		if(!root || (!root->left && !root->right)) return true;

		if(BST_vals(root)) return true;
		return false;
	}

private:
	static constexpr std::pair<long,long> nullRange{LONG_MAX,LONG_MIN};

	std::optional<std::pair<long, long>> BST_vals(TreeNode *root){
		if(!root) return nullRange;

		std::pair<long,long> res;

		if (auto left_tree_range = BST_vals(root->left)){
			if(left_tree_range->second < root->val) res.first = std::min(left_tree_range->first, long(root->val));
			else return std::nullopt;
		}
		else return std::nullopt;

		if (auto right_tree_range = BST_vals(root->right)){
			if(right_tree_range->first > root->val) res.second = std::max(right_tree_range->second, long(root->val));
			else return std::nullopt;
		}
		else return std::nullopt;

		return res;
	}
};



#endif /* SIMPLESOLUTION_H_ */
