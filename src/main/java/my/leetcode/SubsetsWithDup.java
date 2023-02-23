package my.leetcode;

import java.util.*;

public class SubsetsWithDup implements Medium{


    static class Solution {

        List<List<Integer>> result=new LinkedList<>();
        public List<List<Integer>> subsetsWithDup(int[] nums) {
            Arrays.sort(nums);
            backtrack(nums,new LinkedList<Integer>(),0);
            return result;

        }

        void backtrack(int[] nums, LinkedList<Integer> track,int start){
            result.add(new LinkedList(track));

            Set<Integer> set=new HashSet<>();
            for(int i = start ; i < nums.length; i++){
                int num=nums[i];
                if(set.contains(num))    {
                    continue;
                }
                set.add(num);
                track.add(num);
                backtrack(nums,track,i+1);
                track.removeLast();


            }

        }




    }


}
