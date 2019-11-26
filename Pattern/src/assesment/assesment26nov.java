package assesment;
import java.util.Scanner;
public class assesment26nov {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		  int n=s.nextInt();
		  int i,j;
		  
		  float sum=0,avg=0;
		  int arr[]=new int[n];
		  int max=arr[0];
		  int min=arr[0];
		  for(i=0;i<arr.length;i++)
		  {
			  if(arr[i]>max)
			  {
				  max=arr[i];
		  }
			  else if(arr[i]<min)
			  {
				 min=arr[i];
			  }
			  
		  
		  for(i=0;i<n;i++)
		  {
			  sum=sum+arr[i];
			  avg=sum/n;
		  }
		  System.out.println(avg);
		  }	  
	  }
	}