package my.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Follow up:
 * Could you do this in one pass?
 *
 * @author zhaoji004
 * @Time 4/28/20
 */
public class RemoveNthNodeFromEndOfList implements Medium {


    static class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            Map<Integer,ListNode> nodeMap = new HashMap<>();
            int i = 0;
            while (head.next!=null){
                nodeMap.put(i++,head);
            }
            int index = nodeMap.size() - n;
            ListNode listNode = nodeMap.get(index);
            if  (index == 0 ){
                return nodeMap.get(1);
            }
            else if (index==n){
                 nodeMap.get(index-1).next=null;
                 return head;
            }else {
                nodeMap.get(index-1).next=nodeMap.get(index+1);
                return head;
            }
        }
    }

    static public class ListNode {
        int val;
        ListNode next;

        public ListNode(int x) {
            val = x;
        }
    }
}
