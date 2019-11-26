package patternquestions;
import java.util.Scanner;
public class patternalphabet8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the number: ");
int n=s.nextInt();
for(int i=0;i<n;i++)
{
	for(int j=0;j<=i;j++)
	{
		System.out.printf("%c",j+65);
	}
	System.out.println();
}
	}

}
