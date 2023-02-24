package my.leetcode;

import com.google.common.base.MoreObjects;
import my.leetcode.util.Utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CombinationSum implements Medium {

    static class Solution {
        int trackSum=0;
        List<List<Integer>> result = new LinkedList<>();
        LinkedList<Integer> track = new LinkedList<>();
        public List<List<Integer>> combinationSum(int[] candidates, int target) {
            if (target ==1){
                return result;
            }
            Arrays.sort(candidates);
            backtrack(candidates,0,target);
            return result;
        }


        void backtrack(int [] candidates,int start,int target){
            if (trackSum == target ){
                result.add(new LinkedList<>(track));
                return;
            }
            if (trackSum>target){
                return;
            }

            for (int i = start; i <candidates.length; i++) {

                int candidate = candidates[i];
                track.add(candidate);
                trackSum =trackSum + candidate;
                backtrack(candidates,i,target);
                track.removeLast();

                trackSum =trackSum - candidate;

            }
        }
    }
}
