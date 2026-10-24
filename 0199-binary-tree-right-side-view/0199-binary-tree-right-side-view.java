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
        if(root==null) return 0;

        return 1+Math.max(levels(root.left),levels(root.right));
    }

    static void level_order(TreeNode root,List<Integer> ans,int curr,int level){
        if(root==null) return;
        
        if(curr == level){
            ans.set(curr,root.val);
            return;
        }

        level_order(root.left,ans,curr+1,level);
        level_order(root.right,ans,curr+1,level);
        
    }

    static void nth_level(TreeNode root,List<Integer> ans){
        int n = levels(root);

        for(int i=0;i<n;i++){
            level_order(root,ans,0,i);
        }

    }

    public List<Integer> rightSideView(TreeNode root) {

        int n = levels(root);
        List<Integer> ans = new ArrayList<>(Collections.nCopies(n,0));

        nth_level(root,ans);
        return ans;

    }
}