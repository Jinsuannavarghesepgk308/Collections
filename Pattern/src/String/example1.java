package String;
import java.util.Scanner;
public class example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the string");
String str=s.nextLine();
String[] words=str.split(" ");
for(int i=0;i<words.length;i++) {
	if(i%2!=0)
	{
		int len=words[i].length();
		for(int j=len-1;j>=0;j--)
		{
			System.out.print(words[i].charAt(j));
		}
		System.out.print(" ");
	}
	else
	{
		System.out.print(words[i]+" ");
	}
}
}
}