package my.leetcode;

import my.leetcode.util.ListNode;

public class MergeKSortedLists implements Hard {


    static class Solution {
        public ListNode mergeKLists(ListNode[] lists) {

            ListNode head;
            int min = Integer.MAX_VALUE - 1;
            int secondMin = Integer.MAX_VALUE;
            int minIndex = 0;
            ListNode minHead = null;
            for (int i = 0; i < lists.length; i++) {
                if (lists[i] == null) {
                    continue;
                }

                int val = lists[i].val;

                if (val <= min) {
                    min = val;
                    secondMin = min;
                    minIndex = i;
                    minHead = lists[i];
                } else if (val <= secondMin) {
                    secondMin = val;
                }

            }
            head = minHead;
            if (head == null) {
                return null;
            }

            if (lists[minIndex].next == null) {
                lists[minIndex] = null;
                head.next = mergeKLists(lists);
                return head;
            }

            while (lists[minIndex].next != null) {
                if (lists[minIndex].next.val <= secondMin) {
                    lists[minIndex] = lists[minIndex].next;
                } else {
                    ListNode tmp = lists[minIndex];
                    lists[minIndex] = lists[minIndex].next;
                     tmp.next = mergeKLists(lists);
                     return head;
                }
            }
           ListNode end =  lists[minIndex];
             lists[minIndex] = null;
             end.next = mergeKLists(lists);
             return head;
        }


    }
}
