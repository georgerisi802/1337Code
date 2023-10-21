/*
1 <= strs.length <= 104
0 <= strs[i].length <= 100
strs[i] consists of lowercase English letters.
 */

#include "gtest/gtest.h"
#include "Solution.h"
#include <vector>
#include <string>

class groupAnagramsTest : public ::testing::Test{
	groupAnagramsTest(){
		//setup
	}
	~groupAnagramsTest(){
		//teardown
	}
};

TEST(groupAnagramsTest, nominal){
	std::vector<std::string> strs;
	std::vector<std::vector<std::string>> expected;
	Solution sol;
	{
		strs = {"eat","tea","tan","ate","nat","bat"};
		expected = {{"eat","tea","ate"},{"tan","nat"},{"bat"}};
		EXPECT_EQ(sol.groupAnagrams(strs), expected);
	}
	{
		strs = {""};
		expected = {{""}};
		EXPECT_EQ(sol.groupAnagrams(strs), expected);
	}
	{
		strs = {"a"};
		expected = {{"a"}};
		EXPECT_EQ(sol.groupAnagrams(strs), expected);
	}
}


