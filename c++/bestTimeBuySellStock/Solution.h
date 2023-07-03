/*
You are given an array prices where prices[i] is the price of a given stock on
the ith day.

You want to maximize your profit by choosing a single day to buy one stock and
choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot
achieve any profit, return 0
 */

#ifndef SOLUTION_H_
#define SOLUTION_H_

#include <vector>
#include <stack>

class Solution{
public:
	int maxProfit(std::vector<int>& prices){

		int curMin = prices[0];
		int profit = 0;
		// Iterate over input vector, find maximum difference between two numbers
		// where lower number comes before higher
		for(int p : prices){
			if((p - curMin) > profit) profit = (p - curMin);
			else if(p < curMin) curMin = p;
		}
		return profit;
	}
};

#endif /* SOLUTION_H_ */
