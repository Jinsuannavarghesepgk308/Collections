package Series_Questions;
import java.util.Scanner;
public class series_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the number");
int n=s.nextInt();
int a=1,b=2,c,d,e;
System.out.print(a);
System.out.print(b);
for(int i=0;i<n-2;i++)
{
	if(i%2!=0)
	{
		c=b*3;
		System.out.print(a+" ");
		d=b;
	}
	else
	{
		e=a*3;
		System.out.print(e+" ");
	}
		
	}
}

	}

