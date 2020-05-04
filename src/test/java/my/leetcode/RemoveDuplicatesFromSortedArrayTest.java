package my.leetcode;

import my.leetcode.RemoveDuplicatesFromSortedArray.Solution;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveDuplicatesFromSortedArrayTest {

    Solution solution = new Solution();
    @Test
    public void test(){
        int[] nums = {1, 1, 2, 3};
        int i = solution.removeDuplicates(nums);
        for (int j = 0; j < i; j++) {
            System.out.println(nums[j]);

        }
        System.out.println();


    }

}