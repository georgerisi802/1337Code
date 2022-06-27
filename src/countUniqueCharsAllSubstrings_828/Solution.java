package countUniqueCharsAllSubstrings_828;

import java.util.Set;
import java.util.HashMap;
import java.util.HashSet;


/* This solution works and is a good implementation of dynamic programming but the nested loops
 * make it too slow still because there are not many repeated substrings to put in the memo.
 */

class Solution {
	public int uniqueLetterString(String s) {
		HashMap<String, Integer> memo = new HashMap<>();
		String sub;
		int result = 0;
		for(int i=0; i<s.length(); i++) {
			for(int j=i+1; j<=s.length(); j++) {
				sub = s.substring(i,j);
				if(memo.containsKey(sub)) result += memo.get(sub);
				else{
					memo.put(sub, countUniqueChars(sub));
					result += memo.get(sub);
				}
			}
		}
		return result;
    }
	
	private int countUniqueChars(String s) {
		Set<Character> charSet = new HashSet<>();
		Set<Character> duplicates = new HashSet<>();
		int result = 0;
		char c;
		for(int i=0; i<s.length(); i++) {
			c = s.charAt(i);
			if(!charSet.contains(c)) {
				if(!duplicates.contains(c)) {
					result++;
					charSet.add(c);
				}
			}
			else {
				result--;
				charSet.remove(c);
				duplicates.add(c);
			}
		}
		return result;
	}
}
