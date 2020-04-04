package my.leetcode.twoSum;


import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] ints = new Solution1().twoSum(new int[]{3,2,3},6);
        int[] ints1 = new Solution1().twoSum(new int[]{2, 7, 11, 15}, 9);

        int[] ints2 = new Solution2().twoSum(new int[]{3, 2, 3}, 6);
        int[] ints3 = new Solution2().twoSum(new int[]{2, 7, 11, 15}, 9);

        int[] ints4 = new Solution3().twoSum(new int[]{3, 2, 3}, 6);
        int[] ints5 = new Solution3().twoSum(new int[]{2, 7, 11, 15}, 9);

    }

    /**
     * best
     * use hash map
     */
    public static class Solution3{
        public int[] twoSum(int[] nums, int target) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                int x = nums[i];
                int y = target - x;

                if (map.containsKey(y)){
                    return new int[]{map.get(y),i};
                }
                map.put(x,i);
            }
            return new int[0];
        }
    }

    /**
     * faster  48ms
     * target - x
     */
    public static class Solution2 {
        public int[] twoSum(int[] nums, int target) {
            if (nums==null) {
                return new int[0];
            }

            if (nums.length <=1 ){
                return new int[0];
            }

            for (int i = 0; i < nums.length; i++) {
                int x = nums[i];
                int y = target - x;
                for (int i1 = i+1; i1 < nums.length; i1++) {
                    if (y == nums[i1]){
                        return new int[]{i,i1};
                    }
                }
            }
            return new int[]{};
        }
    }

    /**
     * 109 ms
     * brute force way
     */
    public static class Solution1 {
        public int[] twoSum(int[] nums, int target) {
            return traverse(nums,0,target);
        }

        public int[] traverse(int[]nums,int start,int target){
            if (nums==null) {
                return new int[0];
            }

            if (nums.length <=1 ){
                return new int[0];
            }

            int num = nums[start];

            int [] result=new int[]{};
            for (int i = start+1; i < nums.length; i++) {
                if (num+nums[i]==target){
                    return new int[]{start,i};
                }
            }
            return traverse(nums,start+1,target);
        }


    }
}


