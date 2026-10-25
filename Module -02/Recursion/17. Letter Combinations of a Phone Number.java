class Solution {
    String letters[] = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    private List<String> helper(String digits) {
        if (digits.length() == 0) {
            List<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        char ch = digits.charAt(0);
        String ros = digits.substring(1);

        List<String> tempAns = helper(ros);
        List<String> ans = new ArrayList<>();

        String letter = letters[ch-'0'];
        for(int i=0;i<letter.length();i++) {
            char addChar = letter.charAt(i);
            for(int j=0;j<tempAns.size();j++) {
                ans.add(addChar + tempAns.get(j));
            }
        }

        return ans;
    }

    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) {
            return new ArrayList<>();
        }

        return helper(digits);
    }
}
