package minDeletionsMakeCharFrequenciesUnique_1647;

/*
 * A string s is called good if there are no two different characters in s that have the same frequency.
 * 
 * Given a string s, return the minimum number of characters you need to delete to make s good.
 * 
 * The frequency of a character in a string is the number of times it appears in the string. For example, in 
 * the string "aab", the frequency of 'a' is 2, while the frequency of 'b' is 1.
 */

class Solution {
	public int minDeletions(String s) {
		int[] charCount = new int[26];
		boolean[] freq = new boolean[s.length() + 1]; 
		int deletions = 0;
		
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			charCount[c - 'a']++;
		}
		for(int i=0; i<26; i++) {
			while(freq[charCount[i]] && charCount[i]>0) {
				charCount[i]--;
				deletions++;
			}
			freq[charCount[i]] = true;
		}
		return deletions;
    }
}
