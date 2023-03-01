package my.leetcode;

import my.leetcode.util.TreeNode;

import java.util.LinkedList;

public class Serialize implements Hard{
    static class Codec {

        String NULL = "#";
        String SPLIT = ",";
        StringBuilder sb = new StringBuilder();

        // Encodes a tree to a single string.
        public String serialize(TreeNode root) {

            if (root == null) {
                return "";
            }
            backtrack(root);

            String s = sb.toString();
            System.out.println(s);
            return s;

        }

        private void backtrack(TreeNode root) {
            if (root == null) {
                sb.append(NULL).append(SPLIT);
                return;
            }
            sb.append(root.val).append(SPLIT);
            backtrack(root.left);
            backtrack(root.right);
        }

        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {
            if (data == ""){
                return null;
            }
            String[] split = data.split(SPLIT);
            LinkedList<String> list = new LinkedList<>();
            for (String s : split) {
                list.add(s);
            }

            return build(list);

        }

        public TreeNode build(LinkedList<String> list) {
            if (list.size() == 0) {
                return null;
            }

            String s = list.removeFirst();
            if (NULL.equals(s)) {
                return null;
            } else {
                TreeNode treeNode = new TreeNode(Integer.parseInt(s));
                treeNode.left= build(list);
                treeNode.right = build(list);
                return treeNode;
            }


        }

    }

}
