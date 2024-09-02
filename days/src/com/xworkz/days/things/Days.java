package com.xworkz.days.things;

public class Days {

//	public static String weekDays;
//	public static String weekEnds;


	public static void numberDays(String[] daysInWeek)
	{
		for(int i=0;i<=daysInWeek.length-1;i++) 
		{
			if(daysInWeek[i]=="sunday" || daysInWeek[i]=="saturday")
			{
				System.out.println(daysInWeek[i]+":weekend");
			}
			else
			{
				System.out.println(daysInWeek[i]+":day is weekday");

			}
		}


	}
}




