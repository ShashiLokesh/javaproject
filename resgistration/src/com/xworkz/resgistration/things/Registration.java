package com.xworkz.resgistration.things;

public class Registration {
//instance variables
	public String firstName;
	public String lastName;
	public String password;
	public String[] qualifications;
	public String country;
	//public int phoneNumber;
	
	public Registration()
	{
		System.out.println("no argument constructor");
	}
	public Registration(String firstName)
	{
		//this is used when instance variable and the parameter sent are same
		//instance variable=parameter
		this.firstName=firstName;
		System.out.println("1 argument constructor");

		
	}
	public Registration(String firstName,String lastName)
	{
		this.firstName=firstName;
		this .lastName=lastName;
		System.out.println("2 argument constructor");
	}
	
	public Registration(String firstName,String lastName,String password)
	{
		this.firstName=firstName;
		this .lastName=lastName;
		this.password=password;
		System.out.println("3 argument constructor");
	}
	
	public Registration(String firstName,String lastName,String password,String[] qualifications)
	{
		this.firstName=firstName;
		this .lastName=lastName;
		this.password=password;
		this.qualifications=qualifications;
		System.out.println("4 argument constructor");
	}
	
	public Registration(String firstName,String lastName,String password,String[] qualifications,String country)
	{
		this.firstName=firstName;
		this .lastName=lastName;
		this.password=password;
		this.qualifications=qualifications;
		this.country=country;
		System.out.println("4 argument constructor");
	}
	
	
	
	public Registration(String firstName,String lastName,String password,String[] qualifications,String country,int phoneNumber)
	{
		this.firstName=firstName;
		this .lastName=lastName;
		this.password=password;
		this.qualifications=qualifications;
		this.country=country;

		System.out.println("all argument constructor");
	}
	
	
	
	
	
	
}
