package my.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveElementTest {

    RemoveElement.Solution solution = new RemoveElement.Solution();

    @Test
    public void test(){
        int[] nums = {2, 33, 2, 2};
        int i = solution.removeElement(nums, 2);
        for (int i1 = 0; i1 < i; i1++) {
            System.out.println(nums[i1]);
        }
        System.out.println();
    }

    @Test
    public void test1(){
        int[] nums = {3,2,2,3};
        int i = solution.removeElement(nums, 3);
        for (int i1 = 0; i1 < i; i1++) {
            System.out.println(nums[i1]);
        }
        System.out.println();
    }

}