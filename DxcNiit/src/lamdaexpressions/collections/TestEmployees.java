package lamdaexpressions.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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
		Comparator<Employee> c = (e1,e2) -> (e1.eid < e2.eid)? -1 :(e1.eid > e2.eid)? 1 :0;
		Comparator<Employee> n = (e1,e2) -> e1.name.compareTo(e2.name);

		Collections.sort(employees,n);
		
		//sort employees alphabetical order of their names..
				//new EmployeeComparator());
		System.out.println(employees);

	}

}
