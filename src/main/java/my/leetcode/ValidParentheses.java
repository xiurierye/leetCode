package my.leetcode;

import java.util.Stack;

public class ValidParentheses implements Easy {

    static class Solution {
        static char rightBrackets ='(';
        static char leftBrackets = ')';
        static char rightBrace = '{';
        static char leftBrace = '}';
        static char rightSquareBrackets= '[';
        static char leftSquareBrackets=']';
        public boolean isValid(String s) {
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == rightBrace || c == rightBrackets || c ==rightSquareBrackets){
                    stack.push(c);
                    continue;
                }

                if (stack.empty()){
                    return false;
                }
                Character peek = stack.peek();

                boolean isLeftBrace = c == leftBrace;
                boolean isLeftBrackets = c == leftBrackets;
                boolean isLeftSquareBrackets = c == leftSquareBrackets;
                if ( (isLeftBrace && rightBrace == peek)||
                        (isLeftBrackets && rightBrackets == peek)||
                        (isLeftSquareBrackets && rightSquareBrackets == peek) ){
                    stack.pop();
                    continue;
                }

                if (isLeftBrace || isLeftBrackets || isLeftSquareBrackets){
                    return false;
                }


            }
            return stack.empty();
        }
    }
}
