package searchSuggestionsSystem_1268;

import java.util.Arrays;
import java.util.List;
import java.util.LinkedList;

public class Solution2 {
	public List<List<String>> suggestedProducts(String[] products, String searchWord) {
		List<List<String>> results = new LinkedList<List<String>>();
		
		Arrays.sort(products);
		List<String> singleResult;
		
		String subWord;
		for(int i=1; i<=searchWord.length(); i++) {
			singleResult = new LinkedList<>();
			subWord = searchWord.substring(0,i);
			for(String p : products) {
				if(p.startsWith(subWord) && singleResult.size() < 3) singleResult.add(p);
			}
			results.add(singleResult);
		}
		return results;
    }
}
