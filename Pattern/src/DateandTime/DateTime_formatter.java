package DateandTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class DateTime_formatter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime dt=LocalDateTime.now();
		System.out.println("Before formatting: "+dt);
		DateTimeFormatter format=DateTimeFormatter.ofPattern("E,MM:YY:HH:mm:ss");
		String formatDate=dt.format(format);
		System.out.println("After formatting: "+formatDate);

	}

}
