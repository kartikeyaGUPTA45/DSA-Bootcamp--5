class Solution {
    public boolean isPowerOfFour(int n) {
        if (n == 0 || n < 0) {
            return false;
        }

        while(n > 1) {
            int rem = n%4;

            if (rem != 0) {
                return false;
            }

            n/=4;
        }

        return true;
    }
}
