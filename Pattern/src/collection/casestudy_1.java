package collection;

import java.util.*;
public class casestudy_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
System.out.println("enter the size");
int n=s.nextInt();
int i=1;
String op;
String name,address,contact,email,prooftype,proofid;
System.out.println("Registration");
ArrayList list=new ArrayList();
Details[] emp=new Details[n];

for(i=0;i<n;i++)
{
	System.out.println("Enter your name");
	name=s.next();
	System.out.println("Enter your address");
	address=s.next();
	System.out.println("Contact number");
	contact=s.next();
	System.out.println("E-mail ID");
	email=s.next();
	System.out.println("Enter prooftype");
	prooftype=s.next();
	System.out.println("Enter proofid");
	proofid=s.next();
	emp[i]=new Details();
	System.out.println("Do you want to update the email id?(yes/no");
	String m=s.next();
	if(m.equals("yes"))
	{
		System.out.println("Enter the new email");
		String update=s.next();
		emp[i].setProoftype(prooftype);
		emp[i].setProofid(proofid);
		emp[i].setEmail(update);
		emp[i].setContact(contact);
		emp[i].setAddress(address);
		emp[i].setName(name);
	}
	else
	{
		emp[i].setProoftype(prooftype);
		emp[i].setProofid(proofid);
		emp[i].setEmail(email);
		emp[i].setContact(contact);
		emp[i].setAddress(address);
		emp[i].setName(name);
	}
		list.add(emp[i]);
}
Iterator <Details> itr=list. iterator();
int j=1;
while(itr.hasNext())
{
	Details e=itr.next();
	System.out.println("Employee details" +j);
	System.out.println("********************");
	System.out.println("Name->"+e.getName());
	System.out.println("Address->"+e.getAddress());
	System.out.println("Contact->"+e.getContact());
	System.out.println("Email->"+e.getEmail());
	System.out.println("Prooftype->"+e.getProoftype());
	System.out.println("Proofid->"+e.getProofid());
	System.out.println(" ");
	j++;
}

}
	
	
}
