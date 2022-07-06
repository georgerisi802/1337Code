package searchSuggestionsSystem_1268;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class SearchSuggestionsSystemTest {

	@Test
	void example1() {
		String[] products = new String[] {"mobile","mouse","moneypot","monitor","mousepad"};
		
		String searchWord = "mouse";
		
		List<List<String>> expected = new LinkedList<List<String>>();
		
		expected.add(Arrays.asList("mobile","moneypot","monitor"));
		expected.add(Arrays.asList("mobile","moneypot","monitor"));
		expected.add(Arrays.asList("mouse","mousepad"));
		expected.add(Arrays.asList("mouse","mousepad"));
		expected.add(Arrays.asList("mouse","mousepad"));
		
		Solution2 sol = new Solution2();
		
		assertEquals(expected, sol.suggestedProducts(products, searchWord));
	}
	
	@Test
	void example2() {
		String[] products = new String[] {"havana"};
		
		String searchWord = "havana";
		
		List<List<String>> expected = new LinkedList<List<String>>();
		
		expected.add(Arrays.asList("havana"));
		expected.add(Arrays.asList("havana"));
		expected.add(Arrays.asList("havana"));
		expected.add(Arrays.asList("havana"));
		expected.add(Arrays.asList("havana"));
		expected.add(Arrays.asList("havana"));
		
		Solution2 sol = new Solution2();
		
		assertEquals(expected, sol.suggestedProducts(products, searchWord));
	}
	
	@Test
	void example3() {
		String[] products = new String[] {"bags","baggage","banner","box","cloths"};
		
		String searchWord = "bags";
		
		List<List<String>> expected = new LinkedList<List<String>>();
		
		expected.add(Arrays.asList("baggage","bags","banner"));
		expected.add(Arrays.asList("baggage","bags","banner"));
		expected.add(Arrays.asList("baggage","bags"));
		expected.add(Arrays.asList("bags"));
		
		Solution2 sol = new Solution2();
		
		assertEquals(expected, sol.suggestedProducts(products, searchWord));
	}
}
