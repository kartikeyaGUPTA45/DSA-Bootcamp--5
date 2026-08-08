class Solution {
    public int mySqrt(int x) {
        long ans = 0;
        if (x == 0) {
            return x;
        }

        long low = 1, high = x;

        while(low <= high) {
            long mid = low + (high-low)/2;
            long ele = mid*mid;

            if (ele <= (long)x) {
                ans = mid;
                low = mid+1;
            } else {
                high = mid-1;
            }
        }

        return (int)(ans);
    }
}
