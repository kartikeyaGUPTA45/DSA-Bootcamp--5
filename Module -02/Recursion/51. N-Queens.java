class Solution {
    List<List<String>> ans;

    private List<String> prepareAns(boolean board[][], int n) {
        List<String> subAns = new ArrayList<>();
        for(int i=0;i<n;i++) {
            StringBuilder str = new StringBuilder();
            for(int j=0;j<n;j++) {
                if (board[i][j]) {
                    str.append("Q");
                } else {
                    str.append(".");
                }
            }
            subAns.add(str.toString());
        }
        return subAns;
    }

    private boolean isPosSafe(int row, int col, boolean board[][], int n) {
        // d1 direction

        for(int i=row-1,j=col-1;i>=0 && j>=0; i--,j--) {
            if (board[i][j]) {
                return false;
            }
        }

        // d2 direction 
        for(int i=row-1;i>=0;i--) {
            if (board[i][col]) {
                return false;
            }
        }

        //d3 direction 
        for(int i=row-1,j=col+1;i>=0 && j<n;j++,i--) {
            if (board[i][j]) {
                return false;
            }
        }

        return true;
    }

    private void helper(int row, int n, boolean board[][]) {
        if (row == n) {
            List<String> subAns = prepareAns(board, n);
            ans.add(subAns);
            return;
        }

        for(int col=0;col<n;col++) {
            if (isPosSafe(row, col, board, n)) {
                board[row][col] = true;
                helper(row+1, n, board);
                board[row][col] = false;
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {
        ans = new ArrayList<>();
        boolean board[][] = new boolean[n][n];
        helper(0,n,board);

        return ans;
    }
}
