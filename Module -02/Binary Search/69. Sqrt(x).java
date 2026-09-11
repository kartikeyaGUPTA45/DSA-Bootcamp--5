class Solution {
    public int mySqrt(int x) {
        long low = 0, high = x;
        long ans = 0;
        long X =x;
        while(low <= high) {
            long mid = low + (high-low)/2;

            if(mid*mid <= X) {
                ans = mid;
                low = mid+1;
            } else {
                high = mid-1;
            }
        }

        return (int)ans;
    }
}
