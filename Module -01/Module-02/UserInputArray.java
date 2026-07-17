/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the size of an array");
		int n = scn.nextInt();
		int arr[] = new int[n];
		
		System.out.println("Enter the data for an array");
		
		for(int i=0;i<n;i++) {
		    arr[i] = scn.nextInt();
		}
		
		System.out.println("Printing the array");
		
		for(int i=0;i<n;i++) {
		    System.out.println(arr[i]);
		}
		
		
		
	}
}
