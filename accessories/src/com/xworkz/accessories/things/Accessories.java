package com.xworkz.accessories.things;

public class Accessories {

	public String name;          
    public String location;      
    public double rating;          
    public String type;       
    public String fav;    

public Accessories()
{
	System.out.println("no argument constructor");
}
public Accessories(String name)
{
	//this is used when instance variable and the parameter sent are same
	//instance variable=parameter
	this.name=name;
	System.out.println("1 argument constructor");

	
}
public Accessories(String name,String location)
{
	this.name=name;
	this .location=location;
	System.out.println("2 argument constructor");
}

public Accessories(String name,String location,double rating)
{
	this.name=name;
	this .location=location;
	this.rating=rating;
	System.out.println("3 argument constructor");
}
public Accessories(String name,String location,double rating,String type)
{
	this.name=name;
	this .location=location;
	this.rating=rating;
	this.type=type;
	System.out.println("4 argument constructor");
}
public Accessories(String name,String location,double rating,String type,String fav)
{

	this.name=name;
	this .location=location;
	this.rating=rating;
	this.type=type;
	this.fav=fav;
	System.out.println("5 argument constructor");
}

}
