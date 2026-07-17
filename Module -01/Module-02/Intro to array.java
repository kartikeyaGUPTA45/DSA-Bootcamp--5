/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		int arr[] = new int[10];
		for(int i=0;i<arr.length;i++) {
		    System.out.println(arr[i]);
		}
		
		arr[0] = 1;
		arr[1] = 4;
		arr[2] = 12;
		arr[3] = 32;
		arr[4] = 23;
		arr[5] = 17;
		
		for(int i=0;i<arr.length;i++) {
		    System.out.println(arr[i]);
		}
	}
}
