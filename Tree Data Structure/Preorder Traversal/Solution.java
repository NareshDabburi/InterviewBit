×
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
    public ArrayList<Integer> preorderTraversal(TreeNode A) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        if(A==null){
            return al;
        }
        Stack<TreeNode> s=new Stack<TreeNode>();
        TreeNode current=A;
        s.push(current);
        while(!s.isEmpty()){
            TreeNode temp=s.peek();
            al.add(s.pop().val);
            if(temp.right!=null){
                s.push(temp.right);
            }
            if(temp.left!=null){
                s.push(temp.left);
            }
        }
        return al;
    }
}
