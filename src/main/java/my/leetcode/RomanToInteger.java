package my.leetcode;

public class RomanToInteger implements Easy{
    static class Solution {
        public int romanToInt(String s) {
            String [] r=new String []{"M","CM","D","CD","C","XC","L","XL","X", "IX","V","IV","I"};
            int [] i=new int []{1000,900,500,400,100,90,50,40,10,9,5,4,1};

            int value =0;
            int index=0;
            while (index<r.length){
                if (s.startsWith(r[index])){
                    s =  s.substring(r[index].length());
                    value+=i[index];
                }
                else {
                    index++;
                }
            }

            return  value;

        }
    }


}
