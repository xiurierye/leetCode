package my.leetcode;

import my.leetcode.util.ListNode;

public class ReverseNodesInKGroup {
    static class Solution {

        ListNode[] copy;
        public ListNode reverseKGroup(ListNode head, int k) {
            ListNode nextGroup = head;
            boolean matchKGroup = true;
            for (int i = 0; i <k; i++) {
                if (nextGroup == null){
                    matchKGroup=false;
                    break;
                }
                nextGroup = nextGroup.next;
            }

            //不够k 个一组
            if (!matchKGroup) {
                return head;
            }


            ListNode groupHead=head;
            ListNode partTwo=head;
            for (int i = 1; i < k; i++) {
                for (int j = 0; j < i; j++) {
                    partTwo=partTwo.next;
                }
                groupHead=  swapTwoParts(groupHead,partTwo);
            }


            head.next =reverseKGroup(nextGroup,k);

            return groupHead;
        }

        public ListNode swapTwoParts(ListNode partOne,ListNode partTwo){
            ListNode tail = partOne;
            while (tail.next != partTwo) {
                tail = tail.next;
            }
            tail.next=partTwo.next;
            partTwo.next=partOne;
            return partTwo;
        }
    }
}
