package collections;
public class TestGarbage1{ 
	
	/**
	 * this method will add 2 nos and return sum of it
	 * @param a first no
	 * @param b second no
	 * @return sum
	 */
	static int add(int a, int b) {
		return a+b;
	}
	
	public void finalize(){
		System.out.println("object is garbage collected");
	}  
	public static void main(String args[]){  
		TestGarbage1 s1=new TestGarbage1();  
		TestGarbage1 s2=new TestGarbage1();  
		s1=null;  
		s2=null; 
		int c = add(10,20);
		System.gc();  
	}  
}