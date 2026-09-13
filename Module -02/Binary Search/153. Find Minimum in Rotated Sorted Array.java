class Solution {

    private boolean isMin(int nums[], int mid, int n) {
        int leftValue = (mid-1 >= 0) ? nums[mid-1] : Integer.MAX_VALUE; 
        int rightValue = (mid+1 < n) ? nums[mid+1] : Integer.MAX_VALUE;
        int currentValue = nums[mid];

        return (currentValue < leftValue && currentValue < rightValue);
    }

    private boolean isMax(int nums[], int mid, int n) {
        int leftValue = (mid-1 >= 0) ? nums[mid-1] : Integer.MIN_VALUE; 
        int rightValue = (mid+1 < n) ? nums[mid+1] : Integer.MIN_VALUE;
        int currentValue = nums[mid];

        return (currentValue > leftValue && currentValue > rightValue);
    }

    public int findMin(int[] nums) {
        int n = nums.length;

        if (nums[0] < nums[n-1]) {
            return nums[0];
        }

        int low = 0, high = n-1;
        while(low <= high) {
            int mid = (low + high)/2;

            if (isMin(nums,mid,n)) {
                return nums[mid];
            } else if (isMax(nums,mid,n)) {
                return nums[mid+1];
            } else if (nums[low] < nums[mid]) {
                low = mid+1;
            } else {
                high = mid-1;
            }
        }

        return -1;
    }
}
