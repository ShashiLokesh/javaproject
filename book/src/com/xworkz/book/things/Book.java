package com.xworkz.book.things;

public class Book {

	

	    public String title;
	    public String author;
	    public double price;
	    public int publicationYear;

	    // Default constructor
	    public Book() {
	        System.out.println("arg with 0 parameters");
	    }

	   
	    public Book(String title)
	    {
	    	this();
	        this.title=title;
	        System.out.println("arg with 1 parameters");

	        
	    }

	    
	    public Book(String title, String author) 
	    {
	    	this("Brave New World", "Aldous Huxley", 15.99); 
	    	this.title=title;
	    	 this.author=author;
		        System.out.println("arg with 2 parameters");
   
	    }

	    public Book(String title, String author,double price) 
	    {
	    	this("Fahrenheit 451", "Ray Bradbury", 12.99, 1953);
	    	 this.title=title;
	    	 this.author=author;
	    	 this.price=price;
		        System.out.println("arg with 3 parameters");
   
	    }
	    
	    public Book(String title, String author,double price,int publicationYear) 
	    {
	    	
	    	 this.title=title;
	    	 this.author=author;
	    	 this.price=price;
	    	 this.publicationYear=publicationYear;
		        System.out.println("arg with 4 parameters");
   
	    }
	   
	}


