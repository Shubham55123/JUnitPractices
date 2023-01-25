package com.ibm.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.ibm.ValidateVoterAge;

public class ValidateVoterAgeTest {

	@Test
	public void validateVoterAgeValidTest() throws Exception {
		int age = 18;
		ValidateVoterAge validateVoterAge = new ValidateVoterAge();
		boolean result = validateVoterAge.validateVoterAge(age);
		Assertions.assertTrue(result);
	}
	@Test
	public void validateVoterAgeInvalidOneTest() throws Exception {
		int age = 15;
		ValidateVoterAge validateVoterAge =new ValidateVoterAge();
		boolean result = validateVoterAge.validateVoterAge(age);
		Assertions.assertFalse(result);
	}
	@Test
	public void validateVoterAgeInvalidTwoTest() throws Exception {
		int age=-15;
		ValidateVoterAge validateVoterAge =new ValidateVoterAge();
		Assertions.assertThrows(Exception.class, () -> validateVoterAge.validateVoterAge(age));
	}
}