package patternquestions;
import java.util.Scanner;
public class patternalphabet9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the number: ");
int n=s.nextInt();
int i,k=0;
while(k<=n*2)
{
for(i=0;i<n;i++)
{
	for(int j=0;j<=i;j++)
	{
		System.out.printf("%c",k+65);
		k++;
	}
	System.out.println();
}
	}

}
}
