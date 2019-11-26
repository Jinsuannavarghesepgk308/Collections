package patternquestions;
import java.util.Scanner;
public class pattern_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the number");
int n=s.nextInt();
int i,j,k,l;
char a='c',b='s',c='k';
for(i=0;i<n;i++)
{
	for(j=0;j<=i;j++)
	{
		System.out.print(a);
	}
	for(k=0;k<=i;k++)
	{
		System.out.print(b);
	}
	for(l=0;l<=i;l++)
	{
		System.out.print(c);
	}

System.out.println();
	}
	}
}
