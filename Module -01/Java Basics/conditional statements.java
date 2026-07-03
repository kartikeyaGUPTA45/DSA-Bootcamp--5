import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the user age");
		int age = scn.nextInt();
		
		if (age > 18) {
		    System.out.println("Eligible for voting");
		} else if (age == 18) {
		    System.out.println("Apply for voter id card");
		} else {
		    System.out.println("Not Eligible for voting");
		}
	}
}
