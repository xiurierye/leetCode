package my.leetcode;

import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;


public class GenerateParenthesesTest {

    GenerateParentheses.Solution solution = new GenerateParentheses.Solution();

    @Test
    public void test() {
        char[] chars = new char[2];
        System.out.println("[" + chars[0] + "]");
    }

    @Test
    public void test1() {
        List<String> strings = solution.generateParenthesis(1);
        System.out.println(strings);
    }

    @Test
    public void test2() {
        List<String> strings = solution.generateParenthesis(2);
        System.out.println(strings);
    }
    @Test
    public void test3() {
        List<String> strings = solution.generateParenthesis(3);
        System.out.println(strings);
    }
    @Test
    public void test4() {
        List<String> strings = solution.generateParenthesis(4);
        System.out.println(strings);
    }
    @Test
    public void test5() {
        List<String> strings = solution.generateParenthesis(5);
        System.out.println(strings);
        System.out.println(strings.size());
    }

    @Test
    public void test6() {
        List<String> strings = solution.generateParenthesis(6);
        System.out.println(strings.stream().map(s -> "\""+s+"\"").sorted().collect(Collectors.joining(",","[","]")));
        System.out.println(strings.size());
    }
    @Test
    public void test10() {
        List<String> strings = solution.generateParenthesis(10);
        System.out.println(strings);
        System.out.println(strings.size());
    }

}