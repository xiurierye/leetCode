package my.leetcode;


import java.util.*;

public class GenerateParentheses implements Medium {

    static class Solution {

        Map<Integer, Set<String>> map = new HashMap<>();

        int max;
        public List<String> generateParenthesis(int n) {
            max = n;

            Set<String> x = x(n);
            return new ArrayList<>(x);

        }

        public Set<String> x(int n) {
            if (map.containsKey(n)) {
                return map.get(n);
            }

            if (n == 0) {
                Set<String> strings = new HashSet<>();
                strings.add("");
                map.put(0, strings);
                return strings;

            }

            if (n == 1) {
                Set<String> strings = new HashSet<>();
                strings.add("()");
                map.put(1, strings);
                return strings;
            }

            Set<String> set = new HashSet<>();

            int middle = n - 1;
            Set<String> middleSet = x(middle);
            middleSet.forEach(s -> set.add("(" + s + ")"));

            for (int i = 1; i < n; i++) {
                Set<String> left = x(i);
                Set<String> right = x(n - i);
                left.forEach(l -> {
                    right.forEach(r -> {
                        set.add(l + r);
                    });
                });
            }
            if (n !=max)
                map.put(n,set);
            return set;
        }


    }

}
