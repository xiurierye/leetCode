package my.leetcode;

public class ZigZagConversion {

    static class Solution {
        public String convert(String s, int numRows) {
            if (s == null) {
                return null;
            }
            int length = s.length();
            if (length == 1) {
                return s;
            }

            if (numRows <= 1) {
                return s;
            }

            int splitter = 2 * numRows - 2;

            StringBuilder sb = new StringBuilder(s.length());
            for (int i = 0; i < numRows; i++) {
                for (int j = i; j < length;  j += splitter) {
                    // z 第一列 第一行   或  z 第一列 最后一行
                    char c = s.charAt(j);
                    if (i == 0 || i == (numRows - 1)) {
                        sb.append(c);
                    } else {
                        sb.append(c);
                        int secondAppend = j+ numRows-1-i + numRows-1 -i;
                        if (secondAppend< length){
                            char c1 = s.charAt(secondAppend);
                            sb.append(c1);
                        }
                    }

                }

            }


            return sb.toString();

        }
    }
}
