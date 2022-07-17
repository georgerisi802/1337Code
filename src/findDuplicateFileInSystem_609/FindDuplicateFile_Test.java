package findDuplicateFileInSystem_609;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Arrays;
import java.util.LinkedList;

class FindDuplicateFile_Test {

	@Test
	void example1() {
		String[] input = new String[] {"root/a 1.txt(abcd) 2.txt(efgh)","root/c 3.txt(abcd)","root/c/d 4.txt(efgh)",
				"root 4.txt(efgh)"};
		
		List<List<String>> expected = new LinkedList<List<String>>();
		expected.add(Arrays.asList("root/a/2.txt","root/c/d/4.txt","root/4.txt"));
		expected.add(Arrays.asList("root/a/1.txt","root/c/3.txt"));
		
		Solution sol = new Solution();
		List<List<String>> actual = sol.findDuplicate(input);
		
		assertTrue(expected.size() == actual.size() && actual.containsAll(expected));
	}
	
	@Test
	void example2() {
		String[] input = new String[] {"root/a 1.txt(abcd) 2.txt(efgh)","root/c 3.txt(abcd)","root/c/d 4.txt(efgh)"};
		
		List<List<String>> expected = new LinkedList<List<String>>();
		expected.add(Arrays.asList("root/a/2.txt","root/c/d/4.txt"));
		expected.add(Arrays.asList("root/a/1.txt","root/c/3.txt"));
		
		Solution sol = new Solution();
		List<List<String>> actual = sol.findDuplicate(input);
				
		assertTrue(expected.size() == actual.size() && actual.containsAll(expected));
	}
}
