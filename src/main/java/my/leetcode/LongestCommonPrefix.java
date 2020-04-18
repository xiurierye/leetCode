package my.leetcode;

public class LongestCommonPrefix implements Easy {

    static class Solution {
        public String longestCommonPrefix(String[] strs) {
            String prefix="";

            if (strs.length == 0) {
                return prefix;
            }
            if (strs.length == 1) {
                return strs[0];
            }

            String first = strs[0];
            if (first.length() == 0) {
                return prefix;
            }
            int index =0;
            for (; index < first.length(); index++) {
                boolean isBreak=false;
                for (int j = 1; j < strs.length; j++) {
                    String word = strs[j];
                    if (index >= word.length()){
                        isBreak=true;
                        break;
                    }
                    if (first.charAt(index)!=word.charAt(index)){
                        isBreak=true;
                        break;
                    }
                }
                if (isBreak){
                  break;
                }
            }
            return first.substring(0,index);

        }
    }
}
