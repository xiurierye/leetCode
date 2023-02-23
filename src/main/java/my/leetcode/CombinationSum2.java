package my.leetcode;

import java.util.*;

public class CombinationSum2 implements  Medium{


    //leetcode submit region begin(Prohibit modification and deletion)
    static class Solution {
        List<List<Integer>> result = new LinkedList<>();
        int trackSum = 0;


        LinkedList<Integer> track = new LinkedList<>();

        public List<List<Integer>> combinationSum2(int[] candidates, int target) {
            Arrays.sort(candidates);

            backtrack(candidates, target, 0);
            return result;
        }

        public void backtrack(int[] candidates, int target, int start) {
            if (target == trackSum) {
                result.add(new LinkedList<>(track));
                return;
            }
            if (trackSum > target) {
                return;
            }
            Set<Integer> set = new HashSet<>();
            for (int i = start; i < candidates.length; i++) {
                int candidate = candidates[i];
                if (set.contains(candidate)) {
                    continue;
                }
                if (track.size() >= 1 && candidate < track.getLast()) {
                    continue;
                }


                set.add(candidate);
                track.add(candidate);
                trackSum += candidate;
                backtrack(candidates, target, i + 1);
                track.removeLast();

                trackSum -= candidate;

            }

        }


    }

}
