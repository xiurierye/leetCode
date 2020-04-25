package my.leetcode;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class LetterCombinationsOfAPhoneNumberTest {

    LetterCombinationsOfAPhoneNumber.Solution solution = new LetterCombinationsOfAPhoneNumber.Solution();
    @Test
    public void test(){
        int a = 'a'+1;
        System.out.println((char)a);
    }
    @Test
    public void test1(){

        List<String> strings = solution.letterCombinations("23");
        System.out.println(strings);


    }

}