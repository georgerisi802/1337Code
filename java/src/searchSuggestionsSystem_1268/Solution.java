package searchSuggestionsSystem_1268;

import java.util.List;
import java.util.LinkedList;
import java.util.Arrays;
import java.util.ArrayList;

/*
 * This solution attempts to use a prefix tree (trie) but searching it is very difficult.
 * 
 * I will come back to this, but see solution 2
 */

public class Solution {
	public List<List<String>> suggestedProducts(String[] products, String searchWord) {
		List<List<String>> result = new LinkedList<List<String>>();
		
		TrieNode root = new TrieNode(' ');
		
		for(String p : products) insert(p.toCharArray() ,0 , root);
		
		for(int i=0; i<searchWord.length(); i++) {
			result.add(search(searchWord.substring(0,i), root));
		}
		return result;
    }
	
	private void insert(char[] word, int index, TrieNode root) {
		if(index == word.length) {
			root.endWord = true;
			return;
		}
		char curChar = word[index];
		if(!root.children.containsKey(curChar)) {
			root.children.put(curChar, new TrieNode(curChar));
		}
		insert(word, index + 1, root.children.get(curChar));
	}
	
	private List<String> search(String searchWord, TrieNode root){
		List<String> result = new LinkedList<>();
		TrieNode curNode = root;
		int index = 0;
		ArrayList<Character> partResult = new ArrayList<>();
		while(result.size() < 1) {
			while(index < searchWord.length() && curNode.children.containsKey(searchWord.charAt(index)) ) {
				curNode = curNode.children.get(searchWord.charAt(index));
				partResult.add(curNode.content);
				index++;
			}
			result.add(partResult.toString());
		}
		return result;
	}
}
