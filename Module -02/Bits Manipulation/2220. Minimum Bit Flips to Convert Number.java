class Solution {
    public int minBitFlips(int start, int goal) {
        int num = start^goal;

        int ans = 0;
        while(num > 0) {
            num = (num & (num-1));
            ans+=1;
        }

        return ans;
    }
}
