package my.leetcode;


import java.util.*;

public class LongestValidParentheses implements Hard {
    static class Solution {

        // 存放满足匹配对的左index  ，value 为右index
        Map<Integer, Integer> match = new HashMap<>();



        public int longestValidParentheses(String s) {
            if (s == null || s.length() <= 1) {
                return 0;
            }

            List<XX> list = new ArrayList<>();

            this.xx(s,0,list);
            int max =0;



//            System.out.println(list);
            for (XX xx : list) {
                max = Math.max(max,xx.getStr().length());
            }

            return max;

        }


        private void  xx(String origin,   int fromIndex,  List<XX> list) {

            if (fromIndex>= origin.length()){
                return;
            }

            int index = origin.indexOf("()",fromIndex);

            if (index == -1) {
                return;
            }


            XX xx = new XX();
            xx.setStr("()");
            xx.setLeft(index);
            xx.setRight(index+1);
            this.combine(list,xx,origin);
//            this.combine(list,new XX(), );
//            int left = index;
//            int right = index + 1;
//
//
//            while (left >=0  && right<origin.length() ){
//               if (  (left - 1) <0  ||  (right+1)==origin.length()){
//                   break;
//               }
//
//               if (origin.charAt(left-1)=='('  && origin.charAt(right+1)==')'){
//                   left=left-1;
//                   right=right+1;
//               }else {
//                   break;
//               }
//            }
//
//            xx.setStr(origin.substring(left,right+1));
//            xx.setLeft(left);
//            xx.setRight(right);


//            this.combine(list,xx);
//            XX xx1 = list.get(list.size() - 1);
//            XX xx2 = new XX();
//            xx2.setStr(xx1.getStr());
//            xx2.setRight(xx1.right);
//            xx2.setLeft(xx1.left);
//            this.expand(origin,xx,list);

            XX xx3 = list.get(list.size() - 1);

            int right1 = xx3.getRight();
            if (right1+1<origin.length()){
                this.xx(origin, right1+1,list);
            }


        }

        public void expand(String origin, XX xx,List<XX> list){
            int right = xx.getRight();
            int left = xx.getLeft();
            while (left >=0  && right<origin.length() ){
                if (  (left - 1) <0  ||  (right+1)==origin.length()){
                    break;
                }

                if (origin.charAt(left-1)=='('  && origin.charAt(right+1)==')'){
                    left=left-1;
                    right=right+1;
                }
                else {
                    break;
                }
            }



            xx.setStr(origin.substring(left,right+1));
            xx.setLeft(left);
            xx.setRight(right);

            if (list.size()==0){
                return;
            }

            XX xx1 = list.get(list.size() - 1);
            if (xx1.left == xx.left && xx1.right ==xx.right){
                return;
            }
//            this.combine(list,xx);



        }



        public  void combine(List<XX> list, XX xx,String origin){
            if (list.size()==0){
                this.expand(origin,xx,list);
                list.add(xx);
                return;
            }

            this.expand(origin,xx,list);
            XX lastXX = list.get(list.size() - 1);
            if (lastXX.right == xx.getLeft()-1){
                lastXX.right = xx.right;
                lastXX.setStr(lastXX.getStr()+xx.getStr());
                this.expand(origin,lastXX,list);
                list.remove(lastXX);
                combine(list,lastXX,origin);
            }else if(lastXX.left>= xx.getLeft()){
                list.remove(lastXX);
                combine(list,xx,origin);
            }
            else {
                this.expand(origin,xx,list);
                XX newLastXX = list.get(list.size() - 1);
                 if (xx.right == newLastXX.left-1){
                    newLastXX.setStr(newLastXX.getStr()+xx.getStr());
                    this.expand(origin,lastXX,list);
                    combine(list,lastXX,origin);
                }else {
                    list.add(xx);
                }
            }

        }


        static  public class XX{
            String str;
            int left;
            int right;

            public String getStr() {
                return str;
            }

            public void setStr(String str) {
                this.str = str;
            }

            public int getLeft() {
                return left;
            }

            public void setLeft(int left) {
                this.left = left;
            }

            public int getRight() {
                return right;
            }

            public void setRight(int right) {
                this.right = right;
            }

            @Override
            public String toString() {
                return "XX{" +
                        "str='" + str + '\'' +
                        ", left=" + left +
                        ", right=" + right +
                        '}';
            }
        }
    }
}
