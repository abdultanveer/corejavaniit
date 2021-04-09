package inbuilt.functional.interfaces.predicates;

import java.util.function.Predicate;

/*
P1 : check if the no is even or not
P2 ; check if the no > 10*/

public class ChainPredicates {

	public static void main(String[] args) {
		Predicate<Integer> p1 = i -> i%2 ==0; //check for even no
		Predicate<Integer> p2 = i -> i >= 10 ;
		int[] intArray = {10,5,7,11,23,34,55};
		//int c = 20;
		System.out.println("if no >10 and if it is even then print it");

		for(int i : intArray) {

			if(p1.and(p2).test(i)) {
				System.out.println(i); //if no >10 and if it is even then print it
			}
		}
		
		
		System.out.println("if no >10 or if it is an even no then print it");

		for(int i : intArray) {

			if(p1.or(p2).test(i)) {

				System.out.println(i); //if no >10 or  if it is even then print it
			}
		}
	}

}
