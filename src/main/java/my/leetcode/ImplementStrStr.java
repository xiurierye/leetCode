package my.leetcode;

public class ImplementStrStr implements Easy {

    static class Solution {
        public int strStr(String haystack, String needle) {
            if (needle == null || needle.length() == 0) {
                return 0;
            }

            int index=0;
            for (int i = 0; i < haystack.length();i++) {
                index=i;
                for (int j = 0; j < needle.length(); ) {
                    if (i+j>= haystack.length()){
                        return -1;
                    }

                    if (haystack.charAt(i+j) != needle.charAt(j)){
                        break;
                    }

                    j++;


                    if (j == needle.length()){
                        return index;
                    }
                }
            }

            return -1;
        }
    }
}
