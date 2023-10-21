/*
Given an array of strings strs, group the anagrams together. You can return the answer in any order.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
typically using all the original letters exactly once.
 */

#ifndef SOLUTION_H_
#define SOLUTION_H_

#include <vector>
#include <string>
#include <array>
#include <algorithm>

class Solution{
public:
	std::vector<std::vector<std::string>> groupAnagrams(std::vector<std::string>& strs){
		std::vector<std::vector<std::string>> result;

		if(strs.size() <= 1){ // Special case
			result.push_back(strs);
			return result;
		}

		std::vector<std::array<uint16_t,26>> frequencies;

		// Iterate over input and create a frequency array for each string
		for(auto s : strs){
			std::array<uint16_t,26> frequency;
			frequency.fill({});
			for(char c : s) ++frequency[c-'a'];

			// If the frequency matches an existing profile
			auto iter = std::find(frequencies.cbegin(), frequencies.cend(), frequency);
			if(iter < frequencies.cend()){
				// Add this input to the existing bucket
				result[iter - frequencies.cbegin()].push_back(s);
			}
			// If the frequency does not match any previous frequency
			else{
				// Create a new bucket in the result and add this input to that bucket
				result.emplace_back(std::vector<std::string>{s});
				// create a new frequency profile corresponding to this input
				frequencies.push_back(frequency);
			}

		}
		return result;
	}
};

#endif /* SOLUTION_H_ */
