/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		int n = 91;
// 		consider n is positive, if n is negative, then first take the 2's complement(discuss in bits manipulation)
		
		String ans = "";
		
		while(n > 0) {
		    int rem = n%2;
		    ans = rem + "" + ans;
		    n/=2;
		}
		
		System.out.println(ans);
	}
}
