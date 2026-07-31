/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		String s = "1011011";
		int ans = 0;
		int pow = 1;
		
		for(int i=s.length()-1;i>=0;i--) {
		    int digit = s.charAt(i)-'0';
		    ans = ans + (digit*pow);
		    pow*=2;
		}
		
		System.out.println(ans);
	}
}
