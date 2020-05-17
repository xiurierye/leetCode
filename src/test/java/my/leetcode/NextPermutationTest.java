package my.leetcode;

import my.leetcode.util.Utils;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class NextPermutationTest {

    NextPermutation.Solution solution = new NextPermutation.Solution();
    @Test
    public void test(){
        int[] nums = {10, 99, 1};
        solution.nextPermutation(nums);

        Utils.print(nums);


    }
    @Test
    public void test2(){
        int[] nums = {1, 3, 2};
        solution.nextPermutation(nums);

        Utils.print(nums);


    }

}