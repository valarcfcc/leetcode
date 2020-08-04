package utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Auther: valarcfcc
 * @Date: 2020/8/4 23:21
 * @Description:
 */
public class TreeNode <T>
{
    public T val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(T val){
        this.val = val;
    }

    public TreeNode() {
    }


    public TreeNode(T val,TreeNode left,TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static TreeNode createTreeNode(Integer[] array){
        TreeNode root = createTreeNode(array, 1);
        return root;
    }

    private static TreeNode createTreeNode(Integer[] array, int index) {
        if(index > array.length){
            return null;
        }
        Integer value = array[index - 1];
        if(value == null){
            return null;
        }
        TreeNode node = new TreeNode(value);
        node.left = createTreeNode(array, index * 2);
        node.right = createTreeNode(array, index * 2 + 1);
        return node;
    }
}
