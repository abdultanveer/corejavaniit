package lamdaexpressions.defaultstatic.inheritance;

public interface Right {
	
	public default void m1() {
		System.out.println("Right interface");
	}

}
