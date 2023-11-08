/*
You are given an array of integers stones where stones[i] is the weight of the ith stone.

We are playing a game with the stones. On each turn, we choose the heaviest two stones and smash them together.
Suppose the heaviest two stones have weights x and y with x <= y. The result of this smash is:

	If x == y, both stones are destroyed, and

	If x != y, the stone of weight x is destroyed, and the stone of weight y has new weight y - x.

	At the end of the game, there is at most one stone left.

Return the weight of the last remaining stone. If there are no stones left, return 0.
 */

#ifndef SOLUTION_H_
#define SOLUTION_H_

#include <vector>
#include <algorithm>
#include <queue>

class Solution{
public:
	int lastStoneWeight(std::vector<int>& stones){

		std::priority_queue<int> stoneQ(stones.begin(), stones.end());

		while(stoneQ.size() > 1){
			int stone_y = stoneQ.top();
			stoneQ.pop();
			int stone_x = stoneQ.top();
			stoneQ.pop();

			if(stone_x < stone_y) stoneQ.push(stone_y - stone_x);
		}

		return (stoneQ.empty() ? 0 : stoneQ.top());
	}
};

#endif /* SOLUTION_H_ */
