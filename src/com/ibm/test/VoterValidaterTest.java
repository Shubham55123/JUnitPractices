package com.ibm.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.ibm.VoterValidater;

public class VoterValidaterTest {

	@Test
	@Tag("prod")
	public void validateVoterValidAgeTest() throws Exception {
		int age = 18;
		VoterValidater validator = new VoterValidater();
		boolean result = validator.validateVoterAge(age);
		Assertions.assertTrue(result);
	}
	
	@Test
	@Tag("Dev")
	public void validateVoterInValidAgeTest() throws Exception {
		int age = 15;
		VoterValidater validator = new VoterValidater();
		boolean result = validator.validateVoterAge(age);
		Assertions.assertFalse(result);
	}
	
	
//	public void validateVoterNegInValidOneAgeTest() throws Exception {
//		int age = - 34;
//		VoterValidater validator = new VoterValidater();
//		Exception exception = Assertions.assertThrows(Exception.class, ()->validator.validateVoterAge(age));
//		Assertions.assertEquals("JUnit Framework", exception.getMessage());
//	}
	
	@ParameterizedTest
	@CsvSource(value = {"19,true", "20,true", "22,true", "3,false", "9,false"})
	public void validateVoterAgeParameterisedTest(int age, boolean expected) throws Exception {
		VoterValidater voterValidater = new VoterValidater();
		boolean actual = voterValidater.validateVoterAge(age);
		Assertions.assertEquals(expected, actual);
	}
}
