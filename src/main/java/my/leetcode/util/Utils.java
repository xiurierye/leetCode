package my.leetcode.util;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import my.leetcode.RemoveNthNodeFromEndOfList;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Utils {

    public static int[] toIntArray(String str){
//        new Gson().fromJson(str, new Typ)

        String[] split = str.split(",");
        int[] ints = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            ints[i] = Integer.parseInt(split[i]);
        }
        return  ints;
    }

    /**
     * 输出数组值
     * @param array
     * @return
     */
    public  static String printArray(Object [] array){
        String collect = Stream.of(array).map(Object::toString).collect(Collectors.joining(","));
        System.out.println(collect);
        return collect;
    }

    public  static  void  print(Object object){

        String s = new Gson().toJson(object);
        System.out.println(s);
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
