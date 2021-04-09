package lamdaexpressions.defaultstatic;

public class MyList implements ICollection {

	@Override
	public void add() {
		System.out.println("adding to list");
	}

	@Override
	public void remove() {
		System.out.println("removing from list");
		
	}

}
