package my.leetcode;

import my.leetcode.util.Utils;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class PermuteTest {

    @Test
    public void test(){
        Permute.Solution solution = new Permute.Solution();
        List<List<Integer>> permute = solution.permute(Utils.toIntArray("1,2,3"));
        System.out.println(permute);

    }

    @Test
    public void test1(){
        Permute.Solution solution = new Permute.Solution();
        List<List<Integer>> permute = solution.permute(Utils.toIntArray("1,0"));
        System.out.println(permute);

    }

}