package String;
import java.util.Arrays;
import java.util.Scanner;
public class stringlogicquestion {

	public static void main(String[] args) {
	
Scanner s=new Scanner(System.in);

String str1=s.next();
String str2=s.next();
String st=str1.concat(str2);
char tempArray[] = st.toCharArray();
        Arrays.sort(tempArray);
        System.out.println(tempArray);
        String c1=s.next();
        char m1[]=c1.toCharArray();
        Arrays.sort(m1);
        System.out.println(m1);
        
        String M=new String(tempArray);
        System.out.println("Enter the name2:");
       String  cc1=s.next();
       char m2[]=cc1.toCharArray();
        Arrays.sort(m2);
        String M2=new String(m2);
        if(M.equals(M2))
        {
        System.out.println("YES");
        }
        else
        {
        System.out.println("No");
        }
       
}
} 
