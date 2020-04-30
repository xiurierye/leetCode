package my.leetcode;


import java.util.*;

public class GenerateParentheses implements Medium {

//    static class Solution {
//
//        Set<String> list = new HashSet<>();
////        List<String> list = new ArrayList<>();
//        int length;
//        int loop;
//
//        public List<String> generateParenthesis(int n) {
//            if (n==0){
//                list.add("");
//                return new ArrayList<>(list);
//            }
//
//            length = 2 * n;
//            loop = n;
//
//            char[] chars = new char[length];
//            for (int j = 0; j < length; j++) {
//                chars[j] = ' ';
//            }
//
//
//            str(chars, 1);
//
//            return new ArrayList<>(list);
//
//        }
//
//        public void str(char[] chars, int n) {
//            if (n == loop) {
//                for (int i = 0; i < length; i++) {
//                    if (chars[i] == ' ') {
//                        chars[i] = '(';
//                        for (int j = i + 1; j < length; j++) {
//                            if (chars[j] == ' ') {
//                                chars[j] = ')';
//                                list.add(new String(chars));
//                                return;
//                            }
//                        }
//                    }
//                }
//            }else if(n==1){
//                chars[0]='(';
//                for (int i = 1; i < length; i+=2) {
//                    char[] copy1 = Arrays.copyOf(chars, chars.length);
//                    copy1[i] = ')';
//                    str(copy1,n+1);
//
//                }
//            }
//
//
//
//            for (int i = 0; i < length; i++) {
//
//
//                char[] copy1 = Arrays.copyOf(chars, chars.length);
//                if (copy1[i] != ' ') {
//                    continue;
//                }
//
//                copy1[i] = '(';
//
//                for (int j = i + 1; j < length; j += 2) {
//                    if (copy1[j] != ' ') {
//                        continue;
//                    }
//
//                    copy1[j] = ')';
//                    char[] copy2 = Arrays.copyOf(copy1, copy1.length);
//                    str(copy2, n+1);
//                }
//
//            }
//
//
//        }
//
//
//    }
    /*static class Solution {

        List<String> list = new ArrayList<>();
        int length;

        public List<String> generateParenthesis(int n) {
            if ( n == 0){
                list.add("");
                return list;
            }

            length = n * 2;


            ArrayList<Character> characters = new ArrayList<>();

//            for (int i = 0; i <n; i++) {
//                int right = length - (i+1);
//                int left = n - 1;
//            for (int i = 1; i <=n ; i++) {
                char[] chars = new char[length];

                for (int j = 0; j < length; j++) {
                    chars[j] = ')';
                }
//                str(right, left, chars, n-i);
//
//
//            }
                str(n-1,length -1,chars ,n);
//            }



            return list;
        }

        public void str(int left, int right, char[] chars, int n) {
            if (right < left) {
                return;
            }

            if (n == 1) {
                chars[0] = '(';
                String s = new String(chars);

                list.add(s);
                System.out.println(s);

                return;

            }

            for (int i = left; i < right; i++) {
                char[] copy= Arrays.copyOf(chars,chars.length);
//                System.out.print(new String(chars)+"->");

                if ((right-i+1) %2 ==1){
                    continue;
                }
                copy[i] = '(';

//                System.out.print(new String(copy) + "->");

                int newLeft = n-1-1;
                str(newLeft, i, copy, n - 1);
            }
        }


    }*/
}
