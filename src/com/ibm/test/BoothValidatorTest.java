package com.ibm.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.ibm.BoothValidator;

public class BoothValidatorTest {

	@Test
	public void validateBoothDetailsIsValidTest() throws Exception {
  		BoothValidator boothValidator = new BoothValidator();
		boolean actualResult = boothValidator.validBoothDetails("Mohali");
		Assertions.assertTrue(actualResult);
	}
	
	@Test
	public void validateBoothDetailsInValidTest() throws Exception {
		BoothValidator boothValidator = new BoothValidator();
		boolean actualResult = boothValidator.validBoothDetails("");
		Assertions.assertFalse(actualResult);
	}
	                                                    
	@Test
	public void validateBoothDetailsInValidTestOne() {
		String bootName = null;
		BoothValidator boothValidator = new BoothValidator();
		Exception actualResult = Assertions.assertThrows(Exception.class, ()-> boothValidator.validBoothDetails(bootName));
		Assertions.assertEquals("Booth name is Invalid", actualResult.getMessage());
	}
 }