package my.leetcode.twoSum;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MedianOfTwoSortedArraysTest {
    MedianOfTwoSortedArrays.Solution solution = new MedianOfTwoSortedArrays.Solution();


    @Test
    public void test1(){
        double medianSortedArrays = solution.findMedianSortedArrays(new int[]{}, new int[]{1, 2});
        System.out.println(medianSortedArrays);
        assertEquals(1.5, medianSortedArrays, 0.0);
    }

    @Test
    public void test2(){
        double medianSortedArrays = solution.findMedianSortedArrays(new int[]{}, new int[]{1});
        System.out.println(medianSortedArrays);
        assertEquals(1, medianSortedArrays, 0.0);
    }

    @Test
    public void test4(){
        double medianSortedArrays = solution.findMedianSortedArrays(new int[]{3}, new int[]{-2,-1});
        System.out.println(medianSortedArrays);
        assertEquals(-1, medianSortedArrays, 0.0);
    }

    @Test
    public void test5(){
        double medianSortedArrays = solution.findMedianSortedArrays(new int[]{}, new int[]{3,4});
        System.out.println(medianSortedArrays);
        assertEquals(3.5, medianSortedArrays, 0.0);
    }

    @Test
    public void test6(){
        double medianSortedArrays = solution.findMedianSortedArrays(new int[]{1,2}, new int[]{-1,3});
        System.out.println(medianSortedArrays);
        assertEquals(1.5, medianSortedArrays, 0.0);
    }

    @Test
    public void test7(){
        double medianSortedArrays = solution.findMedianSortedArrays(new int[]{1,2,3}, new int[]{-1,3});
        System.out.println(medianSortedArrays);
        assertEquals(2, medianSortedArrays, 0.0);
    }

    @Test
    public void test8(){
        double medianSortedArrays = solution.findMedianSortedArrays(new int[]{1}, new int[]{2,3,4});
        System.out.println(medianSortedArrays);
        assertEquals(2.5, medianSortedArrays, 0.0);
    }

    @Test
    public void oxr(){
        boolean t=true;
        boolean f = false;

        System.out.println(t ^ f);
    }
}