package collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n,i;
String name,dept;
int age,salary;
System.out.println("enter the size");
n=s.nextInt();
ArrayList a=new ArrayList();
Employee[] e=new Employee[n];
for(i=0;i<n;i++)
{
	System.out.println("enter the name");
	name=s.next();
	System.out.println("enter the age");
	age=s.nextInt();
	System.out.println("enter the department");
	dept=s.next();
	System.out.println("enter the salary");
	salary=s.nextInt();
	e[i]=new Employee();
	e[i].setAge(age);
	e[i].setName(name);
	e[i].setDept(dept);
	e[i].setSalary(salary);
	a.add(e[i]);
}
Iterator<Employee> itr=a.iterator();
while(itr.hasNext());
{
	Employee em=itr.next();//create an object em
	System.out.println(em.getName()+" "+em.getAge()+" "+em.getDept()+" "+em.getSalary());//for some validation
}
	}

}
