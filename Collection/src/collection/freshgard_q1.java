package collection;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;
public class freshgard_q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
	   
	    ArrayList<String> list=new ArrayList();
	    
	    
	      list.add("First");
	      list.add("Second");
	      list.add("Third");
	      list.add("Random");
	      ArrayList<String> list1=new ArrayList();
	      list.add("one");
	      list.add("two");
	      list.addAll(list1);
	    java.util.Iterator<String> itr1=list.iterator();
	    while(itr1.hasNext())
	    {
	      System.out.println(itr1.next());
	    }
	  }
	}
	


