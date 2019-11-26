package regular_expression;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class username_password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
Pattern pswNamePtrn = Pattern.compile("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,15})");
Pattern pattern = Pattern.compile(regex);
System.out.println("enter the username");
String name=s.nextLine();
Matcher un=pattern.matcher(name);
System.out.println("enter the password");
String password=s.nextLine();
Matcher mtch=pswNamePtrn.matcher(password);//matcher is a class &password is a variable
if(un.matches())//result set
{
	System.out.println("Valid Email ID");
}
else
{
	System.out.println("Invalid Email ID");
}
if(mtch.matches())
{
	System.out.println("Valid Password");
}
else
{
	System.out.println("Invalid Password");
}
	}

}
