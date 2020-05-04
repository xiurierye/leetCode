package my.leetcode.util;


import my.leetcode.RemoveNthNodeFromEndOfList;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Utils {

    public  static String printArray(Object [] array){
       return Stream.of(array).map(Object::toString).collect(Collectors.joining(","));
    }

    public static ListNode intArray2ListNode(int[] nums) {
        ListNode header = null;

        for (int length = nums.length; length > 0; length--) {
            ListNode next = new ListNode(nums[length - 1]);
            next.next = header;
            header = next;
        }
        return header;

    }

    public static String print (ListNode listNode){
        StringBuilder sb = new StringBuilder();
        while (listNode!=null){
           sb.append(listNode.val );
            listNode=listNode.next;
            boolean b = listNode != null;
            if (b){
                sb.append("->");
            }
        }
        return sb.toString();
    }
}
