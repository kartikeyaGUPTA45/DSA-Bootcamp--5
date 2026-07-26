//Problem Link: https://www.geeksforgeeks.org/problems/anagram-1587115620/1

// Solution: 

class Solution {
    public static boolean areAnagrams(String s, String t) {
        // code here
        if (s.length() != t.length()) {
            return false;
        }

        int freq[] = new int[26];

        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            int idx = ch-'a';
            freq[idx]+=1;
        }


        for(int i=0;i<t.length();i++) {
            char ch = t.charAt(i);
            int idx = ch-'a';
            freq[idx]-=1;
        }

        for(int i=0;i<26;i++) {
            if (freq[i] != 0) {
                return false;
            }
        }

        return true;
    }
}
