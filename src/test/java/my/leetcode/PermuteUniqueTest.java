package my.leetcode;

import my.leetcode.util.Utils;
import org.junit.Test;

public class PermuteUniqueTest {

    @Test
    public void test(){
        PermuteUnique.Solution solution = new PermuteUnique.Solution();
        solution.permuteUnique(Utils.toIntArray("1,1,2,1"));
    }

}