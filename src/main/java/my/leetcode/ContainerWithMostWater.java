package my.leetcode;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ContainerWithMostWater implements Medium {

    static class Solution {
         public int maxArea(int[] height) {
            int max = 0;
            int length = height.length;

            if (length<=1){
                return 0;
            }

            Set<Pair> pairSet =new HashSet<>();

            for (int i = 1; i < length; i++) {
                int previousRight = height[i-1];
                int right = height[i];
                if (previousRight>right){
                    continue;
                }
                for (int j = i + 1; j < height.length; j++) {
                    int left = height[j];
                    if (right<left){
                        continue;
                    }

                    Pair pair = new Pair(Math.min(right,left), j - i);
                    if (!pairSet.contains(pair)){
                        pairSet.add(pair);
                        max = Math.max(max,pair.container);
                    }
                }

            }

            return max;
        }

        public static class Pair{
             int x;
             int y;
             int container;

            public Pair(int x, int y) {
                this.x = Math.min(x,y);
                this.y = Math.max(x,y);
                container = x*y;
            }


            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Pair pair = (Pair) o;
                return x == pair.x &&
                        y == pair.y;
            }

            @Override
            public int hashCode() {
                return Objects.hash(x, y);
            }
        }
    }

}
