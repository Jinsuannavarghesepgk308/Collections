package Exception_handling;
import java.util.Scanner;
public class ArrayOutOfBounds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		try {
			int a[]=new int[4];
		a[4]=20/0;

		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e+"Check the index");

			}
	}

}
