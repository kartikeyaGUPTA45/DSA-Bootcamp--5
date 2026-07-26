//Problem Link: https://www.geeksforgeeks.org/problems/toggle-case/1

// Solution:

class Solution {
    public String toggleCase(String s) {
        // code here
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            
            if (ch >= 'a' && ch <= 'z') {
                sb.append((char)(ch-'a'+'A'));
            } else {
                sb.append((char)(ch-'A'+'a'));
            }
        }
        
        return sb.toString();
    }
}
