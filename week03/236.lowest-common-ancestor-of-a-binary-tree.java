/*
 * @lc app=leetcode id=236 lang=java
 *
 * [236] Lowest Common Ancestor of a Binary Tree
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) return root;

        //check if p or q exist in left tree
        TreeNode leftNode = lowestCommonAncestor(root.left, p, q);
        //check if p or q exist in right tree
        TreeNode rightNode = lowestCommonAncestor(root.right, p, q);

        if (leftNode == null) return rightNode;
        else if (rightNode == null) return leftNode;
        else return root;

        
    }


    
}
// @lc code=end

