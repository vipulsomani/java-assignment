package com.myJava;
import junit.framework.*;
import org.junit.Test;

public class findNumberTest extends TestCase {

	@Test
	public void testMissingNumber() {
		assertEquals("missing number is",findNumber.missingNumber(new int[]{1,2,3,4,5,6,8}),7);
		assertEquals("missing number is ",findNumber.missingNumber(new int[]{11,12,13,15,16,17}),14);
		assertEquals("missing number is ",findNumber.missingNumber(new int[]{1,2,4}),3);
		assertEquals("missing number is ",findNumber.missingNumber(new int[]{1,-2,4}),-1);
		
	}

}
