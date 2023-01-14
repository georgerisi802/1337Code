package nUniqueIntegersSumZero_1304;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class sumZeroTest {

	int sumArray(int[] arr) {
		int sum = 0;
		for( int e : arr) sum += e;
		return sum;
	}
	
	@Test
	void example1() {
		int n = 5;
		
		Solution sol = new Solution();
		
		assertEquals(0, sumArray(sol.sumZero(n)));
	}
	@Test
	void example2() {
		int n = 3;
		
		Solution sol = new Solution();
		
		assertEquals(0, sumArray(sol.sumZero(n)));
	}
	@Test
	void example3() {
		int n = 1;
		
		Solution sol = new Solution();
		
		assertEquals(0, sumArray(sol.sumZero(n)));
	}
}
