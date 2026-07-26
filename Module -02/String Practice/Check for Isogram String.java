//Problem Link: https://www.geeksforgeeks.org/problems/check-if-a-string-is-isogram-or-not-1587115620/1

//Solution:



class Solution {
    // Function to check if a string is Isogram or not.
    static boolean isIsogram(String data) {
        // Your code here
        int freq[] = new int[26];
        
        for(int i=0;i<data.length();i++) {
            char ch = data.charAt(i);
            int idx = ch-'a';
            
            freq[idx]+=1;
        }
        
        for(int i=0;i<26;i++) {
            if (freq[i] > 1) {
                return false;
            }
        }
        
        return true;
        
    }
}
