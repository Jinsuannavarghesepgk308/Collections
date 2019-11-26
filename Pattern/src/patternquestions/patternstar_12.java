package patternquestions;
import java.util.Scanner;
public class patternstar_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the number");
int n=s.nextInt();
int i,j,k;
for(i=1;i<=n;i++)
{
	for(j=n;j>i;j--)
	{
		System.out.print(" ");
	}
	for(k=1;k<=(i*2)-1;k++)
	
	{
		System.out.print("*");
	}
	System.out.println();
}
	for(i=n-1;i>=1;i--)
	{
		for(j=n-1;j>=i;j--)
		{
			System.out.print(" ");
		}
		for(k=1;k<=(i*2)-1;k++)
		
		{
			System.out.print("*");
		}
	System.out.println();
}

	}
	}

