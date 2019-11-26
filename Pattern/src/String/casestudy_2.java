package String;
import java.util.Scanner;
public class casestudy_2 {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
StringBuffer car=new StringBuffer();
StringBuffer bike=new StringBuffer();
System.out.println("Enter your choice");
System.out.println("1)Car \n 2)Bike\n");
int n=s.nextInt();
switch(n) {
case 1:
	System.out.println("Enter the details of Car");
	System.out.println("Enter the choice");
	car.append("Choice : "+s.next()+"\n");
	System.out.println("Enter the maximum speed");
	car.append("Speed : "+s.next()+"\n");
	System.out.println("Enter the number of seats");
	car.append("Seats : "+s.next()+"\n");
	System.out.println("Enter the number of wheels");
	car.append("Wheels : "+s.next()+"\n");
	System.out.println("Enter the number of doors");
	car.append("Doors : "+s.next()+"\n");
	System.out.println("Enter the status of AC(true/false");
	car.append("AC : "+s.next()+"\n");
	System.out.println("Car details");
	System.out.println(car);
	break;
	
case 2:
	System.out.println("Enter the details of Bike");
	System.out.println("Enter the color");
	bike.append("Color :"+s.next()+"\n");
	System.out.println("Enter the maximum speed");
	bike.append("Speed : "+s.next()+"\n");
	System.out.println("Enter the number of seats");
	bike.append("Seats : "+s.next()+"\n");
	System.out.println("Enter the number of wheels");
	bike.append("Wheels : "+s.next()+"\n");
	System.out.println("Enter the number of doors");
	bike.append("Doors : "+s.next()+"\n");
	System.out.println("Enter the status of diskbreak(true/false");
	bike.append("Diskbreak : "+s.next()+"\n");
	System.out.println("Bike details");
	System.out.println(bike);
	
	break;
	
	default:
		System.out.println("Invalid option");
}


	}

}
