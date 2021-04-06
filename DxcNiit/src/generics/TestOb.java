package generics;

public class TestOb {
	
	public static void main(String[] args) {
		Gen<String> g1 = new Gen<String>("abdul");
		g1.show();
		System.out.println(g1.getOb());
		
		Gen<Integer> g2 = new Gen<Integer>(new Integer(10));
		g2.show();
		System.out.println(g2.getOb());
		
		
	}

}
