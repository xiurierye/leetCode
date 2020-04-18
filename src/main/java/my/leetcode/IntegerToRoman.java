package my.leetcode;

public class IntegerToRoman implements Medium {
    static class Solution {
        enum digit {I, II, III, IV, V, VI, VII, VIII, IX}

        enum twoDigit {X, XX, XXX, XL, L,LX, LXX, LXXX, XC}

        enum threeDigit{C,CC,CCC,CD,D,DC,DCC,DCCC,CM}

        enum fourDigit{M,MM,MMM}

        public String intToRoman(int num) {
            String roman="";
            if (num/1000!=0){
                int i = num / 1000;
                roman+= fourDigit.values()[i - 1].toString();
                num-=i*1000;
            }
            if (num / 100 != 0) {
                int i = num / 100;
                roman+= threeDigit.values()[i - 1].toString();
                num-=i*100;
            }

            if (num / 10 != 0) {
                int i = num / 10;
                roman+= twoDigit.values()[i - 1].toString();
                num-=i*10;
            }

            if (num !=0){
                int i = num;
                roman+= digit.values()[i - 1].toString();
            }

            return roman;
        }
    }
}
