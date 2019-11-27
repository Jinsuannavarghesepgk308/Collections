package collection;
import java.util.*;
public class hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet<String> set=new HashSet<String>();
set.add("Jinsu");
set.add("dona");
set.add("elizabeth");
set.add("anjali");
set.add("anna");
set.add("dona");
//Transversing elements
Iterator<String> itr=set.iterator();
while(itr.hasNext()) {
	System.out.println(itr.next());
}
	}

}
