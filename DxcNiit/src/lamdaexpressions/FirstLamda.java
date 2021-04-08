package lamdaexpressions;

import java.util.function.Function;

public class FirstLamda {
	public static void main(String[] args) {
		/*
		 * int sq4 = squareIt(4); System.out.println(sq4);
		 */
		
		ISum is = ( a,  b) ->  a+b;
		System.out.println(is.add(10, 20));
		
		FuncInterface fi = ()->System.out.println("hello");
		fi.m1();
		
		/*
		 * Function<Integer,Integer> f = n -> n*n; //Function< Integer, Integer> g =
		 * (a,b) -> a+b; System.out.println(f.apply(4));
		 */
	}
	
	
	public static int squareIt(int n) {
		return n*n;
	}
	
	public static void m1() {
		System.out.println("hello");
		//	()->System.out.println(hello);
		
	}
	public static int add(int a, int b) {
		//( a,  b) ->  a+b;
		return a+b;
		
	}

}
