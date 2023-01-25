package com.ibm;

public class VoterValidater {

	public boolean validateVoterAge(int age) throws Exception {
		
		if(age<0) {
			throw new Exception("JUnit Framework");
		}
		if(age>=18) {
			return true;
		}else {
			return false;
		}
	}
}
