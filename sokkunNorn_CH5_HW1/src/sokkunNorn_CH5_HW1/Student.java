package sokkunNorn_CH5_HW1;

import java.util.ArrayList; 
public class Student {

	private String firstName;
	private String batch;
	ArrayList<Book> bookCart;
	
	public Student(String firstName, String batch) {
		this.firstName = firstName;
		this.batch = batch;
		bookCart = new ArrayList();
		
	}
	
	public void borrowBook(Book book) {
		
		if (bookCart.size() < 3) {
			if (book.getBorrowed() == true) {
				System.out.println("This book isn't available!");
			} else {
				// add book into bookCart
				bookCart.add(book);
				
				// mask this book is borrowed
				book.borrow();
			}
		} else {
			System.out.println("You could borrow only maximum 3 books");
		}
		
	}

	public void returnBook(Book book) {
		// check if the book is in book cart or not
		if (bookCart.contains(book) == true) {
			// remove book from book cart
			bookCart.remove(book);
			// mask book as available
			book.returnBack();
		} else {
			System.out.println("You didn't borrow this book");
		}
	}
	
	public ArrayList<Book> getBookCart() {
		return bookCart;
	}
	
	@Override
	public String toString() {
		String books = "";
		for (Book b: bookCart) {
			books += b.getTitle() + "\n";
		}
		return firstName + " of class " + batch + " has borrow: \n" + books ;
	}
	
}
