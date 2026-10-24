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

    static void helper(TreeNode root,int target,int sum,List<Integer> list,List<List<Integer>> ans){
        if(root == null) return;
        if(root.right==null && root.left==null && sum+root.val == target){
            list.add(root.val);
            ans.add(new ArrayList<>(list));
            list.remove(list.size()-1);
            return;
        }
        list.add(root.val);
        helper(root.left,target,sum+root.val,list,ans);
        helper(root.right,target,sum+root.val,list,ans);
        list.remove(list.size()-1);

    }
 
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {

        List<Integer> list = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        helper(root,targetSum,0,list,ans);

        return ans;
    }
}