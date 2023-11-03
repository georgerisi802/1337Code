/*
 * TreeNode.h
 *
 *  Created on: Oct 22, 2023
 *      Author: george
 */

#ifndef TREENODE_H_
#define TREENODE_H_

struct TreeNode{
	int val;
	TreeNode *left;
	TreeNode *right;

	TreeNode(): val(0), left(nullptr), right(nullptr) {}
	TreeNode(int x): val(x), left(nullptr), right(nullptr) {}
	TreeNode(int x, TreeNode *left, TreeNode *right): val(x), left(left), right(right) {}

	~TreeNode(){
		delete left;
		delete right;
	}
};

#endif /* TREENODE_H_ */
