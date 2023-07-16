/*
Write a function that takes the binary representation of an unsigned integer and
returns the number of '1' bits it has (also known as the Hamming weight).
 */

#ifndef SOLUTION_H_
#define SOLUTION_H_

#include <iostream>
#include <string>

class Solution{
public:
	int hammingWeight(uint32_t n){
		int numOnes = 0;
		uint32_t mask = 1;

		for(size_t i=0; i<(sizeof(n)*8); ++i){
			numOnes += (n & mask) > 0;
			mask = mask<<1;
		}
		return numOnes;
	}
};


#endif /* SOLUTION_H_ */
