package my.leetcode;

import java.util.*;

public class DivideTwoIntegers implements Medium {

    static class Solution {



        public int divide(int dividend, int divisor) {
            List<Integer[]> valuePow = new ArrayList<>();
//            if (dividend == Integer.MIN_VALUE && divisor == 1) {
//                return Integer.MAX_VALUE;
//            }
            if (dividend == Integer.MIN_VALUE && divisor == -1){
                return Integer.MAX_VALUE;
            }
//            if (dividend == Integer.MAX_VALUE && divisor == -1){
//                return Integer.MIN_VALUE;
//            }
//            if (dividend == Integer.MAX_VALUE && divisor == 1){
//                return Integer.MIN_VALUE;
//            }



            int d1 = dividend & Integer.MIN_VALUE;
            int d2 = divisor & Integer.MIN_VALUE;
            int prefix = 1;
            if (d1 == 0 ^ d2 == 0) {
                prefix = -1;
            }
            d1 = dividend;
            d2 = divisor;

            if (d1 > 0) {
                d1 = (~d1) + 1;
            }
            if (d2 > 0) {
                d2 = (~d2) + 1;
            }

            int pow = 1;
            int value = d2;
            for (;;) {
                if ( value >= d1){
                    Integer [] term = new Integer[2];
                    term[0] = value;
                    term[1] = pow;
                    valuePow.add(term);
                }

                final int remain = Integer.MIN_VALUE - value;
                if (remain > value){
                    break;
                }else {
                    value = value<<1;
                    pow = pow<<1;
                }
            }

//            this.print(valuePow);


            int sum =0;
            int n =0;
            for (int index = valuePow.size()-1; index >= 0; index--) {
                final Integer[] term = valuePow.get(index);
                final Integer powValue = term[0];
                final Integer p = term[1];

                if (Integer.MIN_VALUE -sum  > powValue){
                    continue;
                }

                final int tempSum = powValue + sum;
                if (tempSum == d1) {
                    n+= p;
                    break;
                }
                if (tempSum > d1) {
                    n += p;
                    sum = tempSum;
                }
            }

            return prefix ==-1 ? -n : n;
        }
        private  void print(List<Integer[]> list){
            for (int i = 0; i < list.size(); i++) {
                final Integer[] array = list.get(i);
                System.out.println(Arrays.toString(array));
            }
        }
    }

}
