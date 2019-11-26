package Series_Questions;
import java.util.Scanner;
public class slackproblem_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the number");
int n=s.nextInt();
int sum=0;
int arr[]=new int[n];
for(int i=0;i+2<n;i++)
//{
	//arr[i]=s.nextInt();
//}
//for(int i=0;i<n;i++)
{
	sum=arr[i]+arr[i+2];
}
System.out.println(sum);
	}

}
