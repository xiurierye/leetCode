package my.leetcode;

public class RemoveDuplicatesFromSortedArray implements  Easy{
    static class Solution {
        public int removeDuplicates(int[] nums) {
            int newIndex=0;

            for (int i = 0; i < nums.length; i++) {
                int num = nums[i];
                if (nums[newIndex] != num){
                    nums[++newIndex] = num;
                }
            }
            return newIndex+1;
        }
    }
}
