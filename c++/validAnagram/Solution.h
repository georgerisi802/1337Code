/*
Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 */

#ifndef SOLUTION_H_
#define SOLUTION_H_

#include <iostream>
#include <string>
class Solution{
public:
	bool isAnagram(std::string s, std::string t){
		if(s.size() != t.size()) return false;

		std::array<uint16_t,26> sArray;
		sArray.fill({});
		std::array<uint16_t,26> tArray;
		tArray.fill({});

		for(size_t i=0; i<s.size(); ++i){
			++sArray[s.at(i)-'a'];
			++tArray[t.at(i)-'a'];
		}
		return (sArray == tArray);
	}
};




#endif /* SOLUTION_H_ */
