package patternquestions;
import java.util.Scanner;
public class pattern_number17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the number");
int n=s.nextInt();
int i,j;
for(i=1;i<=n;i++)
{
	for(j=1;j<=n;j++)
	{
		if(i==j ||j==n-i+1)
		{
			System.out.print("*");
		}
		else
		{
			System.out.print("0");
		}
	}
	System.out.println();
}
	}

}
