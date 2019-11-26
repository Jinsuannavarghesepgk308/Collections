package String;
import java.util.Scanner;
public class Stringconcatenate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);


System.out.println("enter the string1");
String str=s.nextLine();
System.out.println("enter the string2");
String str1=s.nextLine();
System.out.println("enter the string3");
String str2=s.nextLine();
int len1=str.length();
int len2=str1.length();
int len3=str2.length();

String str4;
	str4 = str.replaceAll("[AaEeIiOoUu]", "\\$");
		
		String result = str1.replaceAll("[^(AEIOUaeiou)+]","#"); 
		
		String st=str2.toUpperCase();
		
		String stu=str4.concat(result);
		String r=stu.concat(st);
		System.out.println(r);
					}
			
	}


	


