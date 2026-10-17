/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
    private static void permutation(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        
       for(int i=0;i<str.length();i++) {
           char ch = str.charAt(i);
           String ros = str.substring(0,i) + str.substring(i+1);
           
           permutation(ros, ans + ch);
       }
    }
    
	public static void main(String[] args) {
		permutation("abc", "");
	}
}
