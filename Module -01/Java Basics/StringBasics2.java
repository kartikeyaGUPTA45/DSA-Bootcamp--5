import java.util.*;

public class Main {   
	public static void main(String[] args) {
	   String str1 = "abcd";
	   String str2 = "abcd";
	   
	   //Scanner scn = new Scanner(System.in);
	   //String str1 = scn.nextLine();
	   //String str2 = scn.nextLine();
	   
	   if (str1 == str2) {
	       System.out.println("address is equal");
	   } else {
	       System.out.println("address is not equal");
	   }
	   
	   if (str1.equals(str2)) {
	       System.out.println("Strings are equal");
	   } else {
	       System.out.println("Strings are not equal");
	   }
	}
}
