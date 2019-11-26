package DateandTime;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
public class casestudy_booking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter the name");
String name=s.nextLine();
System.out.println("Enter the address");
String address=s.nextLine();
System.out.println("Number of room");
int room=s.nextInt();
System.out.println("Number of persons");
int persons=s.nextInt();
System.out.println("AC OR Non-AC");
String ac=s.next();
System.out.println("Booking Date");
String booking=s.next();
System.out.println("Checkout Date");
String checkout=s.next();
LocalDate ds=LocalDate.parse(booking);
LocalDate de=LocalDate.parse(checkout);
long total=ChronoUnit.DAYS.between(ds, de);
long total=0;int p=(person%2);
System.out.println("Reg-Details: ");
System.out.println("Name        : "+name);
System.out.println("Address     : "+address);
System.out.println("No.of rooms : "+room);
System.out.println("No.of.Guest : "+persons);
int ac_amount=0,flag=0;
if(ac.equals("AC"))
{
	ac_amount=100;
	flag=1;
}
	
else
{
	ac_amount=0;
	flag=0;
}
if(flag==1)
	System.out.println("AC :Yes");
else
	System.out.println("AC :No");



int rent=500,flag1=0;;

if(persons==(room*2)+1)
{
	
	int amount=(int)((500+ac_amount)*(persons*total))+250;
	System.out.print("Amount :"+amount);
}
	
else
{
	int amount=(int)((500+ac_amount)*(persons*total));
	System.out.print("Amount :"+amount);
	
	}

}
}


