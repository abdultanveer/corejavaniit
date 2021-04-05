package collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class BooksData {

public static  Queue<Book> getBookData() {
	
	Queue<Book> queue=new PriorityQueue<Book>();  
    //Creating Books  
    Book b1=new Book(121,"Let us C","Yashwant Kanetkar","BPB",8);  
    Book b2=new Book(233,"Operating System","Galvin","Wiley",6);  
    Book b3=new Book(101,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
    //Adding Books to the queue  
    queue.add(b1);  
    queue.add(b2);  
    queue.add(b3);  
    return queue;
}
	
}
