// Problem Link: https://www.geeksforgeeks.org/problems/check-whether-k-th-bit-is-set-or-not-1587115620/1

// Solution: 

class CheckBit {
    static boolean checkKthBit(int n, int k) {
        // code here
        return (n&(1<<k)) > 0 ? true : false;
        
    }
}
