package lamdaexpressions.collections;

import java.util.Comparator;

public class MyComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		/*
		if(o1 <o2) return -1; //if we want o1 to come before o2 return -ve
		else if(o1 > o2) return 1; //if we want o2 to come after o1
		else return 0; //if both are equal
		*/
		return (o1 < o2)? -1
			: (o1 > o2)? 1 
			: 0;
		
		/*(o1,o2)->(o1 < o2)? -1
				: (o1 > o2)? 1 
				: 0;*/
	}

	

}
