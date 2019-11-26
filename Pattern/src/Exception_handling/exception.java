package Exception_handling;
import java.util.Scanner;
public class exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
try {
	int a[]= {1,2,3,4};
	System.out.println(a[10]);
}
catch(Exception e)
{
	System.out.println(e);
}
	}

}
