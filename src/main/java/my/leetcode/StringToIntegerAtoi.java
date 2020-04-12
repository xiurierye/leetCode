package my.leetcode;

import java.util.HashMap;
import java.util.Map;

public class StringToIntegerAtoi {

    static class Solution {
        public int myAtoi(String str) {
            char zero = '0';
            char nine = '9';
            char minus = '-';
            char plus = '+';
            char whitespace = ' ';
            int length = str.length();
            int value = 0;
            boolean start = false;
            int prefix = 1;

            int maxRemain = Integer.MAX_VALUE / 10;
            int minRemain = Integer.MIN_VALUE / 10;
//            Map<Character, Integer> characterIntegerMap = new HashMap<>();
//            characterIntegerMap.put('1', 1);
//            characterIntegerMap.put('2', 1);
//            characterIntegerMap.put('3', 1);
//            characterIntegerMap.put('4', 1);
//            characterIntegerMap.put('5', 1);
//            characterIntegerMap.put('6', 1);
//            characterIntegerMap.put('7', 1);
//            characterIntegerMap.put('8', 1);
//            characterIntegerMap.put('9', 9);
//            characterIntegerMap.put('0', 0);


            for (int i = 0; i < length; i++) {
                char c = str.charAt(i);
                if (!start && (c != whitespace && !(c >= zero && c <= nine) && c != minus && c != plus)) {
                    break;
                } else {
                    if (c == whitespace && !start) {
                        continue;
                    }
                    if (c == whitespace) {
                        break;
                    }
                    if ((c == minus || c == plus) && !start) {
                        prefix = (c == minus ? -1 : 1);
                        start = true;
                        continue;
                    }
                    if (c == minus || c == plus) {
                        break;
                    }
                    start = true;
                    if (c < zero || c > nine) {
                        break;
                    }

                    if (prefix == -1) {
                        if (value < minRemain || (value == minRemain && c > '8'))
                            return Integer.MIN_VALUE;
                    } else {
                        if (value > maxRemain || (value == maxRemain && c > '7'))
                            return Integer.MAX_VALUE;

                    }

                    value = Character.getNumericValue(c) * prefix + value * 10;


                }

            }

            return value;
        }
    }
}
