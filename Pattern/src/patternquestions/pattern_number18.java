package patternquestions;
import java.util.Scanner;
public class pattern_number18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the number");
int n=s.nextInt();
int i,j,k;
for(i=1;i<=n;i++)
{
	for(k=n;k>i;k--)
	{
		System.out.print(" ");
	}
	for(j=i;j>=1;j--)
	{
		System.out.printf(j+" ");
	}
	System.out.println();
	}

	}
}
