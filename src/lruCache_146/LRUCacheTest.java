package lruCache_146;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LRUCacheTest {

	LRUCache c = new LRUCache(2);
	
	@Test
	void test1() {
		c.put(1, 1); 					// cache is {1=1}
		c.put(2, 2); 					// cache is {1=1, 2=2}
		assertEquals(c.get(1), 1);    	// return 1
	}
	@Test
	void test2() {
		c.put(1, 1); 					// cache is {1=1}
		c.put(2, 2); 					// cache is {1=1, 2=2}
		c.get(1);    	// return 1
		c.put(3, 3);	 				// LRU key was 2, evicts key 2, cache is {1=1, 3=3}
		assertEquals(c.get(2), -1);   	// returns -1 (not found)
	}
	@Test
	void test3() {
		c.put(1, 1); 					// cache is {1=1}
		c.put(2, 2); 					// cache is {1=1, 2=2}
		c.get(1);    	// return 1
		c.put(3, 3);	 				// LRU key was 2, evicts key 2, cache is {1=1, 3=3}
		c.get(2);   	// returns -1 (not found)
		c.put(4, 4); 					// LRU key was 1, evicts key 1, cache is {4=4, 3=3}
		assertEquals(c.get(1), -1);    	// return -1 (not found)
	}
	@Test
	void test4() {
		c.put(1, 1); 					// cache is {1=1}
		c.put(2, 2); 					// cache is {1=1, 2=2}
		c.get(1);    	// return 1
		c.put(3, 3);	 				// LRU key was 2, evicts key 2, cache is {1=1, 3=3}
		c.get(2);   	// returns -1 (not found)
		c.put(4, 4); 					// LRU key was 1, evicts key 1, cache is {4=4, 3=3}
		c.get(1);    	// return -1 (not found)
		assertEquals(c.get(3), 3);    	// return 3
	}
	@Test
	void test5() {
		c.put(1, 1); 					// cache is {1=1}
		c.put(2, 2); 					// cache is {1=1, 2=2}
		c.get(1);    	// return 1
		c.put(3, 3);	 				// LRU key was 2, evicts key 2, cache is {1=1, 3=3}
		c.get(2);   	// returns -1 (not found)
		c.put(4, 4); 					// LRU key was 1, evicts key 1, cache is {4=4, 3=3}
		c.get(1);    	// return -1 (not found)
		c.get(3);    	// return 3
		assertEquals(c.get(4), 4);    	// return 4
	}
}
