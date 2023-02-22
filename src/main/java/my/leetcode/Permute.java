package my.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Permute implements Medium {
    static class Solution {

        List<List<Integer>> result = new ArrayList<>();
        int[] used;
        int usedCount = 0;

        public List<List<Integer>> permute(int[] nums) {
            used = new int[nums.length];
            backTrace(nums, new ArrayList<>());
            return result;
        }


        public void backTrace(int[] nums, List<Integer> trace) {

            if (usedCount == nums.length) {
                result.add(new ArrayList<>(trace));
            }
            for (int i = 0; i < nums.length; i++) {
                int num = nums[i];
                int isUsed = used[i];
                if (isUsed == 0) { //未使用
                    used[i] = 1;
                    trace.add(num);
                    usedCount += 1;
                    backTrace(nums, trace);
                    usedCount -= 1;
                    used[i] = 0;
                    trace.remove(trace.size() - 1);
                }

            }

        }
    }

    public static void main(String[] args) {
        boolean[] booleans = new boolean[3];
        System.out.println(booleans[1]);
    }


}
