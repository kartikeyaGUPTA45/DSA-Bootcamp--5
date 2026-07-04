import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner scn = new Scanner(System.in);
		System.out.println("Enter the marks for 5 subjects");
		double m1 = scn.nextDouble();
		double m2 = scn.nextDouble();
		double m3 = scn.nextDouble();
		double m4 = scn.nextDouble();
		double m5 = scn.nextDouble();
		
		double percentage = (m1 + m2 + m3 + m4 + m5)/5.0;
		System.out.println("percentage is: " + percentage);
		
		if (percentage > 90.0) {
		    System.out.println("A");
		} else if (percentage > 80) {
		    System.out.println("B");
		} else if (percentage > 70) {
		    System.out.println("C");
		} else if (percentage > 60 ) {
		    System.out.println("D");
		} else if (percentage > 50) {
		    System.out.println("E");
		} else {
		    System.out.println("F");
		}    
		
	}
}
