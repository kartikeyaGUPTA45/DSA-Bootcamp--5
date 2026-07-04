import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner scn = new Scanner(System.in);
		System.out.println("Enter the input for a, b and c");
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		 
		// Logic for even/ odd
// 		if (a%2 == 0) {
// 		    System.out.println("a is even");
// 		} else {
// 		    System.out.println("a is odd");
// 		}

        // // Check last digit
        // if (a%10 == 0) {
        //     System.out.println("Zero");
        // } else {
        //     System.out.println("Not zero");
        // }
        
        // Maximum of 3 using nested conditional statement
        if (a > b) {
            if (a > c) {
                System.out.println("a is the largest");
            } else {
                System.out.println("c is the largest");
            }
        } else if (b > c) {
            System.out.println("b is the largest"); 
        } else {
            System.out.println("c is the largest");
        }
        
        
        
        
		
	}
}
