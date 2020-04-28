package my.leetcode;

import my.leetcode.RemoveNthNodeFromEndOfList.ListNode;
import org.junit.Test;

/**
 * @author zhaoji004
 * @Time 4/28/20
 */
public class RemoveNthNodeFromEndOfListTest {

    RemoveNthNodeFromEndOfList.Solution solution = new RemoveNthNodeFromEndOfList.Solution();

    public ListNode buildListNode(int count){
        ListNode header=null;
        for (int i = count; i > 0; i--) {
            ListNode next = new ListNode(i);
            next.next=header;
            header = next;

        }

        return header;

    }

    @Test
    public void viewListNode(){
        int count = 10;
        ListNode listNode = buildListNode(count);

        while (listNode!=null){
            System.out.print(listNode.val );
            listNode=listNode.next;
                System.out.print(listNode!= null?"->":"\n");
        }
    }

}