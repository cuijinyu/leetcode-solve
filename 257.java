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
    public List<String> binaryTreePaths(TreeNode root) {
        List <String> result = new ArrayList<>();
        if(root==null){
            return result;
        }
        dfs(result,root,String.valueOf(root.val));
        return result;
    }
    public static List<String> dfs(List<String> result,TreeNode root,String tempString){
        if(root.left==null&&root.right==null){
            result.add(tempString);
        }
        if(root.left!=null){
            dfs(result,root.left,tempString+"->"+root.left.val);
        }
        if(root.right!=null){
            dfs(result,root.right,tempString+"->"+root.right.val);
        }
        return result;
    }
}