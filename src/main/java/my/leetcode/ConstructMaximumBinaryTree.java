package my.leetcode;

public class ConstructMaximumBinaryTree  implements Medium{

    public class Solution {
        public TreeNode constructMaximumBinaryTree(int[] nums) {
            if (nums.length == 0) {
                return null;
            }
            return traverce(nums, 0);
        }

        public TreeNode traverce(int[] nums, int index) {
            if (index == nums.length-1) {
                return new TreeNode(nums[index]);
            }


            int num = nums[index];
            TreeNode treeNode = new TreeNode(num);
            TreeNode traverce = traverce(nums, index++);
            if (treeNode.val > traverce.val) {
                treeNode.right = traverce;
                return treeNode;
            } else {
                traverce.left = treeNode;
                return traverce;
            }


        }
    }
}
