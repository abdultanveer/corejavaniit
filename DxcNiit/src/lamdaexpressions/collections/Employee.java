package lamdaexpressions.collections;

public class Employee {
	
	String name;
	int eid;
	
	public Employee(String string, int i) {
		name = string;
		eid = i;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return eid +"-"+name;
				//super.toString();
	}
	

}
