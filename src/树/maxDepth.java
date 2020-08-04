package 树;


import utils.TreeNode;

import java.util.Arrays;

/**
 * @Auther: valarcfcc
 * @Date: 2020/8/4 23:10
 * @Description:
 */
public class maxDepth {
    public static void main(String[] args) {
        Integer[] list = {3,9,20,null,null,15,7};
        TreeNode<Integer> root = TreeNode.createTreeNode(list);
        int depth = maxDepth(root);
        System.out.println("maxDepth = " + depth);
    }

    public static int maxDepth(TreeNode root) {
        if(root == null)
        {
            return 0;
        }
        return Math.max(maxDepth(root.left),maxDepth(root.right)) +1;
    }
}
