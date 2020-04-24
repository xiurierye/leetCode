package my.leetcode;

import java.util.Arrays;

public class ThreeSumClosest implements Medium {

    static class Solution {
        public int threeSumClosest(int[] nums, int target) {
            int closest = Integer.MAX_VALUE;
            int sum=0;
            if (nums == null || nums.length < 3) {
                return 0;
            }
            Arrays.sort(nums);

            for (int i = 0; i < nums.length; i++) {
                int num = nums[i];

                if (i - 1 >= 0 && nums[i] == nums[i - 1]) {
                    continue;
                }

                int left = i + 1;
                int right = nums.length - 1;



                while (left < right) {

                    int i1 = num + nums[left] + nums[right];
                    if (i1 == target) {
                        return target;
                    }




                    if (i1 < target) {
                        int currentClose = target - i1;
                        closest = Math.min(currentClose,closest);
                        sum = closest==currentClose?i1:sum;

                        left++;
                        while (left < right && nums[left] == nums[left - 1]) {
                            left++;
                        }
                    } else {
                        int currentClose = i1 - target;
                        closest = Math.min(currentClose,closest);
                        sum = closest==currentClose?i1:sum;
                        right--;
                        while (right > left && nums[right] == nums[right + 1]) {
                            right--;
                        }
                    }
                }

            }


            return sum;
        }
    }
}
