
package DateandTime;
import java.util.Calendar;

public class calenderdate {

	private static final String Calender = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Calendar c=Calendar.getInstance() ;
	System.out.println("At present calender's year: "+c.get(Calendar.YEAR));
	System.out.println("At present Calender's Day: "+c.get(Calendar.DATE));
	System.out.println("The current date is : "+c.getTime());
c.add(Calendar .DATE, -7);
System.out.println("7 days ago: "+c.getTime());
c.add(Calendar.MONTH,10);
System.out.println("10 months later: "+c.getTime());
c.add(Calendar.YEAR,10);
System.out.println("10 years later: "+c.getTime());
	
	}

}
