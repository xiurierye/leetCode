package my.leetcode;

import java.util.ArrayList;

/**
 * @author zhaoji004
 * @Time 4/12/20
 */
public class ReverseInteger {

    static class Solution {
        public int reverse(int x) {


            int abs = Math.abs(x);
            int length = String.valueOf(abs).length();
            ArrayList<Integer> integers = new ArrayList<>(length);
            for (int i = length; i > 0; i--) {
                int pow = (int) Math.pow(10, i - 1);
                int ch = x / pow;
                integers.add(ch);
                x -= ch * pow;
            }

            boolean start = false;
            double reverse = 0;
            for (int i = length; i > 0; i--) {
                Integer integer = integers.get(i - 1);
                if (!start) {
                    if (integer == 0) {
                        continue;
                    } else {
                        start = true;
                    }
                }
                reverse += integer * Math.pow(10, i - 1);
                if (reverse < Integer.MIN_VALUE || reverse > Integer.MAX_VALUE) {
                    return 0;
                }
            }
            return (int) reverse;

        }
    }
}
