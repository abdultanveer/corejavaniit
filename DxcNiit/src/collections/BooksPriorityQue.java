package collections;

import java.util.Queue;

public class BooksPriorityQue {

	public static void main(String[] args) {
		Queue< Book> books = BooksData.getBookData();
		
		for(Book b: books) {
		    System.out.println(b.id+" "+b.bookName+" "+b.author+" "+b.publisher+" "+b.quantity);  

		}
	}
	
}
