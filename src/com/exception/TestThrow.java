package com.exception;

public class TestThrow {

	public static void main(String[] args) {
		
		
		
		CustomException c = new CustomException();
		try {
			throw c;
		} catch (CustomException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
