package String;
import java.util.Scanner;
public class string_palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int count=0;
String str=s.nextLine();
int len=str.length();
for(int i=0;i<len;i++)
{
	for(int j=i+2;j<=len;j++)
	{
		str.substring(i,j);
		count=count+len;
		
	}
}
System.out.println(count);
	}

}
