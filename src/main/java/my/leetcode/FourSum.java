package my.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author zhaoji004
 * @Time 4/28/20
 */
public class FourSum implements Medium{
    static class Solution {
        List<List<Integer>> result = new ArrayList<>();
        int[] nums;
        int target;

        public List<List<Integer>> fourSum(int[] nums1, int target) {
            if (nums1 == null || nums1.length < 4) {
                return result;
            }
            this.nums = nums1;
            this.target = target;
            Arrays.sort(this.nums);
//            System.out.println(Arrays.stream(nums).boxed().collect(Collectors.toList()));
            for (int firstIndex = 0; firstIndex < nums.length - 3; ) {
                int first = nums[firstIndex];

                int secondIndex = firstIndex+1 ;

                this.x(firstIndex, secondIndex);

                for (secondIndex++ ; secondIndex < nums.length - 2;secondIndex++ ) {
                    if (nums[secondIndex - 1] == nums[secondIndex]) {
                        continue;
                    }
                    this.x(firstIndex, secondIndex);

                }

                firstIndex++;
                while (firstIndex < nums.length - 3 && nums[firstIndex] == nums[firstIndex - 1]) {
                    firstIndex++;
                }
            }
            return result;
        }

        private void x(int firstIndex, int secondIndex) {
            int first = nums[firstIndex];
            int second = nums[secondIndex];
            for (int thirdIndex = secondIndex + 1, forthIndex = nums.length - 1; thirdIndex < forthIndex; ) {
                int third = nums[thirdIndex];
                int forth = nums[forthIndex];

                int sum = first + second + third + forth;

                if (sum == target) {
                    add(first, second, third, forth);
                    thirdIndex++;
                    while (thirdIndex < forthIndex && nums[thirdIndex] == nums[thirdIndex - 1]) {
                        thirdIndex++;
                    }
                    forthIndex--;
                    while (thirdIndex < forthIndex && nums[forthIndex] == nums[forthIndex + 1]) {
                        forthIndex--;
                    }
                } else if (sum < target) {
                    thirdIndex++;
                    while (thirdIndex < forthIndex && nums[thirdIndex] == nums[thirdIndex - 1]) {
                        thirdIndex++;
                    }
                } else {
                    forthIndex--;
                    while (thirdIndex < forthIndex && nums[forthIndex] == nums[forthIndex + 1]) {
                        forthIndex--;
                    }
                }
            }
        }

        private void add(int a, int b, int c, int d) {
            List<Integer> list = new ArrayList<>();
            list.add(a);
            list.add(b);
            list.add(c);
            list.add(d);
            result.add(list);
        }
    }

}
