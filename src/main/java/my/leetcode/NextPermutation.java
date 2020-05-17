package my.leetcode;

import my.leetcode.util.Utils;

import java.util.ArrayList;
import java.util.Arrays;

public class NextPermutation implements Medium{
    static class Solution {
        public void nextPermutation(int[] nums) {
            if (nums.length==0){
                return;
            }

            int lastNumber = nums[nums.length - 1];

            int i=nums.length-2;
            for (; i >= 0; i--) {

                int currentNumber = nums[i];

                if (currentNumber<nums[i+1]){
                    int j = nums.length-1;
                    for (; j > i && nums[j] <= nums[i]; j--) ;
                    int temp = nums[j];
                    nums[j]=nums[i];
                    nums[i]=temp;
                    Arrays.sort(nums,i+1,nums.length);
                    return;
                }

            }

            Arrays.sort(nums);
        }


    }
}
