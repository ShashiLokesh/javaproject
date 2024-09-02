package com.xworkz.book.tester;

import com.xworkz.book.things.Book;

public class BookTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		        Book book1 = new Book(); // Uses default values
		        Book book2 = new Book("Brave New World","George Orwell"); 
		        Book book3 = new Book("Brave New World", "Aldous Huxley", 15.99); 
		        Book book4 = new Book("Fahrenheit 451", "Ray Bradbury", 12.99, 1953); // Sets all properties
		        
		       
		}


	}


