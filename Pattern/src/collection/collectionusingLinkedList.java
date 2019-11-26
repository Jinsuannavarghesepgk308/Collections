package collection;
import java.util.LinkedList;
import java.util.Scanner;
public class collectionusingLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the size");
int n=s.nextInt();
LinkedList<String> list=new LinkedList<String>();
for(int i=0;i<n;i++)
{
	String name=s.next();
	list.add(name);
}
//String str=s.next();
System.out.println("size of list"+list.size());
System.out.println("list is"+list.isEmpty());
	}

}
