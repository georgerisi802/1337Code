package cinemaSeatAllocation_1386;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CinemaSeatAloocationTest {

	@Test
	void example1() {
		int n = 3;
		int[][] reservedSeats = new int[][] {{1,2},{1,3},{1,8},{2,6},{3,1},{3,10}};
		int expected = 4;
		
		Solution sol = new Solution();
		Solution2 sol2 = new Solution2();
		
		assertEquals(expected, sol.maxNumberOfFamilies(n, reservedSeats));
		assertEquals(expected, sol2.maxNumberOfFamilies(n, reservedSeats));
	}
	@Test
	void example2() {
		int n = 2;
		int[][] reservedSeats = new int[][] {{2,1},{1,8},{2,6}};
		int expected = 2;
		
		Solution sol = new Solution();
		Solution2 sol2 = new Solution2();

		assertEquals(expected, sol.maxNumberOfFamilies(n, reservedSeats));
		assertEquals(expected, sol2.maxNumberOfFamilies(n, reservedSeats));
	}
	@Test
	void example3() {
		int n = 4;
		int[][] reservedSeats = new int[][] {{4,3},{1,4},{4,6},{1,7}};
		int expected = 4;
		
		Solution sol = new Solution();
		Solution2 sol2 = new Solution2();

		assertEquals(expected, sol.maxNumberOfFamilies(n, reservedSeats));
		assertEquals(expected, sol2.maxNumberOfFamilies(n, reservedSeats));
	}
	@Test
	void example4() {
		int n = 2;
		int[][] reservedSeats = new int[][] {{1,5},{2,8},{2,10},{2,2},{1,6},{1,10},{1,1},{2,5},{1,2}};
		int expected = 0;
		
		Solution sol = new Solution();
		Solution2 sol2 = new Solution2();

		assertEquals(expected, sol.maxNumberOfFamilies(n, reservedSeats));
		assertEquals(expected, sol2.maxNumberOfFamilies(n, reservedSeats));
	}
}