package my.leetcode;

import my.leetcode.util.Utils;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class CombinationSumTest {

    @Test
    public void a(){
        CombinationSum.Solution solution = new CombinationSum.Solution();
        List<List<Integer>> lists = solution.combinationSum(Utils.toIntArray("2,3,6,7"), 7);
        System.out.println(lists);
    }

}