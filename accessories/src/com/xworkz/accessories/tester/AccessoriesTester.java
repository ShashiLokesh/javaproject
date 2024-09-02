package com.xworkz.accessories.tester;

import com.xworkz.accessories.things.Accessories;

public class AccessoriesTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Accessories cream=new Accessories();
		System.out.println(cream.name);
		System.out.println(cream.location);
		System.out.println(cream.rating);
		System.out.println(cream.type);
		System.out.println(cream.fav);
		
		Accessories result=new Accessories("lakme");
		System.out.println(result.name);
		System.out.println(result.location);
		System.out.println(result.rating);
		System.out.println(result.type);
		System.out.println(result.fav);
		
		
		Accessories result1=new Accessories("lakme","india");
		System.out.println(result1.name);
		System.out.println(result1.location);
		System.out.println(result1.rating);
		System.out.println(result1.type);
		System.out.println(result1.fav);
		
		Accessories result2=new Accessories("lakme","india",3.5);
		System.out.println(result2.name);
		System.out.println(result2.location);
		System.out.println(result2.rating);
		System.out.println(result2.type);
		System.out.println(result2.fav);
		
		Accessories result3=new Accessories("lakme","india",3.5,"creams");
		System.out.println(result3.name);
		System.out.println(result3.location);
		System.out.println(result3.rating);
		System.out.println(result3.type);
		System.out.println(result3.fav);
		
		
		Accessories result4=new Accessories("lakme","india",3.5,"creams","balm");
		System.out.println(result4.name);
		System.out.println(result4.location);
		System.out.println(result4.rating);
		System.out.println(result4.type);
		System.out.println(result4.fav);
		
		
		
		
		
	}


	}


