package my.leetcode.twoSum;

import java.util.*;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        Solution1 solution = new Solution1();

//        int i = solution.lengthOfLongestSubstring("");
//        System.out.println(i);
//
//        int a = solution.lengthOfLongestSubstring("a");
//        System.out.println(a);

//        int pwwkew = solution.lengthOfLongestSubstring("pwwkew");
//        System.out.println(pwwkew);

//        int abcabcbb = solution.lengthOfLongestSubstring("abcabcbb");
//        System.out.println(abcabcbb);
//
//        int aab = solution.lengthOfLongestSubstring("aab");
//        System.out.println(aab);
//
//        int dvdf = solution.lengthOfLongestSubstring("dvdf");
//        System.out.println(dvdf);

//        int tmmzuxt = solution.lengthOfLongestSubstring("tmmzuxt");
//        System.out.println(tmmzuxt);
//
//        int i1 = solution.lengthOfLongestSubstring("aabaab!bb");
//        System.out.println(i1);
//
//        int crdghfrgrgyanjclxgzuomlqxfgeqguuaxdjcuruapwpbzbyhau = solution.lengthOfLongestSubstring("bbbb");
//        System.out.println(crdghfrgrgyanjclxgzuomlqxfgeqguuaxdjcuruapwpbzbyhau);
//
//        int endtomfgdwdwfcgpxiqvkuytdlcgd = solution.lengthOfLongestSubstring("endtomfgdwdwfcgpxiqvkuytdlcgd");
//        System.out.println(endtomfgdwdwfcgpxiqvkuytdlcgd);

        int aiysnlnqnkatxuhchcdfaqxpvhneu = solution.lengthOfLongestSubstring("aiysnlnqnkatxuhchcdfaqxpvhneu");
        System.out.println(aiysnlnqnkatxuhchcdfaqxpvhneu);
//
//        solution.lengthOfLongestSubstring("abcdec");

    }


    /**
     * fixme 这个solution 有问题，hashMap 的初始大小会影响测试情况
     */
    static class Solution {
        public int lengthOfLongestSubstring(String s) {

            Map<String, Integer> map = new HashMap<>(100);

            traverse(s, map);

            return map.values().stream().mapToInt(value -> value).max().orElse(0);
        }


        public void traverse(String s, Map<String, Integer> map) {
            if (s.length() == 0) {
                return;
            }

            boolean startsWith = false;

            Iterator<String> iterator = map.keySet().iterator();
            if (iterator.hasNext()) {
                String subStringInMap = iterator.next();
    //            String subStringInMap = entry.getKey();
                startsWith = s.startsWith(subStringInMap);
                if (startsWith) {
                    int i = nextMaxSubStringIndex(s, subStringInMap, map);
                    traverse(s.substring(i), map);
                }
            }


            if (!startsWith) {
                int i = nextMaxSubStringIndex(s, "", map);
                traverse(s.substring(1), map);
            }
        }

        private int nextMaxSubStringIndex(String str, String subStringInMap, Map<String, Integer> map) {
            String subStr = subStringInMap;
            for (int i = subStringInMap.length(); i < str.length(); i++) {
                String charStr = str.substring(i, i + 1);
                if (subStr.contains(charStr)) {
                    if (subStr.length() != 1) {
                        map.put(subStr, subStr.length());
                    }
                    return i;
                } else {
                    subStr = subStr.concat(str.substring(i, i + 1));
                }
            }
            map.put(subStr, subStr.length());

            return subStr.length();

        }
    }

    /**
     * sliding window
     */
    static class Solution1 {
        public int lengthOfLongestSubstring(String s) {
            int length = s.length();
            if (length == 0) {
                return 0;
            }
            if (length == 1) {
                return 1;
            }
            Map<Character, Integer> map = new HashMap<>();
            int head = 0;
            int tail = head;
            int max = 0;
            for (; tail < length ; tail++) {
                char tailChar = s.charAt(tail);
                if (map.containsKey(tailChar)) {
                    head = Math.max(map.get(tailChar), head);
                }

                max = Math.max(tail-head+1,max);
                map.put(tailChar,tail+1);
            }

            return max;
        }


    }
}

