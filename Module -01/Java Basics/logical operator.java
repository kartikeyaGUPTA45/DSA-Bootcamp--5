import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner scn = new Scanner(System.in);
  		System.out.println("Enter the input for a, b and c");
  		int a = scn.nextInt();
  		int b = scn.nextInt();
  		int c = scn.nextInt();
  		
          
      // Maximum of 3 using logical operator
      if (a > b && a > c) {
          System.out.println("a is the largest");
      } else if (b > c) {
          System.out.println("b is the largest");
      } else {
          System.out.println("c is the largest");
      }
	}
}
