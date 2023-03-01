package my.leetcode;

import my.leetcode.util.Utils;
import org.junit.Test;

import static org.junit.Assert.*;

public class CoinChangeTest {

    @Test
    public void test(){
        CoinChange.Solution solution = new CoinChange.Solution();
        int i = solution.coinChange(Utils.toIntArray("1"), 2);
        System.out.println(i);
    }

}