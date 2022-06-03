package longestHappyString_1405;

import java.util.PriorityQueue;

/*
 * A string s is called happy if it satisfies the following conditions:
 * s only contains the letters 'a', 'b', and 'c'.
 * s does not contain any of "aaa", "bbb", or "ccc" as a substring.
 * s contains at most a occurrences of the letter 'a'.
 * s contains at most b occurrences of the letter 'b'.
 * s contains at most c occurrences of the letter 'c'.
 * Given three integers a, b, and c, return the longest possible happy string. 
 * If there are multiple longest happy strings, return any of them. If there is no such string, 
 * return the empty string "".
 * 
 * A substring is a contiguous sequence of characters within a string.
 */

class Solution {
	public String longestDiverseString(int a, int b, int c) {
        if(a==0 && b==0 && c==0) return "";
        
        PriorityQueue<gNode> pq = new PriorityQueue<>();
        
        if(a>0) pq.add(new gNode('a', a));
        if(b>0) pq.add(new gNode('b', b));
        if(c>0) pq.add(new gNode('c', c));
        
        StringBuilder str = new StringBuilder();

        gNode tempNode;
        gNode tempNode2;
        
        while(pq.size() != 0) {
        	tempNode = pq.remove();
        	
        	if(isLegal(str, tempNode.key)) {
        		str.append(tempNode.key);
        		if(tempNode.val > 1) {
        			tempNode.val--;
        			pq.add(tempNode);
        		}	
        	}
        	else if(pq.size() > 0) {
        		str.append(pq.peek().key);

        		tempNode2 = pq.remove();
        		pq.add(tempNode);
        		tempNode2.val--;
        		if(tempNode2.val > 0) pq.add(tempNode2);
        	}
        }
        return str.toString();
    }
	boolean isLegal(StringBuilder str, char z) {
		String s = str.toString();
		
		if(s.length() < 2) return true;
		
		char x = s.charAt(s.length() - 1);
		char y = s.charAt(s.length() - 2);
		
		if(x==z && y==z) return false;
		return true;
	}
}
class gNode implements Comparable<gNode>{
	char key;
	int val;
	
	gNode(char k, int v){
		this.key = k;
		this.val = v;
	}
	
	@Override
	public int compareTo(gNode gn) {
		if(gn.val == this.val)return 0;
		return (this.val < gn.val) ? 1 : -1; 
	}
}