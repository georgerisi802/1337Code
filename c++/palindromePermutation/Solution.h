/*
Given a string s, return all the palindromic permutations (without duplicates) of it.

You may return the answer in any order. If s has no palindromic permutation, return an empty list.
 */

#ifndef SOLUTION_H_
#define SOLUTION_H_

#include <vector>
#include <string>
#include <array>

class Solution{
public:
	std::vector<std::string> generatePalindromes(std::string s){

		// Observations
			// There can only be 1 letter with an odd frequency and it must go in the middle of the word
			// n! solutions, where n is the number of repeated letters
		std::vector<std::string> palindromes;

		// Get frequency information for each letter
		std::array<int, 26> letterHistogram;
		letterHistogram.fill(0);
		for(auto ptr = s.cbegin(); ptr < s.cend(); ++ptr) ++letterHistogram.at(*ptr - 'a');

		// Aggregate repeated characters and perform legality check
		std::vector<char> repeatedChars;
		int oddCount = 0;
		char oddChar = '0';
		for(size_t i=0; i<letterHistogram.size(); ++i){
			if(letterHistogram[i] % 2 != 0 ){
				if(++oddCount > 1) return palindromes; // Can't be more than 1
				else{
					oddChar = ('a' + i);
					--letterHistogram[i];
				}
			}
			for(int j=0; j < letterHistogram[i]/2; ++j) repeatedChars.push_back('a' + i);
		}

		// Permute the repeatedCharacters (This requires the vector to be sorted, but it naturally is from above)
		do{
			std::string str1(repeatedChars.begin(), repeatedChars.end());
			std::string str2(1, oddChar);
			if(oddChar == '0') str2.clear();
			std::string str3(repeatedChars.rbegin(), repeatedChars.rend());
			palindromes.push_back(str1 + str2 + str3);
		}
		while(std::next_permutation(repeatedChars.begin(), repeatedChars.end()));

		return palindromes;
	}
};

#endif /* SOLUTION_H_ */
