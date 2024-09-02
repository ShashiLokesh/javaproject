package com.xworkz.automobiles.things;
//properties,or fields or instance variables

//local varibales cannot be used without initialization, paramererised variables can be used even without initialization
//instance variable example--- public String example;
public class Automobiles {
	/*public static int maxWheels=4;
	public static short minWheels=2;
	public static long maxDoors=4l;
	public static float maxSpeed=12.1f;
	public static double minSpeed=13.4;
	public static boolean isEv=true;
	public static String name="hundai";
	public static char vehicleType='S';
	public static int maxPassangers=5;
	public static int minPassangers=2;
	*/
	public Automobiles(int maxWheels)
	{
		System.out.println("maxWheels:"+maxWheels);
	}
	public Automobiles(short minWheels)
	{
		System.out.println("minWheels:"+minWheels);
	}
	
	public Automobiles(long maxDoors)
	{
		System.out.println("maxDoors:"+maxDoors);
	}
	
	public Automobiles(float maxSpeed)
	{
		System.out.println("maxSpeed:"+maxSpeed);
	}
	
	public Automobiles(double minSpeed)
	{
		System.out.println("minSpeed:"+minSpeed);
	}
	
	public Automobiles(boolean isEv)
	{
		System.out.println("isEv:"+isEv);
	}
	
	public Automobiles(String name)
	{
		System.out.println("name:"+name);
	}
	
	public Automobiles(char vehicleType)
	{
		System.out.println("vehicleType:"+vehicleType);
	}
	
	public Automobiles(int maxPassangers)
	{
		System.out.println("maxPassangers:"+maxPassangers);
	}
	public Automobiles(int minPassangers)
	{
		System.out.println("minPassangers:"+minPassangers);
	}
	
	

}
