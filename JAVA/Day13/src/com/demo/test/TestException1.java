package com.demo.test;

import com.demo.exception.NegativeSalaryException;
import com.demo.service.Service;

public class TestException1 {

	public static void main(String[] args) {
		Service se=new Service();
		try {
			se.acceptData();
		}
		catch(NegativeSalaryException e){
			System.out.println(e.getMessage());
		}

	}

}
