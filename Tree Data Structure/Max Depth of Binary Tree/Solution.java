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
    public int maxDepth(TreeNode A) {
        if(A==null){
            return 0;
        }
        TreeNode current=A;
        int h=0;
        int node_count=0;
        Stack<TreeNode> s= new Stack();
        s.push(current);
        node_count=s.size();
        while(true){
            node_count=s.size();
            if(node_count==0){
                return h;
            }
            h++;
            
            while(node_count>0){
                TreeNode temp = s.pop();
                
                if(temp.left!=null){
                    s.push(temp.left);
                }
                if(temp.right!=null){
                    s.push(temp.right);
                }
                node_count--;
            }
            
        }
    }
}
