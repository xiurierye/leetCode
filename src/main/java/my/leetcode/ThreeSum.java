package my.leetcode;

import java.util.*;
import java.util.stream.Collectors;

public class ThreeSum {

    static class Solution {

        Map<Integer, Integer> solutions = new HashMap<>();
        Set<result> lists = new HashSet<result>();

        int[] n;

        public List<List<Integer>> threeSum(int[] nums) {
            n = nums;
            this.twoSum(0, 0, 3, new ArrayList<>());
            return lists.stream().map(result::list).collect(Collectors.toList());
        }


        /**
         * @param index 当前下标
         * @param x     目标x
         * @return
         */
        public void twoSum(int index, int x, int splitter, List<Integer> list) {
            if (splitter == 1) {
                for (int i = index; i < n.length; i++) {
                    int a = n[i];
                    if (a == x ) {

                        int max = Math.max(list.get(0), list.get(1));
                        int min = Math.min(list.get(0), list.get(1));

                        int min1 = Math.min(min, a);
                        int max1 = Math.max(a, max);
                        lists.add(new result(  min1,-min1 - max1,max1));
                        break;
                    }
                }
                return;
            }


            for (int i = index; i < n.length; i++) {
                int num = n[i];
                int y = x - num;



                ArrayList<Integer> newList = new ArrayList<>(list);
                newList.add(num);
                twoSum(i + 1, y, splitter - 1, newList);
//                solutions.put(Math.min(x, y), Math.max(x, y));
            }
        }

        class result {
            int a;
            int b;
            int c;

            public result(int a, int b, int c) {
                this.a = a;
                this.b = b;
                this.c = c;
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                result result = (result) o;
                return a == result.a &&
                        b == result.b &&
                        c == result.c;
            }

            @Override
            public int hashCode() {
                return Objects.hash(a, b, c);
            }

            public List<Integer> list() {
                ArrayList<Integer> integers = new ArrayList<>();
                integers.add(a);
                integers.add(b);
                integers.add(c);
                return integers;
            }
        }

    }

}
