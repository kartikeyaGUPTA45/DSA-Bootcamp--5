class Solution {

    private void helper(int ob, int cb, String tempAns, List<String> ans) {
        if (ob == 0 && cb == 0) {
            ans.add(tempAns);
            return;
        }

        if (ob > 0) {
            helper(ob-1, cb, tempAns + "(", ans);
        }

        if (cb > ob) {
            helper(ob, cb-1, tempAns + ")", ans);
        }
    }

    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        helper(n, n, "", ans);

        return ans;
    }
}
