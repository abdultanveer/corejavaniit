package datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.Year;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TestDate {
	
	public static void main(String[] args) {
		ZoneId zone = ZoneId.systemDefault();
		System.out.println(zone);
		
		ZoneId officZoneId = ZoneId.of("America/Los_Angeles");
		ZonedDateTime zdt = ZonedDateTime.now(officZoneId);
		System.out.println("date and time in los angeles now is"+zdt);
	}

	private static int add(int i, int j) {
		// TODO Auto-generated method stub
		return i+j;
	}

}
