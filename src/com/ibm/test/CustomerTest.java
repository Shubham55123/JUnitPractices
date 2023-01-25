package com.ibm.test;

import org.junit.jupiter.api.Assertions;

import com.ibm.Customer;

public class CustomerTest {

	public void getCustomerIdTest() {
		Customer customer = new Customer(12345);
		Integer actualObject = customer.getCustomerId();
		Integer expectedObject = 12345;
		Assertions.assertEquals(expectedObject, actualObject);
	}
 }
