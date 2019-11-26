package Thread;
import java.util.Scanner;
public class WELCOME {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		F t=new F();
		t.start();
	}
}



class F extends Thread
{
public void run()
{
	Scanner s=new Scanner(System.in);
	System.out.println("enter the string");
	String a=s.next();
	int len=a.length();
for(int i=0;i<len;i++)
{
	
		try {
			char c=a.charAt(i);
			System.out.println(c);
			Thread.sleep(1000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

}
}
