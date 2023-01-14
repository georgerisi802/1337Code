package connectedComponentsUndirectedGraph_323;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConnectedComponentsUndirectedGraphTest {

	@Test
	void example1() {
		
		int n =5;
		
		int[][] edges = new int[3][2];
		edges[0] = new int[] {0,1};
		edges[1] = new int[] {1,2};
		edges[2] = new int[] {3,4};
		
		int expected = 2;
		
		Solution sol = new Solution();
		
		assertEquals(expected, sol.countComponents(n, edges));
	}
	
	@Test
	void example2() {
		
		int n =5;
		
		int[][] edges = new int[4][2];
		edges[0] = new int[] {0,1};
		edges[1] = new int[] {1,2};
		edges[2] = new int[] {2,3};
		edges[3] = new int[] {3,4};
		
		int expected = 1;
		
		Solution sol = new Solution();
		
		assertEquals(expected, sol.countComponents(n, edges));
	}

}
