package my.leetcode;

public class DivideTwoIntegers implements Medium {

    static class Solution {
        int finalDividend;
        int finalDivisor;

        int prefix = 1;

        public int divide(int dividend, int divisor) {
            if (dividend == Integer.MIN_VALUE && divisor == 1) {
                return Integer.MAX_VALUE;
            }

            finalDividend = dividend > 0 ? (~dividend + 1) : dividend;
            finalDivisor = divisor > 0 ? (~divisor + 1) : divisor;
            if (finalDividend > finalDivisor) {
                return 0;
            }

            int d1 = dividend & Integer.MIN_VALUE;
            int d2 = divisor & Integer.MIN_VALUE;
            if (d1 == 0 ^ d2 == 0) {
                prefix = -1;
            }

            final int result = inner(finalDividend, finalDivisor);
            if (prefix == 1) {
                return -result;
            }
            return result;

        }

        private int inner(int dividend, int divisor) {
            if (dividend > divisor) {
                return 0;
            }


            int count = -1;
            int suq = divisor;
            for (; ; ) {
                int remain = Integer.MIN_VALUE - divisor;
                if (remain > divisor) {
                    break;
                }

                if (suq << 1 > dividend) {
                    count--;
                    suq = suq << 1;
                } else {
                    break;
                }
            }

            int remain = dividend - suq;


            return count + this.inner(remain, divisor);
        }
    }

}
