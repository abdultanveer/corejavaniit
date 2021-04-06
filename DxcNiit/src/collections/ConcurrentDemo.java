package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class ConcurrentDemo extends Thread{
	static Vector<String> arrayList = new Vector<String>();
	@Override
	public void run() {
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		arrayList.add("some");
	}
	

	public static void main(String[] args) throws InterruptedException {
		arrayList.add("A");
		arrayList.add("ccd");
		arrayList.add("bA");
		arrayList.add("cA");
		
		ConcurrentDemo concurrentDemo = new ConcurrentDemo();
		concurrentDemo.start();
		
		Iterator<String> iterator = arrayList.iterator();
		while(iterator.hasNext()) {
			String s = iterator.next();
			System.out.println(s);
			
			Thread.sleep(6000);
		}
		System.out.println(arrayList);

	}
	
	
}
