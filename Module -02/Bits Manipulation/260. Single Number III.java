class Solution {
    public int[] singleNumber(int[] nums) {
        int ans[] = new int[2];
        int n = nums.length;
        int xor = 0;

        for(int i=0;i<n;i++) {
            xor ^= nums[i];
        }

        int setBit = (xor&(-xor));

        for(int i=0;i<n;i++) {
            int ele = nums[i];

            if ((ele&setBit) == 0) {
                ans[0]^=ele;
            } else {
                ans[1]^=ele;
            }
        }

        return ans;
    }
}
