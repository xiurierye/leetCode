package my.leetcode.twoSum;

import my.leetcode.twoSum.ZigZagConversion.Solution;
import org.junit.Assert;
import org.junit.Test;


public class ZigZagConversionTest {

    Solution solution = new Solution();

    @Test
    public void test0(){
        String paypalishiring = solution.convert("PAYPALISHIRING", 3);
        System.out.println(paypalishiring);
        Assert.assertEquals("PAHNAPLSIIGYIR", paypalishiring);
    }

    @Test
    public void test1(){
        String leetcodeishiring = solution.convert("LEETCODEISHIRING", 4);
        System.out.println(leetcodeishiring);
        Assert.assertEquals("LDREOEIIECIHNTSG", leetcodeishiring);
    }


}