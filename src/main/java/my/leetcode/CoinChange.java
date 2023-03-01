package my.leetcode;

import java.util.Arrays;
import java.util.LinkedList;

public class CoinChange  implements  Medium{
    static class Solution {
        int result;

        public int coinChange(int[] coins, int amount) {
            Arrays.sort(coins);
            result = Integer.MAX_VALUE;
            backtrack(coins, amount, new LinkedList<>(), 0);


            return result == Integer.MAX_VALUE ? -1 : result;


        }

        public void backtrack(int[] coins, int target, LinkedList<Integer> track, int start) {
            for (int i = start; i < coins.length; i++) {
                if (target == 0) {
                    result=Math.min(result, track.size());
                    break;
                }
                if (target < 0) {
                    return;
                }

                if (target > 0) {

                    track.add(coins[i]);
                    backtrack(coins, target - coins[i], track, i);
                    track.removeLast();

                }
            }
        }
    }
}
