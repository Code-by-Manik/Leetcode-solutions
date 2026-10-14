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
    static void helper(TreeNode root,List<String> ans,String s){
        if(root == null) return;


        s+=""+root.val+"->";


        if(root.left == null && root.right==null){
            if(!ans.contains(s)){
                s = s.substring(0,s.length()-2);
            ans.add(s);
            }
            return;
        }

        helper(root.left,ans,s);
        helper(root.right,ans,s);


    }
    public List<String> binaryTreePaths(TreeNode root) {
        if(root==null) new ArrayList<>();

        List<String> list = new ArrayList<>();
        
        helper(root,list,"");

        return list;
    }
}