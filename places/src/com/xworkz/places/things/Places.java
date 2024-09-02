package com.xworkz.places.things;

public class Places {
	    public String name;          
	    public String location;      
	    public double area;          
	    public int population;       
	    public String climate;    
	
	public Places()
	{
		System.out.println("no argument constructor");
	}
	public Places(String name)
	{
		//this is used when instance variable and the parameter sent are same
		//instance variable=parameter
		this.name=name;
		System.out.println("1 argument constructor");

		
	}
	public Places(String name,String location)
	{
		this.name=name;
		this .location=location;
		System.out.println("2 argument constructor");
	}
	
	public Places(String name,String location,double area)
	{
		this.name=name;
		this .location=location;
		System.out.println("3 argument constructor");
	}
	public Places(String name,String location,double area,int population)
	{
		this.name=name;
		this .location=location;
		this.population=population;
		System.out.println("4 argument constructor");
	}
	public Places(String name,String location,double area,int population,String climate)
	{
		this.name=name;
		this .location=location;
		this.population=population;
		this.climate=climate;
		System.out.println("5 argument constructor");
	}
	
	
	
}
