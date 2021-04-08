package lamdaexpressions.collections;

import java.util.ArrayList;

public class TestEmployees {
	
	public static void main(String[] args) {
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee("abdul",1234));
		employees.add(new Employee("ansari",2345));
		employees.add(new Employee("nitigna",7890));
		employees.add(new Employee("lahari",5678));
		employees.add(new Employee("rakesh",4567));
		
		System.out.println(employees);
		//sort the employees based on their eid in ascending order

	}

}
