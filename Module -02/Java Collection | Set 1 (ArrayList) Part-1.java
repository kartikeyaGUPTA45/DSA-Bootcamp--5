// Problem Link: https://www.geeksforgeeks.org/problems/java-arraylist5312/1

// Solution: 

class Solution {
    ArrayList<Integer> solve(int N, ArrayList<Integer> A, int Q,
                             ArrayList<Integer> q) {
        if (Q == 1) {
            int p = q.get(0);
            int r = q.get(1);
            A.add(p, r);
            return A;
        
        } else {
            int p =q.get(0);
            int idx = -1;
            for(int i=0;i<N;i++) {
                if (A.get(i) == p) {
                    idx = i;
                }
            }
            
            ArrayList<Integer> ans = new ArrayList<>();
            ans.add(idx);
            return ans;
        }
        
    }
}
