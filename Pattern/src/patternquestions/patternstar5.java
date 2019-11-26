package patternquestions;
import java.util.Scanner;
public class patternstar5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the number");
int n=s.nextInt();
for(int i=1;i<=n;i++)
{
	for(int j=n;j>=i;j--)
	{
		System.out.print(" ");
	}
	for(int k=1;k<i*2;k++)
	{
		System.out.print("*");
	}
	
	
	System.out.println();
}
	}

}
