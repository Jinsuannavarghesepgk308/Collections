package assesment;
import java.util.Scanner;
public class Assesment_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);

int n=s.nextInt();

int sum=0;
int diff=0;
int arr[]=new int[n];


int i;
for(i=0;i<n;i++)
{
	arr[i]=s.nextInt();
}
for(i=0;i<n;i++)
{
	sum=sum+arr[i];
}
int max=arr[0];
for(i=0;i<n;i++)
{
	if(arr[i]>max)
	{
		max=arr[i];
}
	}
System.out.println("Sum: "+sum);
System.out.println("Largest element" +max);
int min=arr[0];
for(i=0;i<n;i++) {
	if(arr[i]<min)
	{
		min=arr[i];
	}
}
int d=0;
d=max-min;

System.out.println("Smallest element: "+min);
System.out.println("Difference of l and s :"+d);
}
	}


