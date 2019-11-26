package Series_Questions;
import java.util.Scanner;
public class series_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the number");
int n=s.nextInt();
int i,a,d,e=4;

System.out.printf("%d ",e);
for(i=2;i<=n+1;i++)
{
d=(int) Math.pow(i,2);
a=e+d;
System.out.printf("%d ",a);
e=a;
}

}
	}


