package lruCache_146;

import java.util.*;
/*
 * Design a data structure that follows the constraints of a Least Recently Used (LRU) cache.
 * 
 * Implement the LRUCache class:
 * 
 * LRUCache(int capacity) Initialize the LRU cache with positive size capacity.
 * int get(int key) Return the value of the key if the key exists, otherwise return -1.
 * void put(int key, int value) Update the value of the key if the key exists. Otherwise, add the 
 * key-value pair to the cache. If the number of keys exceeds the capacity from this operation, evict the 
 * least recently used key.
 * 
 * The functions get and put must each run in O(1) average time complexity.
 * 
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */

class LRUCache {
	int capacity;
	int size;
	HashMap<Integer,Node> hm;
	Node headPtr;
	Node tailPtr;
	
	public LRUCache(int capacity) {
        this.capacity = capacity;
        size = 0;
        hm = new HashMap<>();
        
        headPtr = new Node(Integer.MIN_VALUE, Integer.MIN_VALUE);
        tailPtr = new Node(Integer.MIN_VALUE, Integer.MIN_VALUE);
        headPtr.next = tailPtr;
        tailPtr.prev = headPtr;
    }
    
    public int get(int key) {
        if(hm.containsKey(key)) {
        	toTail(hm.get(key));
        	return hm.get(key).value;
        }
        return -1;
    }
    
    public void put(int key, int value) {
    	Node newNode = new Node(key, value);
    	
    	if(size == 0) {
        	headPtr.next = newNode;
        	tailPtr.prev = newNode;
        	newNode.prev = headPtr;
        	newNode.next = tailPtr;
        	size++;
        	
            hm.put(key, newNode);
        }
        else if(hm.containsKey(key)) {
        	Node existingNode = hm.get(key);
        	existingNode.value = value;
        	toTail(existingNode);
        }
        else {
        	tailPtr.prev.next = newNode;
        	newNode.prev = tailPtr.prev;
        	tailPtr.prev = newNode;
        	newNode.next = tailPtr;
        	
        	hm.put(key, newNode);
        	size++;
        }
        if(size>capacity) {
        	hm.remove(headPtr.next.key);
        	
        	headPtr.next = headPtr.next.next;
        	headPtr.next.prev = headPtr;
        	
        	size--;
        }
    }
    private void toTail(Node n) {
    	//rearrange the pointers to move this to the tail of the list
    	//detach
    	n.prev.next = n.next;
    	n.next.prev = n.prev;
    	//re-attach
    	tailPtr.prev.next = n;
    	n.prev = tailPtr.prev;
    	tailPtr.prev = n;
    	n.next = tailPtr;
    }
}