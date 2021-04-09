package inbuilt.functional.interfaces.biparams;

import java.util.function.BiPredicate;

public class TestBiPredicate {
	
	public static void main(String[] args) {
		BiPredicate< Integer, Integer> bp = (a,b) -> (a+b) % 2 == 0;
		
		System.out.println(bp.test(10, 20));
	}

}
