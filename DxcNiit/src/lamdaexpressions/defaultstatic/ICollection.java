package lamdaexpressions.defaultstatic;

public interface ICollection {

	void add();
	void remove();
	default void append() { System.out.println("default append");}
	default void removeAll() {System.out.println("default removeall");}
	
}
