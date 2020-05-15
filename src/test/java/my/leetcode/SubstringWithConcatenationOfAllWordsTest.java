package my.leetcode;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SubstringWithConcatenationOfAllWordsTest {
    SubstringWithConcatenationOfAllWords.Solution solution = new SubstringWithConcatenationOfAllWords.Solution();

    @Test
    public void test(){
        List<Integer> barfoothefoobarman = solution.findSubstring("barfoothefoobarman", new String[]{"foo", "bar"});

        System.out.println(barfoothefoobarman);

    }

    @Test
    public void test1(){
        List<Integer> barfoothefoobarman = solution.findSubstring("barfoofoobarthefoobarman", new String[]{"bar","foo","the"});

        System.out.println(barfoothefoobarman);

    }

    @Test
    public void test2(){
        List<Integer> barfoothefoobarman = solution.findSubstring("wordgoodgoodgoodbestword", new String[]{"word",
                "good"});

        System.out.println(barfoothefoobarman);

    }
    @Test
    public void test3(){
        List<Integer> barfoothefoobarman = solution.findSubstring("oooooo", new String[]{"oo",
                "oo"});

        System.out.println(barfoothefoobarman);

    }

}