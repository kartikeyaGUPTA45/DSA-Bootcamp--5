class Solution {

    private int bsf(int nums[], int low, int high, int target) {
        int ans = -1;
        while(low <= high) {
            int mid = (low + high)/2;
            if (nums[mid] == target) {
                ans = mid;
                high = mid-1;
            } else if (nums[mid] > target) {
                high = mid-1;
            } else {
                low = mid+1;
            }
        }

        return ans;
    }

    private int bsl(int nums[], int low, int high, int target) {
        int ans = -1;
        while(low <= high) {
            int mid = (low + high)/2;
            if (nums[mid] == target) {
                ans = mid;
                low = mid+1;
            } else if (nums[mid] > target) {
                high = mid-1;
            } else {
                low = mid+1;
            }
        }

        return ans;
    }

    public int[] searchRange(int[] nums, int target) {
        int ans[] = new int[2];
        Arrays.fill(ans, -1);

        int firstOccurence = bsf(nums,0,nums.length-1,target);
        if (firstOccurence == -1) {
            return ans;
        }
        ans[0] = firstOccurence;
        int lastOccurence = bsl(nums,firstOccurence, nums.length-1, target);
        ans[1] = lastOccurence;
        return ans;

    }
}
