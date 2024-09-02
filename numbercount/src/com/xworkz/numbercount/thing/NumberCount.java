package com.xworkz.numbercount.thing;

public class NumberCount {
	
	
	
	public static void numberCount(int numbers[])
	  {
		  int positiveNumber=0;
		  	  int negativeNumber=0;

		  
		  for(int i=0;i<=numbers.length-1;i++)
		  {
			  
			  if(numbers[i]>0)
			  {
				  System.out.println(numbers[i]);
				  positiveNumber++;
				  System.out.println("Positive numbers:" +positiveNumber);
			  }
			  else
			  {
				  System.out.println(numbers[i]);
				  negativeNumber++;
				  System.out.println("Negative numbers:" +negativeNumber);
			  }
			  
		  }
//		  return "numberCount";
	  }
	}


