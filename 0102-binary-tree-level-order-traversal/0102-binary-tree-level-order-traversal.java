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
    static int levels(TreeNode root){
        if(root == null) return 0;
        
        return 1 + Math.max(levels(root.left),levels(root.right));
        
    }
    
    static void triversal(TreeNode root,int curr,int target,List<Integer> ans){
        if(root==null) return;
        
        if(curr==target){
            ans.add(root.val);
            return;
        }
        
        
        
        triversal(root.left,curr+1,target,ans);
        triversal(root.right,curr+1,target,ans);
        
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null) return new ArrayList<>();
        
        int level = levels(root);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=1;i<=level;i++){
            List<Integer> list = new ArrayList<>();

            triversal(root,1,i,list);

            ans.add(list);
        }
        
        return ans;
    }
}