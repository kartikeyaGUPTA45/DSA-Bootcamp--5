import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner scn = new Scanner(System.in);
		System.out.println("Enter the numbers");
		double nums1 = scn.nextDouble();
		double nums2 = scn.nextDouble();
		char ch = scn.next().charAt(0);
		
		switch(ch) {
		    case '+': System.out.println(nums1 + nums2); break;
		    case '-': System.out.println(nums1 - nums2); break;
		    case '*': System.out.println(nums1 * nums2); break;
		    case '/': System.out.println(nums1 / nums2); break;
		}
		
	}
}
