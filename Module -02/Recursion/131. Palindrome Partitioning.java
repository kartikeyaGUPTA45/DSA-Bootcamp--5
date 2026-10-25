class Solution {
    List<List<String>> ans;
    List<String> subAns;

    private boolean isPalindrome(String s) {
        int i = 0, j = s.length()-1;

        while(i < j) {
            char chi = s.charAt(i);
            char chj = s.charAt(j);

            if (chi != chj) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

    private void helper(String s, int start) {
        if (start == s.length()) {
            ans.add(new ArrayList<>(subAns));
            return;
        }

        for(int i = start;i<s.length();i++) {
            if (isPalindrome(s.substring(start, i+1))) {
                subAns.add(s.substring(start,i+1));
                helper(s, i+1);
                subAns.remove(subAns.size()-1);
            }
        }
    }

    public List<List<String>> partition(String s) {
        ans = new ArrayList<>();
        subAns = new ArrayList<>();
        helper(s,0);

        return ans;
    }
}
