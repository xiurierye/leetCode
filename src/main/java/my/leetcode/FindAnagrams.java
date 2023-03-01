package my.leetcode;

import java.util.ArrayList;
import java.util.List;

public class FindAnagrams {
   static  class Solution {
        public List<Integer> findAnagrams(String s, String p) {
            char [] chars= s.toCharArray();

            int [] needs = new int[26];
            int [] windows = new int[26];
            char a = 'a';
            for (int i = 0; i < p.toCharArray().length; i++) {
                needs[p.charAt(i) - a] += 1;
            }
            int validlen=0;
            for (int i = 0; i < needs.length; i++) {
                if (needs[i]!=0){
                    validlen++;
                }
            }

            List<Integer> result = new ArrayList<>();
            int left = 0 ,right =0;
            int valid = 0;

            while ( right <s.length()){
                char c = s.charAt(right);
                right ++ ;

                if (needs[c-a]!=0){
                    windows[c-a]+=1;
                    if (windows[c-a] == needs[c-a]) {
                        valid++;
                    }
                }

                if (right-left == p.length()){
                    if (valid == validlen){
                        result.add(left);
                    }
                    char c1 = s.charAt(left);
                    if (needs[c1-a]!=0){
                        if (windows[c1-a]==needs[c1-a]){
                            valid--;
                        }
                        windows[c1-a]-=1;
                    }

                    left ++;
                }

            }
            return result;

        }
    }
}
