package my.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zhaoji004
 * @Time 4/13/20
 */
public class RegularExpressionMatching implements Hard {


    /**
     * wrong wrong wrong
     */
    @Deprecated
    static class Solution {

        enum match {lettersmatch, lettersnotmatch, anymatch, wildcardmatch, wildcardnotmatch,wilecardzeromatch,
            wilecardzeroNotmatch}
        enum segment{letter,letterwildcard,dot,dotwildcard};

        enum pCharType {z, dot, wildcard}

        public boolean isMatch(String s, String p) {
            if (p.startsWith("*")) {
                return false;
            }


            int hold = 0;
            int add = 1;
            int exit = 2;
            Map<Integer, pCharType> pCharMap = map(p);
            // 下表对应 lettersmatch, lettersnotmatch, anymatch, wildcardmatch, wildcardnotmatch
            int[] pIndexAction = new int[]{add, add, hold, hold, add};
            int[] sIndexAction = new int[]{add, exit, add, add, hold};
            char preChar = ' ';
            int pIndex = 0;
            int sIndex = 0;
            for (; sIndex < s.length() && pIndex < p.length(); ) {
                char c = s.charAt(sIndex);
                char pChar = p.charAt(pIndex);
                pCharType pCharType = pCharMap.get(sIndex);
                match match = this.match(preChar, c, pChar, pCharType);
                int pAction = pIndexAction[match.ordinal()];
                int sAction = sIndexAction[match.ordinal()];

                if (sAction == exit){
                    break;
                }
                preChar = c;
                pIndex += pAction;
                sIndex += sAction;
            }

            return sIndex == s.length() && pIndex >= p.length() - 1;

        }

        public match match(char preC, char c, char p, pCharType pType) {
            switch (pType) {
                case z: {
                    return c == p ? match.lettersmatch : match.lettersnotmatch;
                }
                case dot: {
                    return match.anymatch;
                }
                case wildcard:
                default: {
                    return c == preC ? match.wildcardmatch : match.wildcardnotmatch;
                }
            }
        }
        public String[] segments(String p){
            Map<Integer, pCharType> map = this.map(p);
            List<String> segments = new ArrayList<>();
            int tail = p.length() - 1;
            for (int i = 0; i < p.length(); ) {
                Solution.pCharType nextpCharType = map.get(i + 1);
                if (nextpCharType ==null){
                    segments.add(p.substring(i,Math.min(i+1, tail)));
                    break;
                }

                String segment = p.substring(i, i + 2);
                pCharType pCharType = map.get(i);

                switch (segment){
                    case "":
                        break;

                }


            }
            return  null;
        }

        public Map<Integer, pCharType> map(String p) {
            Map<Integer, pCharType> pCharMap = new HashMap<>();
            for (int i = 0; i < p.length(); i++) {
                char c = p.charAt(i);
                switch (c) {
                    case '.':
                        pCharMap.put(i, pCharType.dot);
                        break;
                    case '*':
                        pCharMap.put(i, pCharType.wildcard);
                        break;
                    default:
                        pCharMap.put(i, pCharType.z);
                        break;
                }

            }
            return pCharMap;
        }
    }
}
