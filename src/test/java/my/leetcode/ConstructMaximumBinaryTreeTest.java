package my.leetcode;

import my.leetcode.util.TreeNode;
import my.leetcode.util.Utils;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConstructMaximumBinaryTreeTest {

    @Test
    public  void  test(){
        ConstructMaximumBinaryTree.Solution solution = new ConstructMaximumBinaryTree.Solution();
        TreeNode treeNode = solution.constructMaximumBinaryTree(Utils.toIntArray("3,2,1,6,0,5"));

    }

}