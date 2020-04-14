package my.leetcode;

import java.util.HashMap;
import java.util.Map;

public class StringToIntegerAtoi  implements  Medium{

    static class Solution1 {

        class Automaton {
            final String START = "start";
            final String SIGNED = "signed";
            final String IN_NUM = "in_number";
            final String END = "end";
            String state = START;
            Map<String, String[]> map;
            public int sign = 1;
            public long ans = 0;

            public Automaton() {
                map = new HashMap<>();
                map.put(START, new String[]{START, SIGNED, IN_NUM, END});
                map.put(SIGNED, new String[]{END, END, IN_NUM, END});
                map.put(IN_NUM, new String[]{END, END, IN_NUM, END});
                map.put(END, new String[]{END, END, END, END});
            }

            public int get_col(char c) {
                if (c == ' ') return 0;
                if (c == '+' || c == '-') return 1;
                if (c >= '0' && c <= '9') return 2;
                return 3;
            }

            public void get(char c) {
                state = map.get(state)[get_col(c)];
                if (state.equals(IN_NUM)) {
                    ans = ans * 10 + c - '0';
                    if (sign == 1) {
                        ans = Math.min(ans, Integer.MAX_VALUE);
                    } else {
                        // -(long)Integer.MIN_VALUE，这个操作有点东西，不然越界
                        ans = Math.min(ans, -(long)Integer.MIN_VALUE);
                    }
                } else if (state.equals(SIGNED))
                    sign = c == '+' ? 1 : -1;
            }
        }

        public int myAtoi(String str) {
            Automaton automaton = new Automaton();
            char[] c = str.toCharArray();
            for (char ch : c) {
                automaton.get(ch);
            }
            return automaton.sign * ((int) automaton.ans);
        }
    }

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
