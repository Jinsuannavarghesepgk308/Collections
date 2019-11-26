package patternquestions;
import java.util.Scanner;
public class patternnumber_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the number");
int n=s.nextInt();
for(int i=1;i<=n;i++)
{
	for(int j=1;j<=n;j++)
	{
	if(i==j)
	{
		System.out.print("0");
	}
	else
	{
		System.out.print(i);
	}
	}
	System.out.println();
	
		
	}
}
	}


