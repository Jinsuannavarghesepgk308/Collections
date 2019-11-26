package String;
import java.util.Scanner;
public class Insert_valuetoinsert_replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
StringBuffer a=new StringBuffer("Hello World");
a.insert(6,"Ann ");//insert at particular index
System.out.println(a);
a.append("Dona");//append to the string
System.out.println(a);
a.delete(6,10);
System.out.println(a);
a.replace(0,6,"Welcome");
System.out.println(a);
a.deleteCharAt(0);
System.out.println(a);
a.reverse();
System.out.println(a);
	}

}
   