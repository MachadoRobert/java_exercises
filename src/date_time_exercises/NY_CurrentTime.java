package date_time_exercises;

//Write a Java program to get the current time in New York.
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class NY_CurrentTime {
	
	private ZoneId zoneId = ZoneId.of("America/New_York");
	private DateTimeFormatter dtFormated = DateTimeFormatter.ofPattern("dd/MM/yy HH:mm:ss");
	private ZonedDateTime nyCurrentDT = ZonedDateTime.now(zoneId);
	
	public NY_CurrentTime() {
		
	}
	
	public void ny_CurrentTime() {
		System.out.println("The ny current data time is: " + nyCurrentDT.format(dtFormated));
	}
	
}
