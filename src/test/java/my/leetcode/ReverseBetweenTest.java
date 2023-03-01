package my.leetcode;

import my.leetcode.util.ListNode;
import my.leetcode.util.Utils;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseBetweenTest {

    @Test
    public void reverseBetween() {
        ReverseBetween.Solution solution = new ReverseBetween.Solution();
        ListNode head = Utils.intArray2ListNode(new int[]{1, 2, 3, 4, 5});
        ListNode listNode = solution.reverseBetween(head, 2, 4);

        Utils.print(listNode);
    }
}