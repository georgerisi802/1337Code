package searchSuggestionsSystem_1268;

import java.util.TreeMap;

public class TrieNode {
	TreeMap<Character, TrieNode> children;
	char content;
	boolean endWord;
	
	TrieNode(char content){
		this.content = content;
		this.children = new TreeMap<>();
	}
}
