class Solution {

    private boolean isAbleToEatAllBananas(int piles[], int speed, int h) {
        int calHrs = 0;
        for(int pile : piles) {
            calHrs += (int)(Math.ceil((double)(pile)/speed));
            if (calHrs > h) {
                return false;
            }
        }

        return true;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = piles[0];

        for(int pile : piles) {
            high = Math.max(pile, high);
        }

        int ans = -1;

        while(low <= high) {
            int mid = low + (high-low)/2;

            if (isAbleToEatAllBananas(piles, mid, h)) {
                ans = mid;
                high = mid-1;
            } else {
                low = mid+1;
            }
        }

        return ans;
    }
}
