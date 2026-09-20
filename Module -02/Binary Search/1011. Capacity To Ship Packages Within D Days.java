class Solution {

    private boolean canShipped(int wts[], int capacity, int days) {
        int totalDays = 1;
        int capaSum = 0;
        for(int wt : wts) {
            if (wt > capacity) {
                return false;
            }

            if (capaSum + wt <= capacity) {
                capaSum += wt;
            } else {
                totalDays += 1;
                capaSum = wt;
            }
        }

        return (totalDays <= days);
    }

    public int shipWithinDays(int[] weights, int days) {
        int  low = 1;
        int high = 0;

        for(int wt : weights) {
            high += wt;
        }

        int ans = -1;

        while(low <= high) {
            int mid = low + (high-low)/2;

            if (canShipped(weights, mid, days)) {
                ans = mid;
                high = mid-1;
            } else {
                low = mid+1;
            }
        }

        return ans;
    }
}
