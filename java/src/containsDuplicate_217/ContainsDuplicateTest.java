package containsDuplicate_217;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContainsDuplicateTest {

	@Test
	void example1() {
		int[] nums = new int[] {1,2,3,1};
		boolean expected = true;
		
		Solution sol = new Solution();
		
		assertEquals(expected, sol.containsDuplicate(nums));
	}
	
	@Test
	void example2() {
		int[] nums = new int[] {1,2,3,4};
		boolean expected = false;
		
		Solution sol = new Solution();
		
		assertEquals(expected, sol.containsDuplicate(nums));
	}
	
	@Test
	void example3() {
		int[] nums = new int[] {1,1,1,3,3,4,3,2,4,2};
		boolean expected = true;
		
		Solution sol = new Solution();
		
		assertEquals(expected, sol.containsDuplicate(nums));
	}
}
