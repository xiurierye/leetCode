package my.leetcode;

public class DivideTwoIntegers implements Medium {

    static class Solution {
        int absDividend ;
        int absDivisor ;

        int prefix =1;

        public int divide(int dividend, int divisor) {
            if (dividend == Integer.MIN_VALUE && divisor == 1) {
                return Integer.MAX_VALUE;
            }

            absDividend = Math.abs(dividend);
            absDivisor = Math.abs(divisor);
            if (absDividend < absDivisor) {
                return 0;
            }

            int d1 = dividend & Integer.MIN_VALUE;
            int d2 = divisor & Integer.MIN_VALUE;
            if (d1 == 0  ^  d2 ==0){
                prefix = -1;
            }

            return  prefix* inner(absDividend,absDivisor);

        }

        private  int inner(int dividend, int divisor){
            if (dividend < divisor) {
                return 0;
            }


            int count = 1;
            int suq = divisor;
            for (; ; ) {
                int remain = Integer.MAX_VALUE - divisor;
                if (remain < divisor) {
                    break;
                }

                if (suq << 1 < dividend) {
                    count++;
                    suq = suq << 1;
                } else {
                    break;
                }
            }

            int remain = dividend - suq;


            return count   + this.inner(remain, divisor);
        }
    }

}
