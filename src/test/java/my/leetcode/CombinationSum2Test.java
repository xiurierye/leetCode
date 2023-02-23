package my.leetcode;

import my.leetcode.util.Utils;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class CombinationSum2Test {

    @Test
    public void test(){
        CombinationSum2.Solution solution = new CombinationSum2.Solution();

        List<List<Integer>> lists = solution.combinationSum2(Utils.toIntArray("1,2"), 4);
    }

}