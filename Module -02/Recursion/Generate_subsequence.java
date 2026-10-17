/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
    private static void gss(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        
        char ch = str.charAt(0);
        String ros = str.substring(1);
        
        gss(ros, ans + ch);
        gss(ros, ans);
    }
    
	public static void main(String[] args) {
		gss("abc", "");
		System.out.println("Done with gss");
	}
}
