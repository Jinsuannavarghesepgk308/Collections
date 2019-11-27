package collection;
import java.util.ArrayList;
import java.util.Scanner;



import java.util.Iterator;
public class deleteusingclearmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);


ArrayList<String> list=new ArrayList();


  list.add("First");
  list.add("Second");
  list.add("Third");
  list.add("Random");
  System.out.println("Actual ArrayList: ");
  Iterator itr=list.iterator();
  while(itr.hasNext())
  {
    System.out.println(itr.next()+" ");
  }
 
  list.clear();
  System.out.println("After clear ArrayList:[] ");
  Iterator itr1=list.iterator();
while(itr1.hasNext())
{
  System.out.println(itr1.next());
}

}
}


	


