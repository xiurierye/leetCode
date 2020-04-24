package my.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class ThreeSumClosestTest {

    ThreeSumClosest.Solution solution = new ThreeSumClosest.Solution();

    @Test
    public void test1(){
        int i = solution.threeSumClosest(new int[]{-1, 2, 1, -4}, 1);
        System.out.println(i);

        assertEquals(i,2);

    }
    @Test
    public void test2(){
        int i = solution.threeSumClosest(new int[]{2,3,4,32,-2,0,-4,-2,-55,-31,3,24,5}, 1);
        System.out.println(i);

        assertEquals(i,1);

    }

    @Test
    public void test3(){
        int i = solution.threeSumClosest(new int[]{2,3,4,32,-2,0,-4,-2,-55,-31,3,24,5}, 17);
        System.out.println(i);

        assertEquals(i,18);

    }


    @Test
    public void test4(){
        int i = solution.threeSumClosest(new int[]{0,0,0,0,0,0,0,0,0}, 17);
        System.out.println(i);

        assertEquals(i,0);

    }

}