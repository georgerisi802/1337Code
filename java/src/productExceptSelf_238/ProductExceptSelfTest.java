package productExceptSelf_238;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProductExceptSelfTest {

	@Test
	void example1() {
		int[] nums = new int[] {1,2,3,4};
		int[] expected = new int[] {24,12,8,6};
		
		Solution sol = new Solution();
		
		assertArrayEquals(expected, sol.productExceptSelf(nums));
	}
	
	@Test
	void example2() {
		int[] nums = new int[] {-1,1,0,-3,3};
		int[] expected = new int[] {0,0,9,0,0};
		
		Solution sol = new Solution();
		
		assertArrayEquals(expected, sol.productExceptSelf(nums));
	}

}
