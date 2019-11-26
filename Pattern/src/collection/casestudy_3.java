package collection;
import java.util.*;
public class casestudy_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
ArrayList list=new ArrayList();
int i;
    do {
    System.out.println("1)Display installed applications\n2)Install an application\n3)Uninstall an application\n4)Quit");
    
   int n=s.nextInt();
    switch(n)
   {
   case 1:
    Iterator ite=list.iterator();
   if(list.isEmpty()) {
  System.out.println("No application installed");
  }
  else
  {
  int j=0;
  while(ite.hasNext()) {
  System.out.println(j+ " "+ite.next());
  j++;
 }
 }
 
  break;
  case 2:
  System.out.println("Enter the application");
  String app=s.next();
  list.add(app);
  break;
  case 3:
 
  Iterator itr=list.iterator();
  for(i=0;i<list.size();i++) {
  System.out.println(i+" "+itr.next());
  }
  if(list.isEmpty())
  {
	  System.out.println("No application is installed");
  }
  else
  {
	 System.out.println("Enter the index of application to be removed");
  }
  
  int index=s.nextInt();
  list.remove(index);
  break;
  case 4:
  System.out.println("Successfully exited");
  break;
  
  default:
	  System.out.println("invalid input");
  }
  }
  while(true);

  }
  }


