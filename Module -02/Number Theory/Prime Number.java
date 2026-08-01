//Problem Link: https://www.geeksforgeeks.org/problems/prime-number2314/1

// Solution: 

class Solution {
    static boolean isPrime(int n) {
        // code here
        // int cnt = 0;
        // for(int i=1;i*i<=n;i++) {
        //     if (n%i == 0) {
        //         if (i == n/i) cnt+=1;
        //         else cnt+=2;
        //     }
        // }
        
        // return (cnt == 2) ? true : false;
        
        if (n == 1) return false;
        
        for(int i=2;i*i<=n;i++) {
            if (n%i == 0) {
                return false;
            }
        }
        
        return true;
    }
}
