class Solution {
    public int totalHammingDistance(int[] nums) {
        int n = nums.length;

        int ans = 0;

        for(int i=0;i<32;i++) {
            int csb = 0;
            for(int j=0;j<n;j++) {
                int ele = nums[j];
                csb += (ele&(1<<i)) > 0 ? 1 : 0;
            }

            int cusb = n - csb;
            ans += (csb*cusb);
        }

        return ans;
    }
}
