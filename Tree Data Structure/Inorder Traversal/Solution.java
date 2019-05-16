/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution {
    public ArrayList<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        Stack<TreeNode> s = new Stack<TreeNode>(); 
        TreeNode curr = root; 
        while (curr != null || s.size() > 0) 
        { 
            while (curr !=  null) 
            { 
                s.push(curr); 
                curr = curr.left; 
            } 
            curr = s.pop(); 
            al.add(curr.val);
            curr = curr.right; 
        }
        return al;
    }
}
