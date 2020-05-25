package my.leetcode;

public class SearchInRotatedSortedArray {

   static  class Solution {
        public int search(int[] nums, int target) {
            if (nums == null || nums.length == 0) {
                return -1;
            }

            return search(nums,0,nums.length-1,target);

        }

        private  int search(int[]nums,int start,int end,int target){
            if (start == end){
                return nums[start] == target? start: -1;
            }
            if (start< 0 || end>nums.length-1){
                return -1;
            }
            if (start>end){
                return -1;
            }

            int i = (start + end) / 2;

            int middle = nums[i];

            if (middle == target){
                return i;
            }

            int firstNum = nums[start];
            int lastNum = nums[end];

            if (firstNum <= target && target<middle){
                return search(nums,start, i-1,target);
            }

            if (middle<target && target<=lastNum){
                return search(nums,i+1,end,target);
            }

            if (middle > target) {
                return search(nums,i+1,end,target);
            }
            else {
                return search(nums,start,i-1,target);
            }


        }
    }
}
