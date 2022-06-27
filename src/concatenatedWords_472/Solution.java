package concatenatedWords_472;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

class Solution {
	public List<String> findAllConcatenatedWordsInADict(String[] words) {
		LinkedList<String> res = new LinkedList<>();
		
		HashSet<String> wordSet = new HashSet<>(words.length*2);
		
		for(String s : words) wordSet.add(s);
		
		for(String s : words) {
			wordSet.remove(s);
			if(isConcat2(s, wordSet)) res.add(s);
			wordSet.add(s);
		}
		return res;
    }
	
	private boolean isConcat2(String s, HashSet<String> wordSet) {
		if(s.isEmpty()) return true;
		
		for(int i=s.length(); i>=0; i--) {
			if(wordSet.contains(s.substring(0,i))) {
				if(isConcat2(s.substring(i,s.length()), wordSet)) return true;
			}
		}
		return false;
	}
	
	
	// This one is too slow even though it implements good dynamic programming
	private boolean isConcat(String s, HashSet<String> wordSet) {
		boolean[] table = new boolean[s.length() + 1];
		Arrays.fill(table, false);
		table[0] = true;
		
		String targetSub;
		for(int i=0; i<=s.length(); i++) {
			if(table[i]) {
				for(String sub : wordSet) {
					if((i + sub.length()) <= s.length()) {
						targetSub = s.substring(i, i + sub.length());
						if(targetSub.equals(sub)) {
							if(i+sub.length() == s.length()) return true;
							table[i+sub.length()] = true;
						}
					}
				} 
			}
		}
		return table[s.length()];
	}
}
