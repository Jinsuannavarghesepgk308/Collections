package collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class example_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the size");
int n=s.nextInt();
ArrayList list=new ArrayList();//Arraylist Class Declaration
for(int i=0;i<n;i++)
{
	System.out.println("enter the name");
	String name=s.next();
	System.out.println("enter the age");
	int age=s.nextInt();
	list.add(name);//add method
	list.add(age);
}
Iterator itr=list.iterator();//It is used to transverse a elements one by one
while(itr.hasNext())//boolean hasNext():Returns true if the iteration has more elements
{
	System.out.println(itr.next()); //Returns the next element in the  iteration
}
	}

}
