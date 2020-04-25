package my.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationsOfAPhoneNumber  implements Backtracking{


    static class Solution {
        Map<Character, Character> map = new HashMap<>();
        List<String> result = new ArrayList<>();

        public List<String> letterCombinations(String digits) {
            if (digits == null || digits.length() == 0) {
                return new ArrayList<>();
            }

            map.put('2', 'a');
            map.put('3', 'd');
            map.put('4', 'g');
            map.put('5', 'j');
            map.put('6', 'm');
            map.put('7', 'p');
            map.put('8', 't');
            map.put('9', 'w');

            traverse(digits, new StringBuilder());
            return result;
        }


        private void traverse(String digits, StringBuilder prefix) {

//            for (int i = 0; i < digits.length(); i++) {
                char c = digits.charAt(0);
                int length = (c == '7' || c == '9') ? 4 : 3;

                for (int k = 0; k < length; k++) {
                    StringBuilder stringBuilder = new StringBuilder(prefix);
                    stringBuilder.append((char)(map.get(c) + k));
                    if (digits.length()==1){
                        result.add(stringBuilder.toString());
                        continue;
                    }else {
                        traverse(digits.substring(1),stringBuilder);
                    }
                }

//            }


        }
    }
}
