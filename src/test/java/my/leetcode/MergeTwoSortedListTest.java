package my.leetcode;

import my.leetcode.util.ListNode;
import my.leetcode.util.Utils;
import org.junit.Test;

import static org.junit.Assert.*;

public class MergeTwoSortedListTest {

    MergeTwoSortedList.Solution solution = new MergeTwoSortedList.Solution();

    @Test
    public void test1() {
        ListNode l1 = Utils.intArray2ListNode(new int[]{1, 3, 4});
        ListNode l2 = Utils.intArray2ListNode(new int[]{1, 2, 4});
        ListNode listNode = solution.mergeTwoLists(l1, l2);

        Utils.print(listNode);
    }

    @Test
    public void test2() {
        ListNode l1 = Utils.intArray2ListNode(new int[]{1, 3, 4,4,6,7,8});
        ListNode l2 = Utils.intArray2ListNode(new int[]{1, 2, 4});
        ListNode listNode = solution.mergeTwoLists(l1, l2);

        Utils.print(listNode);
    }

    @Test
    public void test3() {
        ListNode l2 = Utils.intArray2ListNode(new int[]{1, 3, 4,4,6,7,8});
        ListNode l1 = Utils.intArray2ListNode(new int[]{1, 2, 4});
        ListNode listNode = solution.mergeTwoLists(l1, l2);

        Utils.print(listNode);
    }

    @Test
    public void test4() {
        ListNode l2 = Utils.intArray2ListNode(new int[]{});
        ListNode l1 = Utils.intArray2ListNode(new int[]{1, 2, 4});
        ListNode listNode = solution.mergeTwoLists(l1, l2);

        Utils.print(listNode);
    }

}