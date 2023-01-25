package com.ibm.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JunitTestingLifeCycleAnnotations {

//	@AfterEach
//	public  void afterEachMethodTest() {
//		System.out.println("Business after Each Test :>>>>");
//	}
//	
//	@AfterAll
//	public static void afterAllMethodTest() {
//		System.out.println("Business after all Test :>>>>");
//	}
//	
//	@BeforeAll
//	public static void beforeAllMethodTest() {
//		System.out.println("Business before all Test :>>>>");
//	}
//	
//	@BeforeEach
//	public  void beforeEachMethodTest() {
//		System.out.println("Business before Each Test :>>>>");
//	}
//	
//	@Test
//	public void businessMethodTest() {
//		System.out.println("Business Method Test :>>>>");
//	}
	
	@AfterEach
	public void afterEachMethodTest() {
		System.out.println("Business after Each Test :>>>>");
	}
	
	@AfterAll
	public static void afterAllMethodTest() {
		System.out.println("Business after All Test :>>>>");
	}
	
	@BeforeAll
	public static void beforeAllMethodTest() {
		System.out.println("Business before all Test :>>>>");
	}
	
	@BeforeEach
	public void beforeEachMethodTest() {
		System.out.println("Business before Each Test :>>>>");
	}
	
	@Test
	public void bussinessMethodTest() {
		System.out.println("Business Method Test :>>>>");
	}
	
}
