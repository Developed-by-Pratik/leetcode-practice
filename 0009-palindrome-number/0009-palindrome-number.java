class Solution {
    public boolean isPalindrome(int n) {
        int copy = n;
        int revNum = 0;

        while (copy > 0) {
            int digit = copy % 10;
            revNum = revNum * 10 + digit;
            copy /= 10;
        }

        return revNum == n;
    }
}
