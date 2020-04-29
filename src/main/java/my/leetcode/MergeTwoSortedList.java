package my.leetcode;

import my.leetcode.util.ListNode;

public class MergeTwoSortedList implements Easy {


    static class Solution {
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

            if (l1 == null && l2 == null) {
                return null;
            }

            if (l1 == null) {
                return l2;
            }

            if (l2 == null) {
                return l1;
            }

            ListNode smaller;

            if (l1.val >= l2.val) {
                smaller = l2;
                l2.next = mergeTwoLists(l1, l2.next);
            } else {
                smaller = l1;
                l1.next = mergeTwoLists(l1.next, l2);
            }

            return smaller;

        }
    }
}
