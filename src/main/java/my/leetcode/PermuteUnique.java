package my.leetcode;

import java.util.*;

public class PermuteUnique implements Medium{

    static class Solution {
        List<List<Integer>> result = new LinkedList<>();
        boolean[] used;
        public List<List<Integer>> permuteUnique(int[] nums) {
            used=new boolean[nums.length];

            LinkedList<Integer> track = new LinkedList<>();
//            track.add(nums[1]);
            backtrack(nums, track,0);

            return result;

        }

        void backtrack(int[] nums,LinkedList<Integer> track,int level){
            if (track.size() == nums.length){
                result.add(new LinkedList<>(track));
                return;
            }

            Set<Integer> set = new HashSet<>();
            for (int i = 0; i < nums.length; i++) {
                if (used[i]){
                    continue;
                }

                if (set.contains(nums[i])){
                    continue;
                }



                track.add(nums[i]);
                set.add(nums[i]);
                used[i]=true;
                backtrack(nums,track,level+1);

                Integer integer = track.removeLast();
                used[i]=false;


            }
        }
    }
}
