class Solution {
    public String convertToTitle(int cN) {
        StringBuilder sb = new StringBuilder();

        while(cN > 0) {
            int rem = cN%26;

            if (rem == 0) {
                sb.append("Z");
                cN-=1;
            } else {
                char ch = (char)(rem-1+'A');
                sb.append(ch);
            }

            cN/=26;
        }

        return sb.reverse().toString();
    }
}
