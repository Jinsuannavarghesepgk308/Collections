package patternquestions;
import java.util.Scanner;
public class patternalphabet10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number: ");
		int n=s.nextInt();
		
		for(int i=n;i>0;i--)
		{
			for(int j=i;j>0;j--)
			{
				System.out.printf("%c",j+64);
				
			}
			System.out.println(" ");
		}

	}

}
	

