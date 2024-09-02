package com.xworkz.places.tester;

import com.xworkz.places.things.Places;

public class PlacesTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Places india=new Places();
		System.out.println(india.name);
		System.out.println(india.location);
		System.out.println(india.area);
		System.out.println(india.population);
		System.out.println(india.climate);
		
		Places uk=new Places("united kingdom");
		System.out.println(uk.name);
		System.out.println(uk.location);
		System.out.println(uk.area);
		System.out.println(uk.population);
		System.out.println(uk.climate);
		
		Places result=new Places("usa","foreign");
		System.out.println(result.name);
		System.out.println(result.location);
		System.out.println(result.area);
		System.out.println(result.population);
		System.out.println(result.climate);
		
		Places result1=new Places("usa","foreign",21.3);
		System.out.println(result1.name);
		System.out.println(result1.location);
		System.out.println(result1.area);
		System.out.println(result1.population);
		System.out.println(result1.climate);
		
		Places result2=new Places("usa","foreign",21.3,45);
		System.out.println(result2.name);
		System.out.println(result2.location);
		System.out.println(result2.area);
		System.out.println(result2.population);
		System.out.println(result2.climate);
		
		Places result3=new Places("usa","foreign",21.3,45,"hot");
		System.out.println(result3.name);
		System.out.println(result3.location);
		System.out.println(result3.area);
		System.out.println(result3.population);
		System.out.println(result3.climate);
		
		
		
		
		
	}

}
