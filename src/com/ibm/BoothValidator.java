package com.ibm;

public class BoothValidator {

	public boolean validBoothDetails(String boothName) throws Exception {
		if(boothName == null) {
			throw new Exception("Booth name is Invalid");
		}
		if(boothName.isEmpty()) {
			return false;
		}else {
			return true;
		}
	}
}
