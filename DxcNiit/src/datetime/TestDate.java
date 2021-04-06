package datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.Year;

public class TestDate {
	
	public static void main(String[] args) {
		Year year = Year.of(2020);
		if(year.isLeap()) {
			System.out.println("leap year");
		}
		else {
			System.out.println("not a leap year");
		}
	}

	private static int add(int i, int j) {
		// TODO Auto-generated method stub
		return i+j;
	}

}
