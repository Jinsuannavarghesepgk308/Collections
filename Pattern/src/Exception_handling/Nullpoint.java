package Exception_handling;
import java.util.Scanner;
public class Nullpoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		String  p = null;
		 int len=p.length();
         System.out.println(len);
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}

	}

}
