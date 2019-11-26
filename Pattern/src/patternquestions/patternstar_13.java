package patternquestions;
import java.util.Scanner;
public class patternstar_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the number");
int n=s.nextInt();
for(int i=0;i<n;i++)
{
	
	for(int j=0;j<n;j++)
	{
		if(i==1||i==n-1||j==1||j==n-1)
		{
		System.out.print("*");
		i++;
	}
		else
			System.out.println(" ");
	}
	System.out.println();
}
	}

}
