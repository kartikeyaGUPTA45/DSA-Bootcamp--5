class Solution {

    private long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }

        return gcd(b,a%b);
    }

    public int nthMagicalNumber(int n, int a, int b) {
        long A = a, B = b, N = n;
        long GCD = gcd(A,B);
        long lcm = (A*B)/GCD;

        long low = Math.min(A,B);
        long high = N*Math.min(A,B);
        long ans = -1;
        int mod = 1000000007;

        while(low <= high) {
            long mid = low + (high-low)/2;
            long coMN = (mid/A) + (mid/B) - (mid/lcm);

            if (coMN == N) {
                ans = mid;
                high = mid-1;
            } else if (coMN > N) {
                high = mid-1;
            } else {
                low = mid+1;
            }
        }

        return (int)(ans%mod);
    }
}
