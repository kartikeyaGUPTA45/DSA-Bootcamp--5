//Problem Link: https://www.geeksforgeeks.org/problems/sieve-of-eratosthenes5242/1

//SolutionLink:


class Solution {
    public ArrayList<Integer> sieve(int n) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        
        boolean isPrime[] = new boolean[n+1];
        Arrays.fill(isPrime, true);
        
        isPrime[0] = false;
        isPrime[1] = false;
        
        for(int i=2;i*i<=n;i++) {
            if (isPrime[i]) {
                for(int j=i*i;j<=n;j+=i) {
                    isPrime[j] = false;
                }
            }
        }
        
        for(int i=2;i<=n;i++) {
            if (isPrime[i]) {
                ans.add(i);
            }
        }
        
        return ans;

    }
}
