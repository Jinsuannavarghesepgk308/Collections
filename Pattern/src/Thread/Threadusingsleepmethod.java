package Thread;
import java.util.Scanner;

	

class C extends Thread {
	public void run() {
		for(int i=1;i<5;i++) {
			try {
				System.out.println("Thread Going to sleep "+i+" time");
				Thread.sleep(10000);
				
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
			System.out.println("Thread Running "+i+" time");
			System.out.println(i);
		}
	}
}
public class Threadusingsleepmethod
{
public static void main(String[] args) {
	// TODO Auto-generated method stub
	
			C t=new C();
			t.run();
		}

}
	


