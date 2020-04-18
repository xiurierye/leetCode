package my.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhaoji004
 * @Time 4/13/20
 */
public class RegularExpressionMatching implements DynamicProgramming, Hard {
    static class Solution2 {
        public boolean isMatch(String text, String pattern) {
            if (pattern.isEmpty()) return text.isEmpty();
            boolean first_match = (!text.isEmpty() &&
                    (pattern.charAt(0) == text.charAt(0) || pattern.charAt(0) == '.'));

            if (pattern.length() >= 2 && pattern.charAt(1) == '*') {
                return (isMatch(text, pattern.substring(2)) ||
                        (first_match && isMatch(text.substring(1), pattern)));
            } else {
                return first_match && isMatch(text.substring(1), pattern.substring(1));
            }
        }
    }


    static class Solution {

        public static final char DOT = '.';
        public static final char WILDCARD = '*';

        public boolean isMatch(String s, String p) {
            if (!p.contains("*")) {
                return noWildcard(s, p);
            }
            List<String> segments = new ArrayList<>();
            splitter(p, segments);
            return withWildcard(s, segments, 0);
        }

        public void splitter(String p, List<String> segments) {
            for (int i = 0; i < p.length(); ) {
                if (i + 1 < p.length()) {
                    char c = p.charAt(i + 1);
                    if (c == WILDCARD) {
                        segments.add(p.substring(i, i + 2));
                        i += 2;
                    } else {
                        segments.add(p.substring(i, i + 1));
                        i++;
                    }
                } else {
                    segments.add(p.substring(i, i + 1));
                    i++;
                }
            }
        }

        public boolean noWildcard(String s, String p) {
            if (s.length() == 0 && p.length() == 0) {
                return true;
            }
            if (s.length() == 0 ^ p.length() == 0) {
                return false;
            }

            boolean isDot = p.charAt(0) == DOT;
            if ((s.charAt(0) == p.charAt(0) || isDot)) {
                return noWildcard(s.substring(1), p.substring(1));
            } else {
                return false;
            }
        }

        public boolean withWildcard(String s, List<String> segments, int index) {
            if (index > (segments.size() - 1)) {
                return s.isEmpty();
            }

            String segment = segments.get(index);

            boolean isDot = segment.charAt(0) == DOT;

            boolean equals = (!s.isEmpty()) && (isDot || segment.charAt(0) == s.charAt(0));


            if (segment.length() == 2) {
                return withWildcard(s, segments, index + 1) ||
                        (equals && withWildcard(s.substring(1), segments, index));
            } else {
                return equals && withWildcard(s.substring(1), segments, index + 1);
            }

        }


    }
}
