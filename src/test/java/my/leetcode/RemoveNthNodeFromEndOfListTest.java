package my.leetcode;

import my.leetcode.util.ListNode;
import org.junit.Test;

/**
 * @author zhaoji004
 * @Time 4/28/20
 */
public class RemoveNthNodeFromEndOfListTest {

    RemoveNthNodeFromEndOfList.Solution solution = new RemoveNthNodeFromEndOfList.Solution();

    public ListNode buildListNode(int [] nums){
        ListNode header=null;

        for (int length = nums.length; length > 0; length--) {
            ListNode next = new ListNode(nums[length-1]);
            next.next=header;
            header = next;
        }


        return header;

    }

    public void print (ListNode listNode){

        while (listNode!=null){
            System.out.print(listNode.val );
            listNode=listNode.next;
            System.out.print(listNode!= null?"->":"\n");
        }
    }

    @Test
    public void viewListNode(){
        ListNode listNode = buildListNode(new int[]{});
        this.print(listNode);

    }

    @Test
    public void test1(){
        ListNode listNode = this.buildListNode(new int[]{8,2,8,7});
        print(listNode);
        ListNode listNode1 = solution.removeNthFromEnd(listNode, 2);
        print(listNode1);


    }

}