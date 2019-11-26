package String;
import java.util.Scanner;
public class stringbufferandstringbuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		//StringBuffer

StringBuffer sc=new StringBuffer("hello");
sc.append("face");
System.out.println(sc);

//StringBuilder
StringBuilder a=new StringBuilder("hello");
a.append("face");
System.out.println(a);
	}

}
