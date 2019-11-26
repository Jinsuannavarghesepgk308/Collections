package patternquestions;
import java.util.Scanner;
public class pattern_number16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the number");
int n=s.nextInt();
int i,j;

for(i=1;i<=n;i++)
{
	
	for(j=1;j<=i;j++)
	{
	
		System.out.print(j+" ");
		
	}
	System.out.println();
}
	}

}
