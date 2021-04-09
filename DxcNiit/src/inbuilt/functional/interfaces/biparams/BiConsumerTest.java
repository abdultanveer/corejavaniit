package inbuilt.functional.interfaces.biparams;

import java.util.ArrayList;
import java.util.function.BiConsumer;

import inbuilt.functional.interfaces.functions.JavaStudent;
import inbuilt.functional.interfaces.functions.StudentTest;

public class BiConsumerTest {
	public static void main(String[] args) {
		ArrayList<JavaStudent> javaStudents = StudentTest.populateStudents();
		BiConsumer<JavaStudent, Integer> bic = (j,i) -> j.marks += 10;
		
		for(JavaStudent j : javaStudents) {
			bic.accept(j, 10);
			System.out.println(j.name+"\t"+j.marks);
		}
	}

}
