class Solution {

    private double helper(double x, long n) {
        if (n == 0) {
            return 1.0;
        }

        double subAns = helper(x, n/2);

        double ans = subAns*subAns;
        if ((n&1L) == 1) {
            ans*=x;
        }

        return ans;
    }

    public double myPow(double x, int n) {
        long N = n;
        if (n < 0) {
            N*=-1;
            return 1/helper(x, N);
            
        }

        return helper(x, N);
    }
}
