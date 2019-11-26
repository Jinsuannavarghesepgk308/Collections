package String;
import java.util.Scanner;
public class flamescheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1,s2;
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter the first name:");
		s1 = sc.nextLine();
		System.out.printf("Enter the second name:");
		s2 = sc.nextLine();
		s1 = s1.trim();
		s2 = s2.trim();
		sc.close();
		
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		String s1_split[] = s1.split(" ");
		String s2_split[] = s2.split(" ");
		s1=" ";
		s2=" ";
		for(int i=0;i<s1_split.length;i++)
		{
		s1 = s1+s1_split[i];
		}
		for(int i=0;i<s2_split.length;i++)
		{
		s2 = s2+s2_split[i];  
		}
		int length = s1.length()+s2.length();
		
		for(int i=0;i<s1.length();i++)
		{
		for(int j=0;j<s2.length();j++)
		{
		if((s1.charAt(i) == s2.charAt(j)))
		{
		length = length-2;
		break;
		}
		}
		}
		
		int count = 6;
		int k=1,deleted_letters=0;
		int j;
		for(j=0;j<=count;j++)
		{
		if(k <= length)
		{
		if(j == count)
		{
		j=0;
		}
		
		}
		if((k-1)==length)
		{
		deleted_letters = deleted_letters+1;
		
		k = 1;
		}
		if(deleted_letters==6)
		{
		if(j==0)
		{
		System.out.println("Both are good FRIENDS");
		}
		else if(j==1)
		{
		System.out.println("Both are LOVERS");
		}
		else if(j==2)
		{
		System.out.println("Both have alot of AFFECTION");
		}
		else if(j==3)
		{
		System.out.println("Both are MARRIED");
		}
		else if(j==4)
		{
		System.out.println("Both are ENEMIES");
		}
		else if(j==5)
		{
		System.out.println("Both are SIBLINGS");
		}
		break;
		}
		}
		}
	
		}


