package com.xworkz.today.things;



public class Today {

	
	public String dayName;
	public boolean isHoloday;
	public String climate;
	public int dayNumber;
	
	public Today()
	{
		System.out.println("0 args contructor");
	}
	
	public Today(String dayName)
	{
		this();
		this.dayName=dayName;
		System.out.println("1 args contructor");
	}
	
	public Today(String dayName,boolean isHoliday)
	{
		this("monday");
		this.dayName=dayName;
		this.isHoloday=isHoliday;
		System.out.println("2 args contructor");
	}
	
	public Today(String dayName,boolean isHoliday,String climate)
	{
	
		this("monday",true);
		this.dayName=dayName;
		this.isHoloday=isHoliday;
		this.climate=climate;
		System.out.println("3 args contructor");
	}
	public Today(String dayName,boolean isHoliday,String climate,int dayNumber)
	{
		this("monday",true,"hot");
		
		this.dayName=dayName;
		this.isHoloday=isHoliday;
		this.climate=climate;
		this.dayNumber=dayNumber;
		System.out.println("4 args contructor");
	}
	
	
}
