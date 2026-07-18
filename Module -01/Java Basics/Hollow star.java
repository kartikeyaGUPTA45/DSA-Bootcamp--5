/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		int n = 7;
		int nsp1 = n/2;
		int nsp2 = -1;
		
		for(int i=1;i<=n;i++) {
		    for(int j=1;j<=nsp1;j++) {
		        System.out.print(" ");
		    }
		    
		    System.out.print("*");
		    
		    for(int j=1;j<=nsp2;j++) {
		        System.out.print(" ");
		    }
		    
		    if (nsp2>=1) {
		        System.out.print("*");
		    }
		    
		    if (i <= n/2) {
		        nsp1-=1;
		        nsp2+=2;
		    } else {
		        nsp1+=1;
		        nsp2-=2;
		    }
		    System.out.println();
		}
	}
}
