package collection;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
public class collectionlinkedlist_casestudy2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		int count=0,num;
		String symbol;
		Set<NewCard> sc=new TreeSet<NewCard>(new Symbol());
		
		NewCard[] c=new NewCard[40];
		
System.out.println("enter the size");
int n=s.nextInt();
while(sc.size()<n)
{
   symbol=s.next();
	 num =s.nextInt();
	c[count]=new NewCard();
	c[count].setSymbol(symbol);
	c[count].setNum(num);
	sc.add(c[count]);
	count++;
}
System.out.println(n+"symbols gathered in "+count+"cards.");
System.out.println("Cards are ");
Iterator<NewCard> itr=sc.iterator();
while(itr.hasNext())
{
	NewCard ca=(NewCard)itr.next();
	System.out.println(ca.getSymbol()+" "+ca.getNum());
}
	}

}
