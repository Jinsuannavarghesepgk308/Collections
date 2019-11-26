package regular_expression;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class casestudy_regex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
  Pattern pattern=Pattern.compile("[A-Z][a-z]*");

System.out.println("Enter your FirstName : ");
String name1=s.nextLine();
Matcher name_1=pattern.matcher(name1);


Pattern pattern2=Pattern.compile("[A-Z]+([ '-][a-zA-Z]+)*");
System.out.println("Enter your SecondName : ");
String name2=s.nextLine();
Matcher name_2=pattern.matcher(name2);


Pattern pattern3=Pattern.compile("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$");
System.out.println("Email_ID: ");
String email=s.nextLine();
Matcher email_id=pattern3.matcher(email);

Pattern pattern4=Pattern.compile("^[0-9]*$");
System.out.println("Reg_No : ");
String reg=s.nextLine();
Matcher reg_no=pattern4.matcher(reg);

Pattern pattern5=Pattern.compile("^[0-9]*$");
System.out.println("Rank : ");
String rank=s.nextLine();
Matcher rank_1=pattern4.matcher(rank);

Pattern pattern6=Pattern.compile("^[0-9]*$");
System.out.println("Year : ");
String year=s.nextLine();
Matcher year_1=pattern4.matcher(year);

Pattern pattern7=Pattern.compile("[A-Z][.][A-Za-z]*$");
System.out.println("Department : ");
String dept =s.nextLine();
Matcher dept_1=pattern7.matcher(dept);

if(name_1.matches())
{
	System.out.println("Valid First Name");
}
else
{
	System.out.println("Invalid First Name");
}
if(name_2.matches())
{
	System.out.println("Valid Last Name");
}
else
{
	System.out.println("Invalid Last Name");
}
if(email_id.matches())
{
	System.out.println("Valid Email_Id");
}
else
{
	System.out.println("Invalid Email_Id");
}
if(reg_no.matches())
{
	System.out.println("Valid Reg_No");
}
else
{
	System.out.println("Invalid Reg_No");
}
if(rank_1.matches())
{
	System.out.println("Valid Rank");
}
else
{
	System.out.println("Invalid Rank");
}
if(year_1.matches())
{
	System.out.println("Valid Year");
}
else
{
	System.out.println("Invalid Year");
}
if(dept_1.matches())
{
	System.out.println("Valid Department");
}
else
{
	System.out.println("Invalid Department");
}


if(name_1.matches()&& name_2.matches() && email_id.matches() && reg_no.matches() && rank_1.matches() && year_1.matches() && dept_1.matches() ==true)
{
	
System.out.println("Username :"+email);
Pattern pswNamePtrn = Pattern.compile("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,15})");
System.out.println("Password: ");
String password=s.nextLine();
Matcher password_1=pattern3.matcher(password);
System.out.println("LOGIN");

}
else
{
	System.out.println("Invalid Data Entered");
	}

}
}