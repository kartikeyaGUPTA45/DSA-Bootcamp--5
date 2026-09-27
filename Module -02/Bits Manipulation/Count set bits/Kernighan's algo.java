class Solution {
    public int setBits(int n) {
        // code here
        int count = 0;
        
        while(n>0) {
            count+=1;
            n = (n&(n-1));
        }
        return count;
    }
}
