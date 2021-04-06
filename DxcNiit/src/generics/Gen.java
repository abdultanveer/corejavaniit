package generics;

public class Gen<T> {
	T ob;
	
	public Gen(T ob) {
		this.ob = ob;
	}
	
	public void show() {
		System.out.println("The type of this class is"+ob.getClass().getName());
	}
	
	public T getOb() {
		return ob;
	}

}
