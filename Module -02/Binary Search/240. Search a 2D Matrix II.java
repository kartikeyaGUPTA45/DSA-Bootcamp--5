class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int row = 0, col = n-1;

        while(row < m && col >= 0) {
            int ele = matrix[row][col];

            if (ele == target) {
                return true;
            } else if (ele > target) {
                col = col-1;
            } else {
                row = row+1;
            }
        }

        return false;
    }
}
