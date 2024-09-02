package com.xworkz.vehicle.things;

public class Vehicle {
	
	    public String make;
	    public String model;
	    public int year;
	    public double price;

	    // Default constructor
	    public Vehicle() {
	        System.out.println("args 0 ");
	    }

	    
	    public Vehicle(String make)
	    {
	    	this();
	        this.make=make;
	        System.out.println("args 1 ");
	        
	    }
	    public Vehicle(String make,String model)
	    {
	    	this("Honda");
	        this.make=make;
	        this.model=model;
	        System.out.println("args 2");
	        
	    }

	    public Vehicle(String make,String model,int year)
	    {
	    	this("Honda", "Civic");
	        this.make=make;
	        this.model=model;
	        this.year=year;
	        System.out.println("args 3");
	        
	    }
	    public Vehicle(String make,String model,int year,double price)
	    {
	        this("Ford","Mustang", 2024);
	    	this.make=make;
	        this.model=model;
	        this.year=year;
	        this.price=price;
	        System.out.println("args 4");
	        
	    }

	}


