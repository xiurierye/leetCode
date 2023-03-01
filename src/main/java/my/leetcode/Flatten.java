package my.leetcode;

import my.leetcode.util.TreeNode;

public class Flatten {

    static class Solution {
        public void flatten(TreeNode root) {
            if ( root == null){
                return;
            }


            backtrack(root);




        }
        private TreeNode backtrack(TreeNode root){
            if ( root.right==null && root.left ==null){
                return root;
            }
            TreeNode left = root.left;
            TreeNode right =root.right;

            if ( left ==null){
                return backtrack(root.right);
            }

            if (right ==null){
                root.right = root.left;
                root.left =null;

                return  backtrack(left);
            }

            TreeNode leftLast = backtrack(root.left);
            TreeNode rightLast = backtrack(root.right);

            root.right = left;
            root.left = null;
            leftLast.right = right;

            return  rightLast;



        }
    }
}
