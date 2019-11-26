package String;
import java.util.Scanner;
public class casestudy_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);

System.out.println("Registration");
StringBuffer s=new StringBuffer();
StringBuffer r=new StringBuffer();
System.out.println("Enter your name");
s.append(sc.next()+"\n");
System.out.println("Enter your address");
s.append(sc.next()+"\n");
System.out.println("Enter your address");
s.append(sc.next()+"\n");
System.out.println("Enter contact number");
s.append(sc.next()+"\n");
System.out.println("Enter Email ID");
s.append(sc.next()+"\n");
System.out.println("Proof type");
s.append(sc.next()+"\n");
System.out.println("Enter Proof ID");
s.append(sc.next()+"\n");
System.out.println(s);
System.out.println("Thank you.Your registration id is 1...");
}

}
