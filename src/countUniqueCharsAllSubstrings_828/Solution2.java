package countUniqueCharsAllSubstrings_828;

import java.util.HashSet;

/* In this version of the solution we only evaluate the new postfix in the countUniqueChars method and
 * the two HashSets used by that function become members of the uniqueLetterString method.
 */

class Solution2 {
	
	public int uniqueLetterString(String s) {
		
		String sub;
		HashSet<Character> charSet;
		HashSet<Character> duplicates;
		int totalResult = 0;
		int lastResult = 0;
		for(int i=0; i<s.length(); i++) {
			charSet = new HashSet<>(s.length()*2);
			duplicates  = new HashSet<>(s.length()*2);
			lastResult = 0;
			for(int j=i+1; j<=s.length(); j++) {
				sub = s.substring(i,j);
				lastResult = countUniqueChars(sub, charSet, duplicates, lastResult);
				totalResult += lastResult;
				//System.out.println("Running sum is: " + totalResult);
			}
		}
		return totalResult;
    }
	
	private int countUniqueChars(String s, HashSet<Character> charSet, 
			HashSet<Character> duplicates, int lastResult) {
		int result = lastResult;
		char c = s.charAt(s.length()-1);
		if(!charSet.contains(c)) {
			//System.out.println("\t" + c + " is not in the charset");
			if(!duplicates.contains(c)) {
				result++;
				charSet.add(c);
				//System.out.println("\t" + c + " is not in the duplicates");
			}
		}
		else {
			result--;
			charSet.remove(c);
			duplicates.add(c);
		}
		//System.out.println("Result for (" + s + ") is: " + result);
		return result;
	}
}
