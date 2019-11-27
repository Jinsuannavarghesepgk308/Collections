package collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
public class map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
String name; 
int age,i;
int n=s.nextInt();
Map<Integer, Employ> map=new HashMap<Integer,Employ>();
Employ[] emp=new Employ[n];
for(i=0;i<n;i++)
{
	name=s.next();
	age=s.nextInt();
	emp[i]=new Employ();
	emp[i].setAge(age);
	emp[i].setName(name);
	map.put(i, emp[i]);
	
}
for(Entry<Integer, Employ> en:map.entrySet())
{
	int key=en.getKey();
	Employ e=en.getValue();
	System.out.println(key+e.getName()+e.getAge());
}
s.close();
	}

}
