class Solution {

    private int helper(int row, int col, int m, int n) {

        if (row >= m || col >= n) {
            return 0;
        }

        if (row == m-1 && col == n-1) {
            return 1;
        }

        int rPaths = helper(row, col+1, m, n);
        int dPaths = helper(row+1, col, m, n);
        int ans = rPaths + dPaths;
        return ans;
    }

    public int uniquePaths(int m, int n) {
        return helper(0,0,m,n);
    }
}
