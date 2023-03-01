package my.leetcode;

import java.util.HashMap;
import java.util.Map;

public class CheckInclusion implements  Medium{

    static class Solution {
        public boolean checkInclusion(String t, String s) {

            Map<String, Integer> needs = new HashMap<>();
            Map<String, Integer> window = new HashMap<>();
            int left = 0, right = 0, valid = 0;
            int start = 0, len = Integer.MAX_VALUE;

            for (int i = 0; i < t.length(); i++) {
                String c = t.substring(i, i + 1);
                window.put(c, window.getOrDefault(c, 0));
                needs.put(c, needs.getOrDefault(c, 0) + 1);
            }


            while (right < s.length()) {
                String rchar = s.substring(right, right + 1);

                right++;

                if (needs.containsKey(rchar)) {
                    window.put(rchar, window.get(rchar) + 1);
                    if (window.get(rchar).equals(needs.get(rchar))) {
                        valid++;
                    }

                }

                while (right-left>=t.length()) {
                    if (valid == t.length()) {
                        return true;
                    }
                    String lchar = s.substring(left, left + 1);
                    left++;
                    if (needs.containsKey(lchar)) {
                        Integer integer = window.get(lchar);
                        if (integer.equals(needs.get(lchar))) {
                            valid--;
                        }

                        window.put(lchar, window.get(lchar) - 1);
                    }


                }

            }

            return false;


        }
    }
}
