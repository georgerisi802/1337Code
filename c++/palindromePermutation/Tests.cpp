/*
1 <= s.length <= 16
s consists of only lowercase English letters.
 */

#include "gtest/gtest.h"
#include "Solution.h"

class PalindromePermutationsTest : public ::testing::Test{
	PalindromePermutationsTest(){
		// Setup
	}

	~PalindromePermutationsTest(){
		// Teardown
	}
};

TEST(PalindromePermutationsTest, nominal){
	std::string s;
	std::vector<std::string> exp;
	Solution sol;
	{ // 0 repeated letters -> 0 solutions
		s = "abc";
		exp = {};
		EXPECT_EQ(exp, sol.generatePalindromes(s));
	}
	{ // 1 repeated letter -> 1 solution
		s = "aba";
		exp = {"aba"};
		EXPECT_EQ(exp, sol.generatePalindromes(s));
	}
	{ // 2 repeated letters -> 2 solutions
		s = "aabb";
		exp = {"abba","baab"};
		EXPECT_EQ(exp, sol.generatePalindromes(s));
	}
	{ // 2 repeated letters -> 2 solutions
		s = "aabbc";
		exp = {"abcba", "bacab"};
		EXPECT_EQ(exp, sol.generatePalindromes(s));
	}
	{ // 3 repeated letters -> 6 solutions
		s = "aabbccd";
		exp = {"abcdcba", "acbdbca", "bacdcab", "bcadacb", "cabdbac", "cbadabc"};
		EXPECT_EQ(exp, sol.generatePalindromes(s));
	}
	{ // Weird case
		s = "aaa";
		exp = {"aaa"};
		EXPECT_EQ(exp, sol.generatePalindromes(s));
	}
}
