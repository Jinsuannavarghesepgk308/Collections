package Exception_handling;

public class NumberformatException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try { 
            
            int num = Integer.parseInt("adfgr"); 
  
            System.out.println(num); 
        } 
        catch (NumberFormatException e) { 
            System.out.println("Number format exception"); 
        } 
	}

}
