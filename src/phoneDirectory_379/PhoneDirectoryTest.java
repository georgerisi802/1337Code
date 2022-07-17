package phoneDirectory_379;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PhoneDirectoryTest {

	@Test
	void example1_1() {
		PhoneDirectory phoneDirectory = new PhoneDirectory(3);
		phoneDirectory.get(); 
		phoneDirectory.get();
		assertTrue(phoneDirectory.check(2));
	}
	
	@Test
	void example1_2() {
		PhoneDirectory phoneDirectory = new PhoneDirectory(3);
		phoneDirectory.get(); 
		phoneDirectory.get();
		phoneDirectory.check(2);
		phoneDirectory.get();
		assertFalse(phoneDirectory.check(2));
	}
	
	@Test
	void example1_3() {
		PhoneDirectory phoneDirectory = new PhoneDirectory(3);
		phoneDirectory.get(); 
		phoneDirectory.get();
		phoneDirectory.check(2);
		phoneDirectory.get();
		phoneDirectory.check(2);
		phoneDirectory.release(2);
		assertTrue(phoneDirectory.check(2));
	}
	
	@Test
	void case2() {
		PhoneDirectory phoneDirectory = new PhoneDirectory(1);
		phoneDirectory.check(0);
		phoneDirectory.get();
		phoneDirectory.check(0);
		
		assertEquals(-1, phoneDirectory.get());
	}
}
