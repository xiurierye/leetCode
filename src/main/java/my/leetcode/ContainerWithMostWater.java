package my.leetcode;


public class ContainerWithMostWater implements Medium {

    static class Solution {
        public int maxArea(int[] height) {
            int left = 0, right = height.length - 1;
            int max = 0;


            while (left < right) {
                int i = height[left];
                int j = height[right];
                int h = Math.min(i, j);
                int w = right - left;
                max = Math.max(w * h, max);

                while (left < right && height[left]<=h) {
                        left++;
                }
                while (left < right &&height[right]<=h){
                    right--;
                }

            }
            return max;
        }


    }
}

