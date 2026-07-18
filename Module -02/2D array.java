import java.util.*;


public class Main
{
    
    public static void print(int arr[][]) {
        int n = arr.length; // no of rows
        int m = arr[0].length; // no of cols
        
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int row = scn.nextInt();
		int col = scn.nextInt();
		
		int arr[][] = new int[row][col];
		
		for(int i=0;i<row;i++) {
		    for(int j=0;j<col;j++) {
		        arr[i][j] = scn.nextInt();
		    }
		}
		
		print(arr);
	}
}



