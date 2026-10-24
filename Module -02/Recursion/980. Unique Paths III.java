class Solution {

    private int helper(int row, int col, int re, int ce, int m, int n, int grid[][], int cnt) {
        if (row < 0 || col < 0 || row >= m || col >= n || grid[row][col] == -1) {
            return 0;
        }

        if (row == re && col == ce) {
            if (cnt == 0) {
                return 1;
            } 
            return 0;
        }

        int ans = 0;
        grid[row][col] = -1;
        ans += helper(row-1,col, re, ce, m,n,grid, cnt-1); // up
        ans += helper(row,col-1, re, ce, m,n,grid, cnt-1); // left
        ans += helper(row+1,col, re, ce, m,n,grid, cnt-1); // down
        ans += helper(row,col+1, re, ce, m,n,grid, cnt-1); // right
        grid[row][col] = 0;

        return ans;
        
    }

    public int uniquePathsIII(int[][] grid) {
        int rs = -1, cs = -1, re = -1, ce = -1;
        int cnt = 0;
        int m = grid.length;
        int n = grid[0].length;

        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                if (grid[i][j] == 1) {
                    rs = i;
                    cs = j;
                    cnt+=1;
                } else if (grid[i][j] == 2) {
                    re = i;
                    ce = j;
                } else if (grid[i][j] == 0) {
                    cnt+=1;
                }
            }
        }

        return helper(rs, cs, re, ce, m, n, grid, cnt);

    }
}
