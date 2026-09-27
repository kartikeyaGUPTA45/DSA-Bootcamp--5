//Problem Link: https://www.geeksforgeeks.org/problems/set-bits0143/1

// Solution: 

class Solution {
    public int setBits(int n) {
        // code here
        int count = 0;
        
        for(int i=0;i<32;i++) {
            int res = (n&(1<<i));
            if (res > 0) {
                count+=1;
            }
        }
        
        return count;
    }
}
