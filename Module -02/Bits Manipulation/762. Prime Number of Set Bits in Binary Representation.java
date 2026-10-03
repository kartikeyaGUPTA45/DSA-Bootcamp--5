class Solution {
    private boolean [] primeSieve() {
        int n = 31;
        boolean isprime[] = new boolean[n];
        Arrays.fill(isprime, true);

        isprime[0] = false;
        isprime[1] = false;

        for(int i=2;i*i<=n;i++) {
            if (isprime[i]) {
                for(int j=i*i;j<=n;j+=i) {
                    isprime[j] = false;
                }
            }
        }

        return isprime;
    }

    private int cntSetBits(int n) {
        int cnt = 0;
        while(n > 0) {
            cnt+=1;
            n = (n&(n-1));
        }
        
        return cnt;
    }


    public int countPrimeSetBits(int left, int right) {
        boolean isPrime[] = primeSieve();
        int ans = 0;
        for(int i=left;i<=right;i++) {
            int csb = cntSetBits(i);
            if (isPrime[csb]) ans+=1;
        }

        return ans;
    }
}
