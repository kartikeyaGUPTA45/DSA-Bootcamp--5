//Problem Link: https://www.geeksforgeeks.org/problems/aggressive-cows/1


//Solution: 

class Solution {
    
    private boolean isPossibleToPlacedKCows(int arr[], int n, int mid, int k) {
        int ans = 1;
        int lastPos = arr[0];
        
        for(int i=1;i<n;i++) {
            if (arr[i]-lastPos >= mid) {
                ans += 1;
                lastPos = arr[i];
            }
        }
        
        return (ans >= k);
    }
    
    public int aggressiveCows(int[] arr, int k) {
        // code here
        Arrays.sort(arr);
        
        int n = arr.length;
        
        int low = 1;
        int high = arr[n-1] - arr[0];
        int ans = -1;
        
        while(low <= high) {
            int mid = low + (high-low)/2;
            if (isPossibleToPlacedKCows(arr, n, mid, k)) {
                ans = mid;
                low = mid+1;
            } else {
                high = mid-1;
            }
        }
        
        return ans;
        
    }
}
