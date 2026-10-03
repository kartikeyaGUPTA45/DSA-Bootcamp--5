//Problem Link: https://www.geeksforgeeks.org/problems/find-xor-of-numbers-from-l-to-r/1


// Solution: 

class Solution {
    
    private static int xorTillN(int n) {
        if (n%4 == 0) return n;
        else if (n%4 == 1) return 1;
        else if (n%4 == 2) return n+1;
        else return 0;
    }
    
    public static int findXOR(int l, int r) {
        // code here
        return xorTillN(r) ^ xorTillN(l-1);
        
    }
}
