package my.leetcode;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class FindAnagramsTest {

    @Test
    public void test(){

        FindAnagrams.Solution solution = new FindAnagrams.Solution();
        List<Integer> anagrams = solution.findAnagrams("cbaebabacd", "abc");

        System.out.println(anagrams);
    }

}