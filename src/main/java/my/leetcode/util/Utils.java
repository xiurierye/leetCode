package my.leetcode.util;


import my.leetcode.RemoveNthNodeFromEndOfList;

public class Utils {

    public static ListNode intArray2ListNode(int[] nums) {
        ListNode header = null;

        for (int length = nums.length; length > 0; length--) {
            ListNode next = new ListNode(nums[length - 1]);
            next.next = header;
            header = next;
        }
        return header;

    }

    public static void print (ListNode listNode){
        while (listNode!=null){
            System.out.print(listNode.val );
            listNode=listNode.next;
            System.out.print(listNode!= null?"->":"\n");
        }
    }
}
