package my.leetcode.twoSum;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

/**
 * @author zhaoji004
 * @Time 4/10/20
 */
public class LongestPalindromicSubstring {

    public static class Solution {
        public String longestPalindrome(String s) {
            int length = s.length();
            if (length == 0) {
                return "";
            }
            int i,j;
            Set<SubString> subStrings=new HashSet<>();

            SubString maxSubString = new SubString(0,0,0);
            for (i=0; i < length ;i++) {
                char charI = s.charAt(i);
                for ( j=i; j <length ; j++) {
                    if (j+1>=length){
                        break;
                    }
                    if (s.charAt(j+1)!=charI) {
                        break;
                    }
                }
                if ((i-1)<0 ||(j+1)==length){
                    SubString subString = new SubString(i, j, 0);
                    maxSubString = maxSubString.length()>= subString.length()? maxSubString:subString;
                    continue;
                }
                int maxLength = Math.min(i , length - 1 - j);
                int i1=0;
                for (; i1 < maxLength; i1++) {
                    char leftChar = s.charAt(i - 1 - i1);
                    char rightChar = s.charAt(j + 1 + i1);
                    if (leftChar==rightChar){
                        continue;
                    }
                    else {
                        break;
                    }
                }
                SubString subString = new SubString(i, j, i1);
                maxSubString = maxSubString.length()>= subString.length()? maxSubString:subString;
            }

                return s.substring( maxSubString.i-maxSubString.length,maxSubString.j+maxSubString.length+1);
        }
        public static class SubString{
            public final int i;
            public final int j;
            public final int length;

            public SubString(int i, int j, int length) {
                this.i = i;
                this.j = j;
                this.length = length;
            }

            public int length(){
                return j-i+1+ (length*2);
            }

        }
    }
}
