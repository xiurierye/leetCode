package my.leetcode;

import my.leetcode.SearchInRotatedSortedArray.Solution;
import org.junit.Test;

import static org.junit.Assert.*;

public class SearchInRotatedSortedArrayTest {

    Solution solution = new Solution();
    @Test
    public void  test1(){
        int search = solution.search(new int[]{4, 6, 8, 9, -10, -11, -12, -13, -14, -70, -0, 1, 2}, 6);
        System.out.println(search);
        assertEquals(search,1);
    }
    @Test
    public void  test2(){
        int search = solution.search(new int[]{4,5,6,7,0,1,2}, 3);
        System.out.println(search);
        assertEquals(search,-1);
    }
    @Test
    public void  test3(){
        int search = solution.search(new int[]{4,5,6,7,0,1,2}, 0);
        System.out.println(search);
        assertEquals(search,4);
    }
    @Test
    public void  test4(){
        int search = solution.search(new int[]{1,3}, 2);
        System.out.println(search);
        assertEquals(search,-1);
    }
    @Test
    public void  test5(){
        int search = solution.search(new int[]{1,3}, 4);
        System.out.println(search);
        assertEquals(search,-1);
    }
    @Test
    public void  test6(){
        int search = solution.search(new int[]{1,3}, 1);
        System.out.println(search);
        assertEquals(search,0);
    }
    @Test
    public void  test7(){
        int search = solution.search(new int[]{1,3}, 3);
        System.out.println(search);
        assertEquals(search,1);
    }
    @Test
    public void  test8(){
        int search = solution.search(new int[]{4,5,6,7,8,1,2,3 }, 8);
        System.out.println(search);
        assertEquals(search,4);
    }

}