package com.xworkz.registration.tester;

import com.xworkz.resgistration.things.Registration;

public class ResgistrationTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//you can only call arguments where constructor has been declared, like one argument, 2 argument and all, we cannot call 4 argument or 5 argument because we have not initialised it
		Registration shashi=new Registration();
		System.out.println(shashi.firstName);
		System.out.println(shashi.lastName);
		System.out.println(shashi.password);
		System.out.println(shashi.qualifications);
		System.out.println(shashi.country);
		//System.out.println(shashi.phoneNumber);
		
		
		
		Registration result=new Registration("shashi");
		System.out.println(result.firstName);
		System.out.println(result.lastName);
		System.out.println(result.password);
		System.out.println(result.qualifications);
		System.out.println(result.country);
		
		Registration result1=new Registration("shashi","lokesh");
		System.out.println(result1.firstName);
		System.out.println(result1.lastName);
		System.out.println(result1.password);
		System.out.println(result1.qualifications);
		System.out.println(result1.country);
		
		Registration result2=new Registration("shashi","lokesh","abcd");
		System.out.println(result2.firstName);
		System.out.println(result2.lastName);
		System.out.println(result2.password);
		System.out.println(result2.qualifications);
		System.out.println(result2.country);
		
		
		
		
		
		//declare the array and intialize it
		String education[]= {"10th","12th","BE"};
		Registration tarun=new Registration("tarun","reddy","1234",education,"india",123456789);
		System.out.println(tarun.firstName);
		System.out.println(tarun.lastName);
		System.out.println(tarun.password);
		//System.out.println(tarun.qualifications);--------------because it is an array , we need to use for loop to print elements if not it will print the address
		for(int i=0;i<=education.length-1;i++)
		{
			System.out.println(tarun.qualifications[i]);
		}
		
		System.out.println(tarun.country);
		//System.out.println(tarun.phoneNumber);
		
		
		





		
		
		
		
	}

}
