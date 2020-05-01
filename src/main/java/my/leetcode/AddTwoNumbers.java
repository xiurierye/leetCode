package my.leetcode;

import my.leetcode.util.ListNode;

public class AddTwoNumbers  implements Medium{

    public static void main(String[] args) {

    }

    /**
     * pass 2ms
     */
    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

            return traverse(l1, l2, false);


        }

        private ListNode traverse(ListNode l1, ListNode l2, boolean isCarry) {
            ListNode node;
            boolean newCarry = false;
            if (l1 != null && l2 != null) {
                int x = l1.val + l2.val + (isCarry ? 1 : 0);
                if (x >= 10) {
                    newCarry = true;
                    x = x - 10;
                }
                node = new ListNode(x);
                node.next = traverse(l1.next, l2.next, newCarry);
                return node;
            } else if (l1 != null || l2 != null) {
                ListNode notNull = l1 == null ? l2 : l1;
                int x = notNull.val + (isCarry ? 1 : 0);
                if (x >= 10) {
                    newCarry = true;
                    x = x - 10;
                }
                node = new ListNode(x);

                node.next = traverse(notNull.next, null, newCarry);
                return node;
            } else {

                return isCarry ? new ListNode(1) : null;
            }
        }

    }


}
