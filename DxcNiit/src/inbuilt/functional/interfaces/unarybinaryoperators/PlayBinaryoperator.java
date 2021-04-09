package inbuilt.functional.interfaces.unarybinaryoperators;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class PlayBinaryoperator {
	
	public static void main(String[] args) {
		BiFunction<String, String, String> bif = (s1,s2) -> s1+s2;
		System.out.println(bif.apply("hello ", " welcome"));
		BinaryOperator<String> bo = (s1,s2) -> s1+s2;
		System.out.println(bo.apply("hello ", " world"));
	}

}
