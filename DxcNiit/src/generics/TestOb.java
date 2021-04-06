package generics;

import java.util.ArrayList;
import java.util.List;

public class TestOb {
	
	public static void main(String[] args) {
		Gen<String> g1 = new Gen<String>("abdul");
		g1.show();
		System.out.println(g1.getOb());
		
		Gen<Integer> g2 = new Gen<Integer>(new Integer(10));
		
		Gen<?> g3 = new Gen<Integer>(new Integer(30));
		Gen<? super String> g4 = new Gen<Object>("");
		
		Gen<? extends Number> g5 = new Gen<Integer>(new Integer(3));
		//List<Number> intList = new ArrayList<Integer>();
		//List<Object> numList = new ArrayList<Integer>();
		
		/*
		 * List<?> wildCardList = new ArrayList<Integer>(); wildCardList.add(new
		 * Integer(10)); System.out.println(wildCardList);
		 */
		g2.show();
		System.out.println(g2.getOb());
		
		//Test<Integer> myTest = new Test<Integer>(10,20);
		Test<MyNumber> myTest = new Test<MyNumber>(new MyNumber(), new MyNumber());
		
	}

}
