package method.reference;

public class PlaySum {
	public static void main(String[] args) {
		ISum iSum = MyClass::myAdd;
		iSum.sum(10,20);
	}

}
