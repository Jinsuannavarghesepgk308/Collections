package patternquestions;
import java.util.Scanner;
public class starpattern_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String st=sc.next();
int len=st.length();
char []c=st.toCharArray();
for(int i=0;i<=len-1;i++)
{
	for(int j=0;j<=i;j++)
	{
		System.out.print(c[j]+" ");
	}
	System.out.println();
}
	}

}
