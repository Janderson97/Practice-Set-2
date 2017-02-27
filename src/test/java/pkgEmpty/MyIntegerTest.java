package pkgEmpty;

import static org.junit.Assert.*;
import org.junit.Test;
import base.MyInteger;

public class MyIntegerTest {

	public void isEvenTest() {
		assertTrue("2 is even.", isEven(2));
	}
	public void isOddTest() {
		assertTrue("1 is odd.", isOdd(1));
	}	
	public void isPrimeTest() {
		assertTrue("5 is prime.", isPrime(5));
	}
	public void equalsTest() {
		assertTrue("This number is equal to 3.", equals(3));
	}


}
