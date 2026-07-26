// Problem Link: https://www.geeksforgeeks.org/problems/pangram-checking-1587115620/1

// Solution:

class Solution {
    public static boolean checkPangram(String s) {
        // code here
     
        int freq[] = new int [26];

        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch<='z') {
                int idx = ch-'a';
                freq[idx]+=1;
            } else if (ch >= 'A' && ch <='Z') {
                ch = (char)(ch-'A'+'a');
                int idx = ch-'a';
                freq[idx]+=1;
            }
        }

        for(int i=0;i<26;i++) {
            if (freq[i] == 0) {
                return false;
            }
        }

        return true;
    }
}
            
