package my.leetcode;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

/**
 * @author zhaoji004
 * @Time 4/13/20
 */
public class PalindromeNumberTest {

    PalindromeNumber.Solution solution = new PalindromeNumber.Solution();

    List<Integer> input = new ArrayList<>();
    List<Boolean> output = new ArrayList<>();

    @Before
    public void addTestCase() {
        input.add(121);
        output.add(true);

        input.add(-121);
        output.add(false);

        input.add(10);
        output.add(false);
    }

    @Test
    public void test0() {
        boolean palindrome = solution.isPalindrome(121);
        System.out.println(palindrome);
        assertEquals(palindrome,true);
    }
    @Test
    public void test1() {
        boolean palindrome = solution.isPalindrome(-121);
        System.out.println(palindrome);
        assertEquals(palindrome,false);
    }
    @Test
    public void test2() {
        boolean palindrome = solution.isPalindrome(10);
        System.out.println(palindrome);
        assertEquals(palindrome,false );
    }

    @Test
    public void test3() {
        boolean palindrome = solution.isPalindrome(0);
        System.out.println(palindrome);
        assertEquals(palindrome,true );
    }

    @Test
    public void test4() {
        boolean palindrome = solution.isPalindrome(-0);
        System.out.println(palindrome);
        assertEquals(palindrome,true );
    }

    @Test
    public void minusZero(){
        System.out.println(-0<0);
    }

}