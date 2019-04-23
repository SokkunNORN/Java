package sokkunNorn_CH5_HW1;

import java.util.ArrayList;
public class Demo {

	public static void main(String[] args) {
		
		Book book1 = new Book("Don't make me think", "Steve Krung", 2000);
		Book book2 = new Book("Pro java programming", "Terrill", 2005);
		Book book3 = new Book("Programming in python 3", "Mark Summerfield", 2005);
		Book book4 = new Book("The clean coder", "Robert", 2011);
		Book book5 = new Book("The art of Agile development", "James Shore", 2007);
		Book book6 = new Book("Head First Design Patterns", "Eric Freeman", 2004);
		Book book7 = new Book("The Linux Command Line", "Willian", 2009);
		Book book8 = new Book("Code Complete", "Steve", 1993);
		Book book9 = new Book("Unit Test Patterns", "Gerard Meszaros", 2003);
		Book book10 = new Book("The C++ Programming Language", "Bjarne Stroustup", 2013);
		
		
		ArrayList<Book> book = new ArrayList();
		book1.borrow();
		book.add(book1);
		book.add(book2);
		book3.borrow();
		book.add(book3);
		book4.borrow();
		book.add(book4);
		book.add(book5);
		book.add(book6);
		book7.borrow();
		book.add(book7);
		book.add(book8);
		book.add(book9);
		book10.borrow();
		book.add(book10);

//		for(Book books: book){
//			System.out.println(books);
//		}
		
//		for (int i = 0; i < book.size(); i++) {
//			System.out.println(book.get(i));
//		}		

	    // Print the list objects in tabular format.		
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		System.out.printf("%28s %23s %20s %27s", "TITLE", "AUTHOR", "YEAR", "STATUS");
	    System.out.println();
		System.out.println("--------------------------------------------------------------------------------------------------------------");
	    for(Book bookAll: book){
	        System.out.format("%28s %23s %20s %27s",
	        	bookAll.getTitle(), bookAll.getAuthor(), bookAll.getPublishYear(), bookAll.getBorrowed() == true ? "Not Available to Borrow" : "Available to Borrow");
		    System.out.println();
		}
	    System.out.println("--------------------------------------------------------------------------------------------------------------");		
	    System.out.println(" ");
	    Student student = new Student("Sokkun", "Web_2019");
	    
	    student.borrowBook(book2);
	    student.borrowBook(book5);
	    student.borrowBook(book8);
	    System.out.println(student);
	    student.returnBook(book5);
	    System.out.println(student);
	
	    // Print the list objects in tabular format.		
	 	System.out.println("--------------------------------------------------------------------------------------------------------------");
	 	System.out.printf("%28s %23s %20s %27s", "TITLE", "AUTHOR", "YEAR", "STATUS");
	 	System.out.println();
	 	System.out.println("--------------------------------------------------------------------------------------------------------------");
	 	for(Book bookAll: book){
	 	    System.out.format("%28s %23s %20s %27s",
	 	    	bookAll.getTitle(), bookAll.getAuthor(), bookAll.getPublishYear(), bookAll.getBorrowed() == true ? "Not Available to Borrow" : "Available to Borrow");
	 		System.out.println();
	 	}
	 	System.out.println("--------------------------------------------------------------------------------------------------------------");		
	 	
	    
	}

}
