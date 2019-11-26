package String;
import java.util.Scanner;
public class example2 {

	private static final CharSequence UpperCase = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string");
		String str=s.nextLine();
		int vowels=0,consonants=0,space=0,uppercase=0,lowercase=0,number=0,special=0;
for(int i=0;i<str.length();i++)
{
		char ch=str.charAt(i);
		if(ch=='a' ||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
		{
			vowels++;
		}
		else if(ch>='a' && ch<='z')
		{
			lowercase++;
		}
		else if(ch>='0' &&ch<='9')
		{
			number++;
		}
		else if(ch==' ')
		{
			space++;
		}
		else if(ch>='A' && ch<='Z')
		{
			uppercase++;
		}
		else if(ch>='a' && ch<='z')
		{
		consonants=str.length()-vowels;
			consonants++;
		}
		else 
		{
			special++;
		}
	}
System.out.println("enter the number of vowels: "+vowels);
System.out.println("enter the number of consonants: "+consonants);
System.out.println("enter the number of number: "+number);
System.out.println("enter the number of space: "+space);
System.out.println("enter the number of uppercase: "+uppercase);
System.out.println("enter the number of lowercase: "+lowercase);
System.out.println("enter the number of special: "+special);
	}
}
