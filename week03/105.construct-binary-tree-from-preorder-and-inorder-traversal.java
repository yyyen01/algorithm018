/*
 * @lc app=leetcode id=105 lang=java
 *
 * [105] Construct Binary Tree from Preorder and Inorder Traversal
 */
import java.util.HashMap;

import javax.swing.tree.TreeNode;
// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    HashMap<Integer,Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
       
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return traverse(preorder,inorder,0,preorder.length,0,inorder.length);

    }

    public TreeNode traverse(int[] preorder, int[] inorder,int prestart, int preend,int instart, int inend) {
        if (prestart == preend) return null;

        int rootVal = preorder[prestart];

        TreeNode root = new TreeNode(rootVal);

        int inRootIndex = map.get(rootVal);

        int totalOfLeftNode = inRootIndex - instart;

        root.left = traverse(preorder,inorder,prestart + 1, prestart + totalOfLeftNode + 1, instart, inRootIndex);
        root.right = traverse(preorder,inorder,prestart + totalOfLeftNode + 1, preend , inRootIndex + 1, inend);
        return root;
    }
}
// @lc code=end

