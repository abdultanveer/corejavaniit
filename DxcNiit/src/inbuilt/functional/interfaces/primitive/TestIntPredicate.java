package inbuilt.functional.interfaces.primitive;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class TestIntPredicate {
	public static void main(String[] args) {
		Predicate<Integer> p1 = i -> i%2 ==0 ;
		IntPredicate p = i -> i % 2 == 0;
		
		System.out.println(p.test(4));
	}

}
