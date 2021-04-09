package inbuilt.functional.interfaces;

import java.util.ArrayList;
import java.util.function.Predicate;

public class TestPredicate {
	
	static public ArrayList<Employee> employees;
	public static void main(String[] args) {
		Predicate<Integer> p = i -> i % 2 == 0;
		System.out.println(p.test(10));
		populateEmployees();
		//print the employees whose salary >= 10000
		Predicate<Employee> p1 = (e) -> e.salary >= 10000;
		
		for(Employee e : employees) {
			if(p1.test(e)) {
				System.out.println(e.name);
			}
		}
	}

	private static void populateEmployees() {
		employees = new ArrayList<Employee>();
		employees.add(new Employee("name", 5000));
		employees.add(new Employee("abdul", 15000));
		employees.add(new Employee("ansari", 55000));
		employees.add(new Employee("tanveer", 6000));
		employees.add(new Employee("nitigna", 25000));

	}

}
