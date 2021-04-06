package collections;

import java.util.HashMap;

//search for a record
public class HashmapEx {
	
	public static void main(String[] args) {
		HashMap<String, Integer> scoresHashMap = new HashMap<String, Integer>(); //loading factory -- initial capacity
	
		scoresHashMap.put("KING", 16);
		scoresHashMap.put("QUEEN", 13);  //hashcode of Queen is calculated = 234098 % 16 
	}

}
