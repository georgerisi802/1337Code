/*
 * Tests.cpp
 *
 *  Created on: Jul 16, 2023
 *      Author: george
 */

#include <iostream>
#include "gtest/gtest.h"
#include "Solution.h"

class NumberOf1BitsTest : public ::testing::Test{
	NumberOf1BitsTest(){
		// Setup
	}

	~NumberOf1BitsTest(){
		// Teardown
	}
};


TEST(NumberOf1BitsTest, nominal){
	uint32_t n;
	Solution sol;
	{
		n = 11;
		EXPECT_EQ(3, sol.hammingWeight(n));
	}
	{
		n = 128;
		EXPECT_EQ(1, sol.hammingWeight(n));
	}
	{
		n = 4294967293;
		EXPECT_EQ(31, sol.hammingWeight(n));
	}
}

