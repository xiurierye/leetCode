package my.leetcode;

import my.leetcode.util.ListNode;

import java.util.List;

public class ReverseNodesInKGroup {
    static class Solution {

        public ListNode reverseKGroup(ListNode head, int k) {
            if (head == null) {
                return head;
            }
            int[] copy = new int[k];
            int groupIndex = 0;

            ListNode groupHead = head;
            ListNode partTwo = head;

            copy[0] = head.val;

            for (int i = 1; i < k; i++) {
                for (int j = 0; j < i; j++) {
                    partTwo = partTwo.next;
                }
                if (partTwo == null) {
//                    groupIndex = i;
                    break;
                }

                copy[i] = partTwo.val;
                groupIndex = i;


                groupHead = swapTwoParts(groupHead, partTwo);
            }

            //不够k 个一组
            if (groupIndex < k - 1) {
                ListNode header = null;

                for (int length = groupIndex + 1; length > 0; length--) {
                    ListNode next = new ListNode(copy[length - 1]);
                    next.next = header;
                    header = next;
                }
                return header;
            }


            head.next = reverseKGroup(head.next, k);
            return groupHead;
        }

        public ListNode swapTwoParts(ListNode partOne, ListNode partTwo) {
            if (partOne == partTwo) {
                return partOne;
            }
            ListNode tail = partOne;
            while (tail.next != partTwo) {
                tail = tail.next;
            }

            tail.next=partTwo.next;
            partTwo.next=partOne;
            return partTwo;
        }
    }


    static class Solution1 {

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
