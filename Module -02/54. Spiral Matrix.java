class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int n = matrix.length;
        int m = matrix[0].length;

        int cnt = n*m;

        int rmin = 0,rmax = n-1;
        int cmin = 0,cmax = m-1;

        while(cnt > 0) {
            for(int col = cmin;col<=cmax && cnt>0;col++) {
                ans.add(matrix[rmin][col]);
                cnt--;
            }

            rmin++;

            for(int row = rmin;row<=rmax && cnt>0;row++) {
                ans.add(matrix[row][cmax]);
                cnt--;
            }

            cmax--;

            for(int col = cmax;col>=cmin && cnt>0;col--) {
                ans.add(matrix[rmax][col]);
                cnt--;
            }

            rmax--;

            for(int row=rmax;row>=rmin && cnt>0;row--) {
                ans.add(matrix[row][cmin]);
                cnt--;
            }

            cmin++;
        }

        return ans;

    }
}
