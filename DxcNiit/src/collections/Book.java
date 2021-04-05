package collections;

public class Book implements Comparable<Book> {
	int id,quantity;
	String author, publisher, bookName;
	
	
	public Book(int id, String author, String publisher, String bookName,int quantity) {
		super();
		this.id = id;
		this.author = author;
		this.publisher = publisher;
		this.bookName = bookName;
		this.quantity = quantity;
	}


	@Override
	public int compareTo(Book otherBook) {
		if(id > otherBook.id) return 1;
		else if (id < otherBook.id) return -1;
		else return 0;
	}
	
	
	
	
	

}
