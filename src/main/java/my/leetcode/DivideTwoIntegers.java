package my.leetcode;

import javax.swing.plaf.IconUIResource;
import java.util.ArrayList;
import java.util.Arrays;

public class DivideTwoIntegers implements Medium {

    static class Solution {
        int absDividend;
        int absDivisor;

        int prefix = 1;

        public int divide(int dividend, int divisor) {
            if (dividend == Integer.MIN_VALUE && divisor == 1) {
                return Integer.MAX_VALUE;
            }


            int d1 = dividend & Integer.MIN_VALUE;
            int d2 = divisor & Integer.MIN_VALUE;
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

            int[] doubleDivisor = new int[30];
            doubleDivisor[0] = d2;
            int i = 1;
            for (; i < doubleDivisor.length; i++) {
                int i1 = doubleDivisor[i - 1] << 1;
                doubleDivisor[i]=i1;
                if (i1 <= d1){
                    break;
                }
            }


            System.out.println(Arrays.toString(doubleDivisor));
            System.out.println(i);
            int sum=0;
            ArrayList<Integer> list = new ArrayList<>();
            for (int i1 = doubleDivisor.length - 1; i1 >= 0; i1--) {
                int current = doubleDivisor[i1];
                if (current == 0 ){
                    continue;
                }

                if (  (sum + current ) < d1){
                    continue;
                }

                sum += current;
                 list.add(i1);

            }

            System.out.println(list);
            System.out.println(list.size());

            int sum1 = list.stream().mapToInt(value -> {
                int e = 1;
                for (int j = 0; j < value; j++) {
                    e = e << 1;
                }
                System.out.println( value + ":"+e);
                return e;
            }).sum();

            if (prefix ==-1){
                return -sum1;
            }else {
                return sum1;
            }


        }
    }

}
