package phoneDirectory_379;

import java.util.LinkedList;
import java.util.Queue;

/*
 * Design a phone directory that initially has maxNumbers empty slots that can store numbers. The directory should 
 * store numbers, check if a certain slot is empty or not, and empty a given slot.
 * 
 * Implement the PhoneDirectory class:
 * 	> PhoneDirectory(int maxNumbers) Initializes the phone directory with the number of available slots maxNumbers.
 * 	> int get() Provides a number that is not assigned to anyone. Returns -1 if no number is available.
 * 	> bool check(int number) Returns true if the slot number is available and false otherwise.
 * 	> void release(int number) Recycles or releases the slot number.
 */

public class PhoneDirectory {
	Queue<Integer> unallocated;
	int maxNum;
	int nextNum;
	
	// Runs in constant time
	PhoneDirectory(int maxNumbers){
		unallocated = new LinkedList<>();
		maxNum = maxNumbers - 1;
		nextNum = 0;
	}
	
	// Runs in constant time
	int get() {
		if(!unallocated.isEmpty()) return unallocated.remove(); // Prefer the queue
		if(nextNum <= maxNum) {
			return nextNum++;
		}
		return -1;	// Means the queue is empty and we ran out of new numbers 
	}
	
	// Runs in linear time, could be made faster by using a data structure that is searched in constant time
	boolean check(int number) {
	if(unallocated.contains(number) || number >= nextNum) return true;
	return false;
	}
	
	// Runs in linear time, could be made faster by using a data structure that is searched in constant time
	void release(int number) {
		if(!unallocated.contains(number) && number < nextNum) {	// Checks that this number has been allocated and 
																// ...this is not a duplicate release
			unallocated.add(number);
		}
	}
}
