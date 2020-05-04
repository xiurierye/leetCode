package my.leetcode;

import my.leetcode.util.ListNode;
import my.leetcode.util.Utils;
import org.junit.Test;

import static org.junit.Assert.*;

public class SwapNodesInPairsTest {

    SwapNodesInPairs.Solution solution = new SwapNodesInPairs.Solution();

    @Test
    public void test1(){
        ListNode head = Utils.intArray2ListNode(new int[]{1, 2, 3, 4, 5});
        System.out.println(head);
        ListNode listNode = solution.swapPairs(head);
        System.out.println( listNode);

    }
}