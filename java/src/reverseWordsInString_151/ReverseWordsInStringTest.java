package reverseWordsInString_151;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseWordsInStringTest {

	@Test
	void test1() {
		String s = "the sky is blue";
		String expected = "blue is sky the";
		
		Solution sol = new Solution();
		
		assertEquals(expected, sol.reverseWords(s));
	}
	@Test
	void test2() {
		String s = "  hello world  ";
		String expected = "world hello";
		
		Solution sol = new Solution();
		
		assertEquals(expected, sol.reverseWords(s));
	}
	@Test
	void test3() {
		String s = "a good   example";
		String expected = "example good a";
		
		Solution sol = new Solution();
		
		assertEquals(expected, sol.reverseWords(s));
	}
	@Test
	void edge() {
		String s = "  2  ";
		String expected = "2";
		
		Solution sol = new Solution();
		
		assertEquals(expected, sol.reverseWords(s));
	}
}
