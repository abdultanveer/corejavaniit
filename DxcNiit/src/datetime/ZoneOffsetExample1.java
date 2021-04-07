package datetime;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.Temporal;
import java.util.Formatter;  
public class ZoneOffsetExample1 {  
  public static void main(String[] args) {  
    ZoneOffset zone = ZoneOffset.UTC;  
    Temporal temp = zone.adjustInto(ZonedDateTime.now());  
    //System.out.println(temp);  
    LocalDate ldt = LocalDate.parse("2020-04-06");
    ldt.format(DateTimeFormatter.ISO_LOCAL_DATE);
    System.out.println(ldt.format(DateTimeFormatter.ISO_LOCAL_DATE));
  }  
}  