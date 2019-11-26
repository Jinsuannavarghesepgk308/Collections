package collection;
import java.util.LinkedList;
import java.util.Scanner;
public class collectionlinkedlist_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the size");
int n=s.nextInt();
LinkedList<String> list=new LinkedList<String>();
for(int i=0;i<n;i++)
{
	System.out.println("enter your name");
	String name=s.next();
	list.add(name);
	System.out.println("enter your address");
	String address=s.next();
	list.add(address);
	System.out.println("enter your department");
	String department=s.next();
	list.add(department);
	System.out.println("enter your college");
	String college=s.next();
	list.add(college);
	System.out.println("enter your place");
	String place=s.next(); 
	list.add(place);
	list.addFirst("details:");//add detaails to first
	
}
//String str=s.next();
System.out.println("LinkedList "+list);
System.out.println("size of list"+list.size());
System.out.println("list is"+list.isEmpty());
	}

}

	


