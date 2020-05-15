package my.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author zhaoji004
 * @Time 5/12/20
 */
public class SubstringWithConcatenationOfAllWords {
    static class Solution {
        int wordSize;

        public List<Integer> findSubstring(String s, String[] words) {
            List<Integer> result = new ArrayList<>();
            if (s.length()==0 ||words.length==0){
                return result;
            }


            int length = 0;
            for (int i = 0; i < words.length; i++) {
                length += words[i].length();
            }

            wordSize = length / words.length;

            if (s.length() < length) {
                return result;
            }

            for (int subStart = 0, subEnd = subStart + length; subStart < s.length(); ) {

                String substring = s.substring(subStart, Math.min(subEnd, s.length()));

                if (substring.length() < length) {
                    break;
                }

                List<String> strings = this.toList(words);

                String s1 = this.startWith(substring, strings);

                if (s1.length() == length) {
                    result.add(subStart);
                }

                subStart ++;
                subEnd = subStart + length;
            }

            return result;

        }

        private String startWith(String str, List<String> words) {
            if (str.length() == wordSize) {
                boolean contains = words.contains(str);
                if (contains) {
                    return str;
                } else {
                    return "";
                }
            }

            String startWith = str.substring(0, wordSize);
            boolean contains = words.contains(startWith);

            if (contains) {
                words.remove(startWith);
                return startWith + startWith(str.substring(wordSize), words);
            } else {
                return "";
            }

        }


        private List<String> toList(String[] words) {
            return new LinkedList<>(Arrays.asList(words));
        }
    }
}
