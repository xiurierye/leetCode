package my.leetcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.stream.IntStream;

public class IntegerToRomanTest {

    IntegerToRoman.Solution solution = new IntegerToRoman.Solution();

    @Test
    public void test(){
        IntStream.range(1,4000).boxed().forEach(value -> {
            String s = solution.intToRoman(value);
            System.out.println(value + "  "+ s);
        });

    }

    @Test
    public void test1(){
        String s = solution.intToRoman(90);
        System.out.println(s);
        Assert.assertEquals("XC",s);

    }

}