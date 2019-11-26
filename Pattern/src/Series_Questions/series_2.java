package Series_Questions;
import java.util.Scanner;
public class series_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int i,j,a;
System.out.println("enter the number");
int n=s.nextInt();

for(i=1;i<=n;i++)
{
	if(i%2==1)
	{
		a=(i*i)-1;
		System.out.print(a+",");
	}
	else
	{
		a=(i*i)-2;
		System.out.print(a+",");
	}
}
	}

}
