package streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class PlayMap {
	public static void main(String[] args) {
		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(10);
		marks.add(15);
		marks.add(16);
		marks.add(12);
		marks.add(19);
		marks.add(13);
		System.out.println(marks);
		List<Integer> updatedMarks = marks.stream().map(i -> i+5).collect(Collectors.toList());
		System.out.println(updatedMarks);
		List<Integer> evenNumbers = marks.stream().filter(i -> i%2 ==0).collect(Collectors.toList());
		System.out.println(evenNumbers);
		Long noStudentsMarksLessFifteen  = marks.stream().filter(i -> i<15).count();
		System.out.println(noStudentsMarksLessFifteen+" of them have scored less than fifteen");
		//marks.stream().map(i -> i+5).filter(i -> i%2 == 0).collect(Collectors.toList());
	}

}
