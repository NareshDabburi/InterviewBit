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
    public ArrayList<Integer> postorderTraversal(TreeNode A) {
        ArrayList<Integer>al=new ArrayList<Integer>();
        while(A==null){
            return al;
        }
        Stack<TreeNode> s1= new Stack<TreeNode>();
        Stack<TreeNode> s2= new Stack<TreeNode>();
        TreeNode current=A;
        s1.push(current);
        while(!s1.isEmpty()){
            TreeNode temp=s1.peek();
            s2.push(s1.pop());
            if(temp.left!=null){
                s1.push(temp.left);
            }
            if(temp.right!=null){
                s1.push(temp.right);
            }
        }
        while(!s2.isEmpty()){
            al.add(s2.pop().val);
        }
        return al;
    }
}
