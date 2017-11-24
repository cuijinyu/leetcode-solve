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
    List solutionlist=new LinkedList<Integer>();
    public List<Integer> inorderTraversal(TreeNode root) {
        inorder(root);
        return solutionlist;
    }
    public void inorder(TreeNode root){
        if(root==null){
            return;
        }
        if(root.left!=null){
            inorderTraversal(root.left);
        }
        solutionlist.add(root.val);
        if(root.right!=null){
            inorderTraversal(root.right);
        }
    }
}