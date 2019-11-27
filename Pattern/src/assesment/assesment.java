package assesment;
import java.util.Scanner;
public class assesment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int d;
int n=s.nextInt();
int a=n*2;
int b=n*3;
int c=a+b;
System.out.println(c);
d=n+c;
if(d==0||d==9)
{
	System.out.println("Facinating number");
}
else
{
	System.out.println("Not a Facinating number");
}
	}

}
