package my.leetcode;

import my.leetcode.util.ListNode;

public class SwapNodesInPairs implements Medium{
    static  class Solution {
        public ListNode swapPairs(ListNode head) {

            if (head==null || head.next == null){
                return head;
            }

            ListNode second = head.next;
            ListNode nexPairHead= second.next;

            second.next=head;

            head.next=  swapPairs(nexPairHead);

            return second;
        }
    }
}
