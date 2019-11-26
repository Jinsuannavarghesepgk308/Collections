package patternquestions;
import java.util.Scanner;
public class patternstar3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the number");
int num=s.nextInt();
for(int i=0;i<=num;i++)
{
	for(int j=num-1;j>i;j--)
	{
		System.out.print(" ");
	}
	for(int k=0;k<=i;k++)
	{
		System.out.print("*");
	}
	System.out.println();
}
	}

}
