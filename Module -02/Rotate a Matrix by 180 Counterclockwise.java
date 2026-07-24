// Problem Link: https://www.geeksforgeeks.org/problems/c-matrix-rotation-by-180-degree0745/1

//Solution:

class Solution {
    
    private void rowReverse(int [][] matrix, int n, int m) {
        int rmin = 0, rmax = n-1;
        int cmin = 0, cmax = m-1;
        while(cmin <= cmax) {
            rmin = 0;
            rmax = n-1;
            
            while(rmin < rmax) {
                int temp = matrix[rmin][cmin];
                matrix[rmin][cmin] = matrix[rmax][cmin];
                matrix[rmax][cmin] = temp;
                rmin++;
                rmax--;
            }
            cmin++;
        }
    }
    
    private void colReverse(int [][] matrix, int n, int m) {
        int rmin = 0;
        int rmax = n-1;
        int cmin = 0;
        int cmax = m-1;
        
        while(rmin <= rmax) {
            cmin = 0;
            cmax = m-1;
            while(cmin < cmax) {
                int temp = matrix[rmin][cmin];
                matrix[rmin][cmin] = matrix[rmin][cmax];
                matrix[rmin][cmax] = temp;
                cmin++;
                cmax--;
            }
            rmin++;
        }
    }
    
    public void rotateMatrix(int[][] matrix) {
        // code here
        int n = matrix.length;
        int m = matrix[0].length;
        rowReverse(matrix, n, m);
        colReverse(matrix, n, m);
    }
}
