package collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class studentdetails_hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String name,collegename,address; 
		int phnno,mark,year;
		int i;
		int n=s.nextInt();
		Map<Integer, Student> map=new HashMap<Integer,Student>();
		Student[] std=new Student[n];
		for(i=0;i<n;i++)
		{
			name=s.next();
			phnno=s.nextInt();
			collegename=s.next();
			address=s.next();
			mark=s.nextInt();
			year=s.nextInt();
			std[i]=new Student();
			std[i].setName(name);
			std[i].setPhnno(phnno);
			std[i].setCollegename(collegename);
			std[i].setAddress(address);
			std[i].setMark(mark);
			std[i].setYear(year);
			map.put(i, std[i]);
	}

}
