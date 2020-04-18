package my.leetcode;

import org.junit.Test;

import java.util.stream.IntStream;

import static org.junit.Assert.*;

public class RomanToIntegerTest {

    RomanToInteger.Solution romanToInteger = new RomanToInteger.Solution();
    IntegerToRoman.Solution integerToRoman = new IntegerToRoman.Solution();

    @Test
    public void test1(){
        IntStream.range(1,4000).boxed().forEach(integer -> {
            String s = integerToRoman.intToRoman(integer);
            int i = romanToInteger.romanToInt(s);
            System.out.println(integer +"->"+s+"->"+i);

            assertEquals(integer.intValue(),i);

        });
    }
}