package lamdaexpressions.defaultstatic;

public interface SomeInterface {
	public void method1();
	public void method2();
	
	default public void method3() { 
		//method which i have added recently in this interface 
		// i need not implement this method in all the implementation classes
		System.out.println("default method of some interface");
	}

}
