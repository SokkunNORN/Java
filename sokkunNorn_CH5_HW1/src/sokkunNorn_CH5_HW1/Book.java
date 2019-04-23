package sokkunNorn_CH5_HW1;

public class Book {

	private String title;
	private String author;
	private int publishYear;
	private boolean isBorrowed;
	
	public Book(String title, String author, int publishYear) {
		this.title = title;
		this.author = author;
		this.publishYear = publishYear;
	}
	
	public void borrow() {
		isBorrowed = true;
	}
	
	public void returnBack() {
		isBorrowed = false;
	}
	
	String getTitle() {
		return this.title;	
	}
	
	String getAuthor() {
		return this.author;
	}
	
	int getPublishYear() {
		return publishYear;		
	}
	
	Boolean getBorrowed() {
		return isBorrowed;
	}

	@Override
	public String toString() {
		String status;
		if (isBorrowed == true) {
			status = "Not Available to Borrow";
		} else {
			status = "Available to Borrow";
		}
		
//		status = ((isBorrowed == true) ? "Not Available to Borrow" : "Available to Borrow");
		
		return "Title: " + title + "   \n by " + author + "--published " + publishYear + "   \n Status: " + status;
	}
	
	
	
	
}
