package patternquestions;
import java.util.Scanner;
public class pattern_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		int i,j,k,l;
		char a='c',b='s',c='k';
		for(i=0;i<=n;i++)
		{
			for(j=0;j<=n-1;j++)
			{
				if(i==0)
				{
				System.out.print(a);
			} 
				else if (i==n)
				{
					System.out.print(c);
				}
				else if(i==j ||i+j==n ||i+j==n-2 ||i+j==n+1 ||i+j==n+2)
					
				{
					System.out.print(b);
				}
				else
				{
					System.out.print("*");
				}
			}
			}
				System.out.println();
		}
		}
	
	
	
	

