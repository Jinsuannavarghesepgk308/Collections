package Series_Questions;
import java.util.Scanner;
public class seies_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the number");
int n=s.nextInt();
int a=11,b=15;
int d=b-a;

for(int i=2;i<=n;i++)
{
	int res=(int)Math.pow(a, 2)	;
	System.out.print(res+",");
	a=a+d;
	}

}
}