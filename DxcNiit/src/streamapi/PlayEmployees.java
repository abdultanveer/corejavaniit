package streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PlayEmployees {

	public static void main(String[] args) {
		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee("nitigna",1234));
		empList.add(new Employee("sriniva",3456));
		empList.add(new Employee("lahari",4332));
		empList.add(new Employee("bapji",4567));
		empList.add(new Employee("chandra",7890));
		empList.add(new Employee("gayathri",4599));
		System.out.println(empList);
		List<Employee>	sortedList = empList.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);


	}

}
