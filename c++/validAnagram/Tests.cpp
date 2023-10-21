/*
1 <= s.length, t.length <= 5 * 104
s and t consist of lowercase English letters.
 */

#include "gtest/gtest.h"
#include "Solution.h"

class ValidAnagramTest : public ::testing::Test{
	ValidAnagramTest(){
		//setup
	}
	~ValidAnagramTest(){
		// teardown
	}
};

TEST(ValidAnagramTest,nominal){
	std::string s;
	std::string t;
	Solution sol;
	{
		s = "anagram";
		t = "nagaram";
		EXPECT_TRUE(sol.isAnagram(s,t));
	}
	{
		s = "rat";
		t = "car";
		EXPECT_FALSE(sol.isAnagram(s,t));
	}
	{
		s = "r";
		t = "r";
		EXPECT_TRUE(sol.isAnagram(s,t));
	}
}


