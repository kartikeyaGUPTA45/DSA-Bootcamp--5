class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int reverseX = 0;
        int temp = x;

        while(temp > 0) {
            int rem = temp%10;
            reverseX = reverseX*10 + rem;
            temp/=10;
        }

        return (reverseX == x);
    }
}
