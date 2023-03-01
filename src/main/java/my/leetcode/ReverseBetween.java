package my.leetcode;

import my.leetcode.util.ListNode;

public class ReverseBetween implements Medium {
    static class Solution {
        ListNode rNode;
        ListNode lNode;

        ListNode newNode;

        public ListNode reverseBetween(ListNode head, int left, int right) {
            if (left ==1){
                return reverseN(head,right);
            }

            head.next = reverseBetween(head.next,left -1 ,right-1);
            return head;


        }

        ListNode successor;//后驱节点
        ListNode reverseN(ListNode head, int n){
            if (n==1){
                successor=head.next;
                return head;
            }

            ListNode last = reverseN(head.next, n - 1);
            head.next.next = head;
            head.next=successor;
            return last;

        }


    }
}
