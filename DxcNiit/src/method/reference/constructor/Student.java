package method.reference.constructor;

public class Student {
	String name;
	int age;
	int marks;
	int rollNo;
	
	public Student(String name, int age, int marks, int rollNo) {
		super();
		this.name = name;
		this.age = age;
		this.marks = marks;
		this.rollNo = rollNo;
		System.out.println("student object created"+this.name);
	}
	
	

}
