package String;
import java.util.Arrays;
import java.util.Scanner;
public class stringassesment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int i,j;
System.out.println("enter the string");
String str=s.nextLine();
int []freq=new int[str.length()];
 char []c=str.toCharArray();
Arrays.sort(c);
for(i=0;i<str.length();i++)
{
	freq[i]=1;
	for(j=i+1;j<str.length();j++)
	{
		if(c[i]==c[j])
		{
			freq[i]++;
			c[j]='0';
		}
	}
}
System.out.println("Characters and their corresponding frequencies");
for(i=0;i<freq.length;i++)
{
	if(c[i]!=' ' && c[i]!='0')
	{
		System.out.println(c[i]+" "+freq[i]);
	}
}
	
}
}

