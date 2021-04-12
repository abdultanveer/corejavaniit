package method.reference.constructor;

public class PlayStudent {
	//IStudent is = (name,age,roll,marks) -> new Student(name,age,roll,marks);
	
	public static void main(String[] args) {
		IStudent is = Student::new;
		Student s1 = is.get("abdul", 10, 120, 130);
		
	}
	

}
