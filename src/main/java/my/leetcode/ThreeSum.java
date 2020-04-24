package my.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum implements Medium, TwoPointers {

    static class Solution {

        public List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> lists = new ArrayList<>();
            if (nums == null || nums.length < 3) {
                return lists;
            }

            Arrays.sort(nums);
            for (int i = 0; i < nums.length; i++) {
                int num = nums[i];
                if (num > 0) {
                    break;
                }

                if (i - 1 >= 0 && nums[i] == nums[i - 1]) {
                    continue;
                }

                int left = i + 1;
                int right = nums.length - 1;

                while (left < right) {

                    int i1 = num + nums[left] + nums[right];
                    if (i1 == 0) {
                        ArrayList<Integer> integers = new ArrayList<>();
                        integers.add(num);
                        integers.add(nums[left]);
                        integers.add(nums[right]);
                        lists.add(integers);
                        left++;
                        while (left < right && nums[left] == nums[left - 1]) {
                            left++;
                        }
                        right--;
                        while (right > left && nums[right] == nums[right + 1]) {
                            right--;
                        }
                    } else if (i1 < 0) {
                        left++;
                        while (left < right && nums[left] == nums[left - 1]) {
                            left++;
                        }
                    } else {
                        right--;
                        while (right > left && nums[right] == nums[right + 1]) {
                            right--;
                        }
                    }

                }


            }

            return lists;
        }
    }

}
