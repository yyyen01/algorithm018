/*
 * @lc app=leetcode id=590 lang=java
 *
 * [590] N-ary Tree Postorder Traversal
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
    public List<Integer> postorder(Node root) {
        LinkedList<Integer> list = new LinkedList<>();
        LinkedList<Node> stack = new LinkedList<>();
        if (root == null) return list;
        
        stack.add(root);
   
        while (!stack.isEmpty()) {
           Node node = stack.pollLast();   
           list.addFirst(node.val);
   
           if (node.children != null) {
               for (Node c:node.children) {
                   stack.add(c);
               }
           }            
        }
        
        return list;

    }


}
// @lc code=end

