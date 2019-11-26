package DateandTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;
public class example_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("Today Date");
	LocalDate date=LocalDate.now();//create a date object
	System.out.println(date);//Display the current date
	
	
	System.out.println("Current time");
	LocalTime time=LocalTime.now();//create a time object
	System.out.println(time);//Display the current time
	
	System.out.println("Current Date and Time");
	LocalDateTime dt=LocalDateTime.now();//create a datetime object
	System.out.println(dt);//Display the current date and time
	

	}

}
