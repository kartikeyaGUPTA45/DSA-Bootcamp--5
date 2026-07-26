//Problem Link: https://leetcode.com/problems/check-if-the-sentence-is-pangram/description/
//Solution:

class Solution {
    public boolean checkIfPangram(String s) {
        int freq[] = new int [26];

        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            int idx = ch-'a';
            freq[idx]+=1;
        }

        for(int i=0;i<26;i++) {
            if (freq[i] == 0) {
                return false;
            }
        }

        return true;
    }
}
