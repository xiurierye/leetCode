package my.leetcode;

import my.leetcode.util.ListNode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeKSortedLists {


    class Solution {
        public ListNode mergeKLists(ListNode[] lists) {
            ListNode head=null;
            List<ListNode> h = Stream.of(lists).collect(Collectors.toList());
            int[] headValue =new int[h.size()];
            while (h.size()!=0){
                ListNode tmpHead=null;
                for (int i = 0; i < h.size(); i++) {
                    if (h.get(i) ==null) {
                        headValue[i]=Integer.MAX_VALUE;
                        continue;
                    }

                    headValue[i]=h.get(i).val;
                }
                Arrays.sort(headValue);

            }
            return head;
        }
    }
}
