package patternquestions;
import java.util.Scanner;
public class pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int num=s.nextInt();
		for(int i=0;i<num;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.printf("%c", i+65);
			}
			System.out.println();
		}

	}

}
