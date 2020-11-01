import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.w3c.dom.Node;

/*
 * @lc app=leetcode id=429 lang=java
 *
 * [429] N-ary Tree Level Order Traversal
 */

// @lc code=start
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {

    private List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> levelOrder(Node root) {
     if (root != null) traverseNode(root,0);
     return result;
    }

    public void traverseNode(Node node,int level) {
        if (result.size() <= level) {
            result.add(new ArrayList<>());            
        }
        result.get(level).add(node.val);

        for (Node n : node.children) {
            traverseNode(n, level + 1);
        }

    }

 
}


// @lc code=end

