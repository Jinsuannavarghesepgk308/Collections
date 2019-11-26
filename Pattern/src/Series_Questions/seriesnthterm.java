package Series_Questions;
import java.util.Scanner;
public class seriesnthterm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the number");
int n=s.nextInt();
int i;
int num=0;
for(i=1;i<=n;i++)
{
	if(i%2==0)
	{
		num=(n/2)-1;
		
		}
	else
	{
		num=(n-1);
	}
}
		System.out.print(num);
	}
}
	                                                    


