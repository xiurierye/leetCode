package my.leetcode;

import my.leetcode.util.ListNode;
import my.leetcode.util.Utils;
import org.junit.Test;

import static org.junit.Assert.*;

public class MergeKSortedListsTest {

    MergeKSortedLists.Solution solution = new MergeKSortedLists.Solution();

    @Test
    public void test0() {
//[[1,4,5],[1,3,4],[2,6]]
        ListNode listNode = Utils.intArray2ListNode(new int[]{1, 2});
        ListNode listNode1 = Utils.intArray2ListNode(new int[]{3, 4});
//        ListNode listNode2 = Utils.intArray2ListNode(new int[]{2, 6});
        ListNode listNode3 = solution.mergeKLists(new ListNode[]{listNode, listNode1});

        Utils.print(listNode3);


    }

    @Test
    public void test() {
//[[1,4,5],[1,3,4],[2,6]]
        ListNode listNode = Utils.intArray2ListNode(new int[]{1, 4, 5});
        ListNode listNode1 = Utils.intArray2ListNode(new int[]{1, 3, 4});
        ListNode listNode2 = Utils.intArray2ListNode(new int[]{2, 6});
        ListNode listNode3 = solution.mergeKLists(new ListNode[]{listNode, listNode1, listNode2});
        Utils.print(listNode3);

        ListNode listNode4 = Utils.intArray2ListNode(new int[]{2, 6});
        ListNode listNode5 = solution.mergeKLists(new ListNode[]{listNode, listNode4});
        Utils.print(listNode4);


    }

    @Test
    public void test1() {
        ListNode listNode = Utils.intArray2ListNode(new int[]{1});
        ListNode listNode2 = Utils.intArray2ListNode(new int[]{1});
        ListNode listNode3 = solution.mergeKLists(new ListNode[]{listNode, listNode2});
        Utils.print(listNode3);


    }
    @Test
    public void test2() {
        ListNode listNode = Utils.intArray2ListNode(new int[]{0,0,0});
        ListNode listNode2 = Utils.intArray2ListNode(new int[]{3,4,6});
        ListNode listNode3 = solution.mergeKLists(new ListNode[]{listNode, listNode2});
        Utils.print(listNode3);


    }

}