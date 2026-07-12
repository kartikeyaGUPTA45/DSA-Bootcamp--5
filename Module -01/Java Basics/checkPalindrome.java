import java.util.*;

public class Main {   
    
    public static String reverseString(String str) {
        String ans = "";
        for(int i=str.length()-1;i>=0;i--) {
            ans+=str.charAt(i);
        }
        return ans;
    }
    
    public static boolean checkPalindrome(String str) {
        String reverseStr =  reverseString(str);
        
        return (reverseStr.equals(str));
    }
    
	public static void main(String[] args) {
	   System.out.println(checkPalindrome("nitia"));
	   
	}
}
