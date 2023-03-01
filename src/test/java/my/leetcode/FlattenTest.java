package my.leetcode;

import my.leetcode.util.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class FlattenTest {

    @Test
    public void test(){

        Flatten.Solution solution = new Flatten.Solution();

        TreeNode root = new TreeNode(1);
        root.left= new TreeNode(2);
        solution.flatten(root);
        System.out.println(root);
    }

}