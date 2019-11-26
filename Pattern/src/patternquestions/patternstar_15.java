package patternquestions;
import java.util.Scanner;
public class patternstar_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the number");
int n=s.nextInt();
int i,j;
for(i=1;i<=n;i++)
{
	int count=0;
	for(j=1;j<=i*2;j++)
	{
		System.out.print("*");
		count++;
	
		if(count==i)
		{
			System.out.print(" ");
		}
	}
		System.out.println();
}
	}

	}

