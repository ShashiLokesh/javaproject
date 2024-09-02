package com.xworkz.student.things;

public class Student {


	public String name;
	public int age;
	public double grade;
	public int enrollmentYear;

	// Default constructor
	public Student() {

		System.out.println("0 args");
	}


	public Student(String name) {
		this();
		this.name=name;
		System.out.println("1 args");
	}



	public Student(String name,int age){
		this("Bob");
		this.name=name;
		this.age=age;
		System.out.println("2 args");
	}

	public Student(String name,int age , double grade)
	{
		this("Bob", 21);
		this.name=name;
		this.age=age;
		this.grade=grade;

		System.out.println("3args");
	}

	public Student(String name,int age , double grade , int enrollmentYear)
	{

		this("Charlie", 22, 92.0);
		this.name=name;
		this.age=age;
		this.grade=grade;
		this.enrollmentYear=enrollmentYear;

		System.out.println("4args");
	}
}








