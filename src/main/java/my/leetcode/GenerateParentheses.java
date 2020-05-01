package my.leetcode;


import java.util.*;

public class GenerateParentheses implements Medium {

    static class Solution1 {
        ArrayList[] cache = new ArrayList[100];
        public List<String> generate(int n) {
            if (cache[n] != null) {
                return cache[n];
            }
            ArrayList<String> ans = new ArrayList();
            if (n == 0) {
                ans.add("");
            } else {
                for (int c = 0; c < n; ++c)
                    for (String left: generate(c))
                        for (String right: generate(n - 1 - c))
                            ans.add("(" + left + ")" + right);
            }
            cache[n] = ans;
            return ans;
        }
        public List<String> generateParenthesis(int n) {
            return generate(n);
        }
    }


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

            for (int i = 1; i < n/2+1; i++) {
                Set<String> left = x(i);
                Set<String> right = x(n - i);
                int a=i;
                left.forEach(l -> {
                    right.forEach(r -> {
                        set.add(l + r);
                        if ( a != (n-a)){
                            set.add(r+l);
                        }
                    });
                });
            }
            if (n != max)
                map.put(n, set);
            return set;
        }


    }

}
