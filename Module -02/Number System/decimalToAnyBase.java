import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner scn = new Scanner(System.in);
	    System.out.println("Enter the number in decimal: ");
	    int n = scn.nextInt();
	    System.out.println("Enter the base value: ");
	    int b = scn.nextInt();
	    
	    String ans = "";
	    while(n > 0) {
	        int rem = n%b;
	        if (rem >= 10) {
	            ans = (char)(rem-10+'A') + ans;
	        } else {
	            ans  = rem + "" + ans;
	        }
	        n/=b;
	    }
	    
	    System.out.println("Answer is: " + ans);
	   
	}
}
