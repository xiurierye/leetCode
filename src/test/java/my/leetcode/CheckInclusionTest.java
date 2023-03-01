package my.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class CheckInclusionTest {

    @Test
    public void test(){

        CheckInclusion.Solution solution = new CheckInclusion.Solution();
        boolean eidbaooo = solution.checkInclusion("abcdxabcde","abcdeabcdx");
        System.out.println(eidbaooo);
    }

}