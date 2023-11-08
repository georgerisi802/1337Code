/*
Given an m x n matrix, return all elements of the matrix in spiral order.
 */

#ifndef SOLUTION_H_
#define SOLUTION_H_

#include <vector>

class Solution{
public:
	std::vector<int> spiralOrder(std::vector<std::vector<int>>& matrix){
		size_t rows = matrix.size();
		size_t cols = matrix[0].size();

		std::vector<int> res(rows*cols, 0);


		// Row and column, starting at 0
		size_t i = 0;
		size_t j = 0;

		// Set limits of movement
		size_t right_limit = cols-1;
		size_t down_limit = rows-1;
		size_t left_limit = 0;
		size_t up_limit = 1;

		// Current direction of travel (0 = right, 1 = down, 2 = left, 3 = up)
		uint8_t direction = 0;

		size_t result_index = 0;
		while(result_index < res.size()){
			res[result_index++] = matrix[i][j];

			switch(direction){
			case 0: // Moving right
				if(j == right_limit){
					--right_limit;
					direction = 1;
					++i;
				}
				else ++j;
				break;
			case 1: // Moving down
				if(i == down_limit){
					--down_limit;
					direction = 2;
					--j;
				}
				else ++i;
				break;
			case 2: // Moving left
				if(j == left_limit){
					++left_limit;
					direction = 3;
					--i;
				}
				else --j;
				break;
			case 3: // Moving up
				if(i == up_limit){
					++up_limit;
					direction = 0;
					++j;
				}
				else --i;
				break;
			}
		}
		return res;
	}
};



#endif /* SOLUTION_H_ */
