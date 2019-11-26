package String;
import java.util.Scanner;
public class string_program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
String a=new String("Java is");
String b=new String("a programming");
String c=new String(" language");
//length
int len=a.length(); //find the length of string1
System.out.println(len); //print the length of string1

//character
char ch1=b.charAt(5);//find the character from the given index value of string2
System.out.println(ch1);//print the character from string2
//substring 
String st=a.substring(1,5);//find the substring from string1
System.out.println("substring :"+st);//print the character from the string1




//Index
int in=a.indexOf("is");//find the index value
System.out.println("index: "+in);//print the index value

//Concat method
String sr=a.concat(b);//add two strings
System.out.println("concat : "+sr);//print the combined string

//replace
String re=b.replace("p","P");// To replace the lowerCase to upperCase
System.out.println("replace: "+re);//print the replaced string

//split
String splitarr[]=a.split(" ");//To split a string
System.out.println("Split");//print the split words
for(int i=0;i<splitarr.length;i++)//Give iteration for take each character
{
	System.out.println(splitarr[i]);//print the split words
}

//Equals


String str3="abcd";//give a string 
boolean eq=b.equals(str3);//compare the string string2
System.out.println("String equal or not: "+eq);//print the string is true or false

//startwith
boolean be=b.startsWith("a");//check the given string is start with a or not
System.out.println("String startswith a or not: "+be);//print the string is true or false

	}

}
