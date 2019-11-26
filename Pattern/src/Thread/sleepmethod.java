
	package Thread;



	
class Car extends Thread {
		public void run()
		{
			for(int i=0;i<=5;i++)
			{
				if(i==1)yield();
				System.out.println("Car A running "+i);
			}
			System.out.println("Car A running Complete");
			
		}
}
class Car1 extends Thread {
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			if(i==2)stop();
			{
			System.out.println("Car B running "+i);
		}
			
		}
		System.out.println("Car A running Complete");
	}
}

class Car3 extends Thread
{
	public void run()
	{
	for(int i=0;i<=5;i++)
	{
		if(i==3)
		{
			try {
				System.out.println("Car running sleep");
				Thread.sleep(10000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	
	}
}
}
	public class sleepmethod {

public static void main(String[] args) {
	// TODO Auto-generated method stub
	Car t=new Car();
	Car1 t1=new Car1();
	Car3 t3=new Car3();
	
	t.start();
	t1.start();
	t3.start();
}
}


