package my.leetcode;

/**
 * @author zhaoji004
 * @Time 4/13/20
 */
public class PalindromeNumber implements  Easy {
    static class Solution {
        public boolean isPalindrome(int x) {
            int maxRemain = Integer.MAX_VALUE / 10;
            int reverseX = 0;
            if (x < 0) {
                return false;
            }
            int org = x;

            while (x != 0) {
                int remainder = x % 10;

                if (reverseX > maxRemain || (reverseX == maxRemain && remainder > 7)) {
                    return false;
                }

                x /= 10;
                reverseX = reverseX * 10 + remainder;

            }

            return org == reverseX;
        }
    }
}
