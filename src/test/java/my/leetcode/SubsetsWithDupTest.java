package my.leetcode;

import my.leetcode.util.Utils;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SubsetsWithDupTest {

    @Test
    public void test(){
        SubsetsWithDup.Solution solution = new SubsetsWithDup.Solution();
        List<List<Integer>> lists = solution.subsetsWithDup(Utils.toIntArray("4,4,4,1,4"));
        System.out.println(lists);
    }

}