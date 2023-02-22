package my.leetcode;

import com.google.common.base.MoreObjects;
import my.leetcode.util.Utils;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum implements Medium {

    public static class Solution {
        int[] _candidates;
        int _target;
        List<List<Integer>> result = new ArrayList<>();

        public List<List<Integer>> combinationSum(int[] candidates, int target) {
            _candidates = candidates;
            _target = target;
            Node node = new Node(target, target);

            _combinationSum(node);

            for (int i = 0; i < node.leaves.size(); i++) {

                deep(node.leaves.get(i), new ArrayList<>());
            }


            return result;


        }

        public void deep(Node node, List<Integer> list) {
            if (node.target==0){
                list.add(node.value);
                List<Integer> copy = copy(list);
                result.add(copy);
                list.remove(list.size() - 1);
            }

            if (node.target<0){
                return;
            }

            for (int i = 0; i < node.leaves.size(); i++) {
                list.add(node.value);

                deep(node.leaves.get(i),list);
                list.remove(list.size()-1);
            }
        }

        public List<Integer> copy(List<Integer> list) {
            List<Integer> integers = new ArrayList<>();
            for (int i = 0; i < list.size(); i++) {
                integers.add(list.get(i));
            }
            return integers;
        }

        public void _combinationSum(Node node) {
            for (int i = 0; i < _candidates.length; i++) {
                int candidate = _candidates[i];
                Node node1 = new Node(candidate, node.target - candidate);
                if (candidate > node.value) {
                    continue;
                }
                node.leaves.add(node1);
                if (candidate < node.target) {
                    _combinationSum(node1);
                }
            }

        }

        public static class Node {
            public int value;
            public int target;
            public List<Node> leaves;


            public Node(int value, int target) {
                this.value = value;
                this.target = target;
                this.leaves = new ArrayList<>();
            }

            @Override
            public String toString() {
                return MoreObjects.toStringHelper(this)
                        .add("value", value)
                        .add("target", target)
                        .add("leaves", leaves)
                        .toString();
            }
        }


    }
}
