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
    
    static void l_r(TreeNode root,int curr,int target,List<Integer> ans){
        if(root==null) return;
        
        if(curr==target){
            ans.add(root.val);
            return;
        }
        
        
        
        l_r(root.left,curr+1,target,ans);
        l_r(root.right,curr+1,target,ans);
        
    }

    static void r_l(TreeNode root,int curr,int target,List<Integer> ans){
        if(root==null) return;
        
        if(curr==target){
            ans.add(root.val);
            return;
        }
        
        
        r_l(root.right,curr+1,target,ans);        
        r_l(root.left,curr+1,target,ans);
        
    }


    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        if(root == null) return new ArrayList<>();

        List<List<Integer>> ans = new ArrayList<>();

        int level = levels(root);

        for(int i=1;i<=level;i++){
            List<Integer> list = new ArrayList<>();

            if(i%2!=0){
                l_r(root,1,i,list);
                ans.add(list);
            }
            else{
                r_l(root,1,i,list);
                ans.add(list);
            }
        }

        return ans;
        
    }
}