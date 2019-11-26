package Series_Questions;
import java.util.Scanner;
public class Roberry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the no of houses");
int n=s.nextInt();
System.out.println("enter the money in each house");
int money[]=new int[n];
int sum=0,sum1=0;
for(int i=0;i<n;i++)
{
	money[i]=s.nextInt();
	if(i%2==0)
	{
		sum=sum+money[i];
		System.out.println(sum);
	}
	else 
	{
		sum1=sum1+money[i];
		System.out.println(sum1);
}
	}
}
}
