//Problem Link: https://www.geeksforgeeks.org/problems/number-of-factors1435/1#

//Solution: 

class Solution {
    static int countFactors(int n) {
        // code here
        int cnt = 0;
        
        for(int i=1;i*i<=n;i++) {
            if (n%i == 0) {
                if (i == (n/i)) cnt+=1;
                else cnt+=2;
            }
        }
        
        return cnt;
    }
}
