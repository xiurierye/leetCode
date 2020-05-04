package my.leetcode;

import my.leetcode.util.ListNode;
import my.leetcode.util.Utils;
import org.junit.Test;

public class ReverseNodesInKGroupTest {

    ReverseNodesInKGroup.Solution solution = new ReverseNodesInKGroup.Solution();


    @Test
    public void test1() {
        System.out.println(solution.reverseKGroup(Utils.intArray2ListNode(new int[]{1, 2,3,4,5,6,7}), 5));
        System.out.println(solution.reverseKGroup(Utils.intArray2ListNode(new int[]{1, 2, 3, 4, 5}), 6));
    }

    @Test
    public void swapTwoParts() {
        ListNode onePart = Utils.intArray2ListNode(new int[]{1, 2, 3});
        ListNode towPart = onePart;
        while (towPart.val != 2) {
            towPart = towPart.next;
        }
        System.out.println(solution.swapTwoParts(onePart, towPart));
    }

}