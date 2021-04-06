package datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class TestDate {
	
	public static void main(String[] args) {
		LocalDate localDate = LocalDate.now();
		int day = localDate.getDayOfMonth();
		
		LocalDateTime localDateTime = LocalDateTime.now();
		
		LocalTime lTime = LocalTime.now();
		
		System.out.println(lTime.plusMinutes(39));
	}

}
